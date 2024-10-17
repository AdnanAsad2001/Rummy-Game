package rummy;

import game.GamePlayer;

/**
 * This class represents a player's action to discard a card.
 * It saves the index of the card to discard.
 * 
 *
 */
public class RummyMoveDiscard extends RummyMoveAction {
    private int index;

    /**
     *
     * @param source
     * @param index
     */
    public RummyMoveDiscard(GamePlayer source, int index) {
        super(source);
        this.index = index;
    }

    /**
     *
     * @return
     */
    public int getDiscardIndex(){
        return this.index;
    }
}