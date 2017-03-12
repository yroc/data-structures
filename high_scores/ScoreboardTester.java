`ScoreboardTester.java` represents a client that uses `GameEntry` and `Scoreboard`.
/**
 * A client class that instantiates a Scoreboard and several GameEntrys, then
 * tests the Scoreboard's add and remove methods by attempting to add and remove
 * the GameEntrys to the Scoreboard.
 */

public class ScoreboardTester
{
    public static void main(String[] args)
    {
        Scoreboard highscores = new Scoreboard(5);
        String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
        int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};

        for (int i=0; i < names.length; i++) {
            GameEntry gE = new GameEntry(names[i], scores[i]);
            System.out.println("Adding " + gE);
            highscores.add(gE);
            System.out.println(" Scoreboard: " + highscores);
        }
        System.out.println("Removing score at place " + 4);
        highscores.remove(4);
        System.out.println(highscores);
        System.out.println("Removing score at place " + 1);
        highscores.remove(1);
        System.out.println(highscores);
        System.out.println("Removing score at place " + 2);
        highscores.remove(2);
        System.out.println(highscores);
        System.out.println("Removing score at place " + 2);
        highscores.remove(2);
        System.out.println(highscores);
        System.out.println("Removing score at place " + 1);
        highscores.remove(1);
        System.out.println(highscores);
    }
}
