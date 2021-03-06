package roulette.bets;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet
{
    private String myDescription;
    private int myOdds;


    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds)
    {
        myDescription = description;
        myOdds = odds;
    }


    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds ()
    {
        return myOdds;
    }


    /**
     * @return name of this kind of bet
     */
    public String getDescription ()
    {
        return myDescription;
    }


    /**
     * @return string representation of this bet
     */
    public String toString ()
    {
        return getDescription();
    }


    /**
     * Place the given bet by prompting the user for the specific information
     * need to complete the given bet.
     */
    public abstract void place ();


    /**
     * Checks if the given bet is won or lost given the user's choice and the result
     * of spinning the wheel.
     *
     * @param betChoice specific value user chose to try to win the bet
     * @param wheel information needed to check if bet won or lost
     */
    public abstract boolean isMade (String color, int number);
}
