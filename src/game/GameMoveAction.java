package game;

/**
 * A GameMoveAction is an action that is a "move" in a game (as opposed
 * to an administrative action, like "quit game").
 * 
 * 
 */
public abstract class GameMoveAction extends GameAction {

    /**
     * constructor for GameMoveAction
     *
     * @param source the player who created the action
     */
    public GameMoveAction(GamePlayer source) {
        // invoke superclass constructor to initialize the source
        super(source);
    }

    /**
     * tells whether the action is a "move" action (e.g., put an 'X' on
     * top-left square), as opposed to an administrative action (e.g.,
     * quit game)
     *
     * @return true if the action is a "move" action
     */
    @Override
    public boolean isMove() {
        // return "true", since we represent a "move" action
        return true;
    }
}