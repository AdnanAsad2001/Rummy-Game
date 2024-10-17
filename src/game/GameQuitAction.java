package game;

/**
 * A GameQuitAction is an action that is sent by a player to the game
 * to tell it that it wants to quit the game.
 * 
 * 
 */
public class GameQuitAction extends GameAction {

    /**
     * Constructor for GameQuitAction
     *
     * @param gp
     */
    public GameQuitAction(GamePlayer p) {
        // invoke superclass constructor to initialize the source
        super(p);
    }

    /**
     * Tells whether the action is a "quit game" action
     *
     * @return true if the action is a "quit game" action
     */
    @Override
    public boolean isQuitRequest() {
        return true;
    }
}