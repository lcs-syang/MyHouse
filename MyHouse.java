
/**
 * It draws a complete house on screen using individual shapes
 *
 * @author Selena Yang
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variablews - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square door1;
    private Square door2;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    /**
     * The job of a constructer is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        door1 = new Square();
        door2 = new Square();
        tree1 = new Tree(100,100);
        tree2 = new Tree(50,100);
        tree3 = new Tree(200,400);
        tree4 = new Tree(400,200);
        
        drawHouse();
    }

    /**
     * Draw the house for us.
     */
    public void drawHouse()
    {
        // put your code here
        sun.moveHorizontal(230);
        sun.moveVertical(-100);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.makeVisible();
        
        
        //Draw base
        base.changeSize(100);
        base.makeVisible();
        base.changeColor("red");
        base.moveHorizontal(50);
        
        //Draw the roof
        roof.changeColor("green");
        roof.makeVisible();
        roof.changeSize(50, 120);
        roof.moveVertical(-10);
        roof.moveHorizontal(110);
        
        //Draw door
        door1.makeVisible();
        door2.makeVisible();
        door1.changeColor("black");
        door2.changeColor("black");
        door1.changeSize(30);
        door2.changeSize(30);
        door1.moveHorizontal(60);
        door2.moveHorizontal(60);
        door1.moveVertical(70);
        door2.moveVertical(50);
        
        
        
    }
}