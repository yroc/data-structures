/** 
 * GameEntry encapsulates a single game play&mdash;a player&rsquo;s name and
 * his/her score.
 */

public class GameEntry
{
    // Instance variables
    private int score;		// the player's score
    private String name;	// the player's name

    /**
     * Constructs a GameEntry with the given name and score
     *
     * @param name The player&rsquo;s name.
     * @param score The player&rsquo;s score.
     */
    public GameEntry(String name, int score)
    {
	this.name = name;
	this.score = score;
    }

    // Access methods
    /**
     * Returns the score of this GameEntry.
     */
    public int getScore()
    {
	return this.score;
    }

    /**
     * Returns the (player) name of this GameEntry.
     */

    public String getName()
    {
	return this.name;
    }

    /**
     * Returns a string representation of this GameEntry.
     */
    public String toString()
    {
	return "(" + this.getName() + ", " + this.getScore() + ")";
	
    }
}
