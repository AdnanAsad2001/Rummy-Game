package game;

/**
 * A kind of GameState that contains a single integer as its only state.
 * 
 * 
 */
public class IntGameState extends GameState {
    // the integer value that constitutes this object's state
    private int num;

    /**
     * Constructor for objects of class IntGameState
     * 
     * @param i
     */
    public IntGameState(int n) {
        // set the state value from the parameter
        num = n;
    }

    /**
     * Gets the object's state
     * 
     * @return the object's state 
     */
    public int getNum() {
        // put your code here
        return num;
    }
    
    /**
     * Method for converting object to a string
     * 
     * @return the object, converted to string format
     */
    @Override
    public String toString() {
        // convert the state to a string
        return ""+num;
    }
}
