package rummy;

import java.util.Vector;

import game.GamePlayer;

/**
 *
 * @author Admin
 */
public class RummyMoveMeld extends RummyMoveAction {
    private Vector<Card> meld= null;

    /**
     *
     * @param source
     * @param meld
     */
    public RummyMoveMeld(GamePlayer source, Vector<Card> meld) {
        super(source);
        this.meld = meld;
    }

    /**
     *
     * @return
     */
    public Vector<Card> getMeld(){
        return this.meld;
    }
}