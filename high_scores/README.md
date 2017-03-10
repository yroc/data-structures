## Project Description
A Java application that stores a list of video game high scores (source: <cite>Data Structures and Algorithms in Java</cite>, p. 104).
## Scoreboard.java Notes
`private GameEntry[] board;`

Declares a variable called `board` that holds an address to an array of `GameEntry` objects. Note that this is merely a declaration&mdash;`board` does not, at this point, hold the address to a `GameEntry` array. Actually, the way Java works, `board` is, at this point, set to `null`.

`this.board = new GameEntry[capacity];`

Instantiates a GameEntry array object and assigns its address to `board`. *Now* `board` points to a GameEntry array.




