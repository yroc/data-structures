/** GameEntry encapsulates a completed game by a player. It holds the
 * player's name and his score (which may or may not be a high score),
 * along with getter methods and a toString method.
 */

public class GameEntry
{
    // Instance variables
    private int score;		// the player's score
    private String name;	// the player's name

    // Constructor
    public GameEntry(int score, String name)
    {
	this.score = score;
	this.name = name;
    }

    // Methods
    public int getScore()
    {
	return this.score;
    }

    public String getName()
    {
	return this.name;
    }

    public String toString()
    {
	return "(" + this.name + ", " + this.score + ")";
	
    }
}
