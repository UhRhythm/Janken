package objectOrientedPrograming;

public class RandomTactics implements Tactics{
    public int readTactics() {
        double randomNum = Math.random() * 3;
        int playerhand = 0;
        if(randomNum < 1) {
            playerhand = Player.STONE;
        } else if (randomNum < 2) {
            playerhand = Player.SCISSORS;
        } else if (randomNum < 3) {
            playerhand = Player.PAPER;
        }
        return playerhand;
    }
}
