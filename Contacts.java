    import java.util.HashMap;
    import ecs100.*;
import java.awt.Color;
/**
 * Holds all of the contacts in a HashMap
 *
 * @author Snigdha
 * @version 1/06/2021
 */
public class Contacts
{
    private HashMap<Integer, Person> contactDetails;
    private int currContactId; // mr ny i dont actually get why we need this 
    private int iconId = 1; 
    private boolean hidden = false; // for hiding contact details

    /**
     * Constructor for objects of class Contacts
     */
    public Contacts()
    {
        // initialise instance variables
        contactDetails = new HashMap<Integer, Person>();
        
            // Creating Books
        Person p1 = new Person("Snigdha Mundra", 220436378);
        Person p2 = new Person("Annika Munro", 21940311);
        Person p3 = new Person("Peta Symons", 210276378);
        Person p4 = new Person("Kiera Malan", 239348774);
        Person p5 = new Person("Luna Wilkes", 22038585);
        
        contactDetails.put(1, p1);
        contactDetails.put(2, p2);
        contactDetails.put(3, p3);
        contactDetails.put(4, p4);
        contactDetails.put(5, p5);
        
        this.currContactId = 5; 
    }
    
    /**
     * Prints out a list of Contacts
     */
    public void printAll() {
        // Helps to print out contacts on different lines
        int newLine = 20; 
        int section = 0; 
        
        //Clear the graphics pane before printing
        UI.clearGraphics();

        //Loop through the hashmap and print
        for (int contactId : contactDetails.keySet()) {
            
             //im sorry this looks fucking ugly
            UI.drawString("Contact " + contactId + ":" ,
                         80, (140 + section + newLine));   
            UI.drawString("Name: " + contactDetails.get(contactId).getName(),
                         80, (160 + section + newLine));
            UI.drawString("Ph Number: " + contactDetails.get(contactId).
                         getNumber(), 80, (180 + section + newLine)); 
            
            newLine = newLine + 20;
            section = section + 80;
        }
    }
   
    
    /**
     * Lets user add a contact
     */
    public void addContact(String name, int phoneNum, String imgFileName) {
        contactDetails.put(currContactId, new Person(name, phoneNum, imgFileName));
    }
    
    /**
     * Increments contact Id
     */
    public void incrementId(int incrementer){
        this.currContactId = this.currContactId + incrementer;
    }
    
    /**
     * Uses Contact Name to find their phone number
     * 
     * @param contactName contact name of person
     */
    public void findNumber(String contactName) {
        //Loop through the hashmap and if the entered value is same as name, print ph no.
        for (int contactId : contactDetails.keySet()) {
            if (contactName.equalsIgnoreCase(
                contactDetails.get(contactId).getName())) {
                UI.clearGraphics();
                iconId = contactId; 
                
                contactDetails.get(iconId).displayIcon(100, 100);
                UI.drawString("Contact " + contactId + " :", 100, 230); //make the X and Y into constants later
                UI.drawString("Name: " + contactDetails.get(contactId).getName(), 100, 250);
                UI.drawString("Ph Number: " + contactDetails.get(contactId).getNumber(), 100, 270);
                //UI.println(iconId); 
            }   
        }
    }
    
    
    
    
    /**
     * Hides Contact Details
     */
    public void hideContact() {
        UI.setColor(Color.white);
        UI.fillRect(80, 210, 300, 200);   // make these constants later
        UI.setColor(Color.black);
    }

    /**
     * Check if user has clicked on icon
     * 
     * @return hidden
     * @param action mouse click
     * @param x mouse x coord
     * @param y mouse y coord
     * 
     */
    public boolean doClick(String action, double x, double y) {
        if (action.equals("clicked")) {
            //check the location of mouse against location of icon
            if ((x >= contactDetails.get(iconId).getX()) &&
                (x <= contactDetails.get(iconId).getX() + contactDetails.get(iconId).getWidth()) &&
                (y >= contactDetails.get(iconId).getY()) &&
                (y <= contactDetails.get(iconId).getY() + contactDetails.get(iconId).getHeight())) {
                if (hidden == false) {
                    //UI.println(iconId);
                    hideContact();
                    hidden = true;
                } else if (hidden = true) { // if contact details are hidden, print again
                    //UI.println("not hidden");
                    findNumber(contactDetails.get(iconId).getName());
                    hidden = false; 
                }
            } 
        }  
        return hidden;     
    }
    
}
