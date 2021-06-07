import java.util.HashMap;
import ecs100.*;
/**
 * Holds all of the contacts in a HashMap
 *
 * @author Snigdha
 * @version 1/06/2021
 */
public class Contacts
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Person> contactDetails;
    private int currContactId; // mr ny i dont actually get why we need this 

    /**
     * Constructor for objects of class Contacts
     */
    public Contacts()
    {
        // initialise instance variables
        contactDetails = new HashMap<Integer, Person>();
        
        // Creating Books
        Person p1 = new Person("Snigdha Mundra", 022043637);
        Person p2 = new Person("Annika Munro", 0213);
        Person p3 = new Person("Peta Symons", 5644);
        Person p4 = new Person("Kiera Malan", 4323);
        Person p5 = new Person("Luna Wilkes", 8585);
        
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
    public void printAll(){
        //Clear the graphics pane before printing
        UI.clearGraphics();
        
        
        //Loop through the hashmap and print
        for (int contactId : contactDetails.keySet()){
            contactDetails.get(contactId).displayIcon();
            UI.drawString("Contact " + contactId + ":" , 50, 100);
            UI.drawString("Name: " + contactDetails.get(contactId).getName(), 50, 120);
            UI.drawString("Ph Number: " + contactDetails.get(contactId).getNumber(), 50, 140);      
        }
    }
    
    /**
     * Lets user add a contact
     */
    public void addContact(){
        //Ask the user for details
        String name = UI.askString("Enter Full Name: ");
        int phoneNum = UI.askInt("Enter Ph Number: ");  /*# ff*/
        
        String imgFileName = UIFileChooser.open("Choose Image File: ");
        
        // Increment the contact ID counter and add the new contact to hashmap
        currContactId++;
        contactDetails.put(currContactId, new Person(name, phoneNum));
    }
    
    /**
     * Uses Contact Name to find their phone number
     */
    public void findNumber(String contactName){
        //Loop through the hashmap and if the entered value is same as name, print ph no.
        for (int contactId : contactDetails.keySet()){
            if (contactName.equalsIgnoreCase(contactDetails.get(contactId).getName())){
                UI.clearGraphics();
                
                UI.drawString("Contact " + contactId + " :", 60 ,100); //make the X and Y into constants later
                UI.drawString("Name: " + contactDetails.get(contactId).getName(), 60, 120);
                UI.drawString("Ph Number: " + contactDetails.get(contactId).getNumber(), 60, 140);
            }
        }
    }

}
