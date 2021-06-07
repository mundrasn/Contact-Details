import ecs100.*;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        UI.addButton("Clear", UI::clearGraphics);
        UI.addButton("Quit", UI::quit);
    }
}
