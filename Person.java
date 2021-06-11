import ecs100.*; 
/**
 * Person Support Class 
 * A Person has a name, phone number, and image.
 *
 * @author Snigdha
 * @version 1/06/2021
 */
public class Person
{
    // instance variables
    private String name; //should i do first name, last name?
    private int phoneNum; 
    private String image;
    private static final String DEFAULT_IMAGE = "default.jpg";
    
    private double locX = 100;
    private double locY = 80;
    final double WIDTH = 120;
    final double HEIGHT = 100;
    
    /**
     * Constructor for objects of class Person
     * 
     * @param nm name of person
     * @param nmbr phone numbr of person
     * @param img icon for person
     */
    public Person(String nm, int nmbr, String img) {
        // initialise instance variables
        this.name = nm; 
        this.phoneNum = nmbr; 
        this.image = img; 
    }
   
    /**
     * Constructer overloading
     * Set default image to obj
     * 
     * @param nm name of person
     * @param nmbr phone number of person
     */
    public Person(String nm, int nmbr) {
        this(nm, nmbr, DEFAULT_IMAGE);
    }
    
    /**
     * Getter for name
     *
     * @return String the name 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Getter for phoneNum
     *
     * @return int the phoneNum 
     */
    public int getNumber() {
        return this.phoneNum;
    }
    
    /**
     * Getter for icon x-value
     * 
     * @return double the x-value 
     */
    public double getX() {
        return this.locX;
    }
    
    /**
     * Getter for icon y-value
     * 
     * @return double the y-value 
     */
    public double getY() {
        return this.locY;
    }
    
    /**
     * Getter for icon width
     * 
     * @return double the width 
     */
    public double getWidth() {
        return this.WIDTH;
    }
    
    /**
     * Getter for icon height
     * 
     * @return double the height 
     */
    public double getHeight() {
        return this.HEIGHT;
    }
        
    /**
     * Display the image on the GUI
     * 
     * @param x X-value of icon
     * @param y Y-value of icon
     */
    public void displayIcon(double x, double y) {
        this.locX = x;
        this.locY = y;

        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
    
}
