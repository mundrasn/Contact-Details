    import ecs100.*;
    /**
     * Adding buttons to the interface
     *
     * @author Snigdha Mundra
     * @version 11/06/2021
     */
    public class GUI
    {
        private Contacts ct; //declare contacts instance
        /**
         * Constructor for objects of class GUI
         */
        public GUI()
        {
            // initialise instance variables
            ct = new Contacts(); 
            UI.initialise(); 
            
            UI.addButton("All Contacts", ct::printAll);
            UI.addButton("Add Contact", this::addContact);
            
            UI.addTextField("Search", ct::findNumber);
            UI.setMouseListener(ct::doClick);
            
            UI.addButton("Clear", UI::clearPanes); 
            UI.addButton("Quit", UI::quit);
        }
        
        /**
         * Adds a contact to the map
         */
        public void addContact(){
            final int INCREMENT = 1; 
            
            //Ask the user for details
            String name = UI.askString("Enter Full Name: ");
            int phoneNum = UI.askInt("Enter Ph Number: "); 
            
            String imgFileName = UIFileChooser.open("Choose Image File: ");
            
            // Increment the contact ID counter and add the new contact to hashmap
            ct.incrementId(INCREMENT);
            ct.addContact(name, phoneNum, imgFileName);
        }
    
}
