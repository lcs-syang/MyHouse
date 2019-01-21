/** 
* Creates an instance of a Tree.
 *
 * @author Selena Yang
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle Tree1;
    private Triangle Tree2;
    private Triangle Tree3;
    private Square Tree4;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        Tree1 = new Triangle();
        Tree2 = new Triangle();
        Tree3 = new Triangle();
        Tree4 = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        Tree1.changeColor("green");
        Tree1.makeVisible();
        Tree1.changeSize(50, 100);
        Tree1.moveVertical(50);
        Tree1.moveHorizontal(x);
        Tree1.moveVertical(y);
       
     
        
        //
        Tree2.changeColor("green");
        Tree2.makeVisible();
        Tree2.moveVertical(80);
        Tree2.changeSize(50,100);
        Tree2.moveHorizontal(x);
        Tree2.moveVertical(y);
        
        //
        Tree3.changeColor("green");
        Tree3.moveVertical(110);
        Tree3.makeVisible();
        Tree3.changeSize(50, 100);
        Tree3.moveHorizontal(x);
        Tree3.moveVertical(y);
        
        //
        Tree4.changeColor("black");
        Tree4.moveVertical(125);
        Tree4.moveHorizontal(-30);
        Tree4.makeVisible();
        Tree4.changeSize(40);
        Tree4.moveHorizontal(x);
        Tree4.moveVertical(y);
        
        //
        
        
        // translate the tree to the specified location
        
        
    }
    
}