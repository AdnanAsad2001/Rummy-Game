package rummy;

import game.GamePlayer;

/**
 * Class to represent a player's draw. Player chooses stock or discard pile.
 * 
 *
 */
public class RummyMoveDraw extends RummyMoveAction {
    enum DeckType {STOCK, DISCARD};
    DeckType moveDeckType;

    /**
     *
     * @param gp
     * @param dt
     * @param d
     */
    public RummyMoveDraw(GamePlayer source, DeckType d ) {
        super(source);
        moveDeckType = d;
    }
}