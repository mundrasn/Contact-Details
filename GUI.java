import ecs100.*;
/**
 * Adding buttons to the interface
 *
 * @author Snigdha Mundra
 * @version 11/06/2021
 */
public class GUI
{

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        Contacts ct = new Contacts(); 
        UI.initialise(); 
        
        UI.addButton("All Contacts", ct::printAll);
        UI.addButton("Add Contact", ct::addContact);
        
        UI.addTextField("Search", ct::findNumber);
        UI.setMouseListener(ct::doClick);
        
        UI.addButton("Clear", UI::clearPanes); 
        UI.addButton("Quit", UI::quit);
    }
}
