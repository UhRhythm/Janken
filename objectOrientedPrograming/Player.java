package objectOrientedPrograming;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;

    private int winCount_;

    private Tactics tactics_;
    
    public Player(String name) {
        this.name_ = name;
    }

    public int showhand() 
    {   
        // double randomNum = Math.random() * 3;
        // int playerhand = 0;
        // if(randomNum < 1) {
        //     playerhand = STONE;
        // } else if (randomNum < 2) {
        //     playerhand = SCISSORS;
        // } else if (randomNum < 3) {
        //     playerhand = PAPER;
        // }
        int playerhand = tactics_.readTactics();
        return playerhand;
    }

    public void notiFyResult(boolean result) {
        if(result) {
            winCount_++;
        }
    }
    public int getWinCount() {
        return winCount_;
    }

    public String getName() {
        return name_;
    }
    public void setTactics(Tactics tactics) {
        tactics_ = tactics;
    }
}

// Player person1 = new Player("レンタルぶさいく");
