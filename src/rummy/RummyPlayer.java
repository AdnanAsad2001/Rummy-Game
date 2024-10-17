package rummy;

import java.util.*;

import game.*;

/**
 * Interface for RummyPlayers. 
 */
interface RummyPlayer extends GamePlayer {
    public void setHand(Vector<Card> newHand);
    public Vector<Card> getHand();
}