package rummy;

import game.GameMoveAction;
import game.GamePlayer;

/**
 *
 * @author Admin
 */
public abstract class RummyMoveAction extends GameMoveAction {

    /**
     *
     * @param source
     */
    public RummyMoveAction(GamePlayer source) {
        super(source);
    }

    @Override
    public boolean isMove(){
        return true;
    }
}