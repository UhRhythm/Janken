package objectOrientedPrograming;
public class ObjectJanken {
    public static void main(String[] args) {
        Player player1 = new Player("村田");
        Player player2 = new Player("土岡");
        Judge refree = new Judge();
        refree.startJanken(player1, player2);
    }
}
