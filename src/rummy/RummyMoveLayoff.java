package rummy;

import javax.swing.JButton;

import game.GamePlayer;

/**
 *
 * @author Admin
 */
public class RummyMoveLayoff extends RummyMoveAction {
    private JButton meldButton = null;
    private int cardIndex = -1;
    private int meldIndex = -1;

    /**
     *
     * @param meldButton
     * @param jb
     * @param i
     * @param cardIndex
     */
    public RummyMoveLayoff(GamePlayer source, JButton meldButton, int meldIndex, int cardIndex) {
        super(source);
        this.meldButton = meldButton;
        this.cardIndex = cardIndex;
        this.meldIndex = meldIndex;
    }

    /**
     *
     * @return
     */
    public JButton getMeldButton(){
        return this.meldButton;
    }

    /**
     *
     * @return
     */
    public int getCardIndex(){
        return this.cardIndex;
    }

    /**
     *
     * @return
     */
    public int getMeldIndex(){
        return this.meldIndex;
    }
}