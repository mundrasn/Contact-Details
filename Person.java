import ecs100.*; 
/**
 * Write a description of class Person here.
 *
 * @author Snigdha
 * @version 1/06/2021
 */
public class Person
{
    // instance variable
    
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
     */
    public Person(String nm, int nmbr, String img){
        // initialise instance variables
        //this.id = id; 
        this.name = nm; 
        this.phoneNum = nmbr; 
        this.image = img; 
    }
   
    /**
     * Constructer overloading
     * Set default image to obj
     */
    public Person(String nm, int nmber){
        this(nm, nmber, DEFAULT_IMAGE);
    }
    
    /**
     * Getter for id
     *
     * @return int the id 
     */
    //public int getId(){
    //    return this.id; 
    //}
    
    /**
     * Getter for name
     *
     * @return String the name 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Getter for phoneNum
     *
     * @return int the phoneNum 
     */
    public int getNumber(){
        return this.phoneNum;
    }
    
    public double getX(){
        return this.locX;
    }
    
    public double getY(){
        return this.locY;
    }
    
    public double getWidth(){
        return this.WIDTH;
    }
    
    public double getHeight(){
        return this.HEIGHT;
    }
        
    /**
     * Display the image on the GUI
     */
    public void displayIcon(){
        //double locX = 100;
        //double locY = 80;
        //final double WIDTH = 120;
        //final double HEIGHT = 100;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
    
    public void iconClicked(String action, double x, double y){

        if (action.equals("clicked")){
            //check the location of mouse against location of icon
            if ((x >= getX()) &&
                (x <= getX() + getWidth()) &&
                (y >= getY()) &&
                (y <= getY() + getHeight())){
                    UI.clearGraphics();
                } else {
                    // do nothing lol
                }
            } 
        //return clicked;     
    }   
}
