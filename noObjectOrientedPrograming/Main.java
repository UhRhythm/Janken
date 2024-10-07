class Main {
    public static void main(String[] args) {
        System.out.println("【ジャンケン開始】\n");
        final int STONE = 0;
        final int SCISSORS = 1;
        final int PAPER = 2; // staticを追加
        double randomNum = 0;
        int player1Hand = 0;
        int player2Hand = 0;
        int playe1WinCount = 0;
        int playe2WinCount = 0;
        String result = "";
        String player1HandString = "";
        String player2HandString = "";
        // 0以上3未満の小数として乱数を得る
        for(int match = 0; match < 3; match++) {
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            player1Hand = STONE;
            player1HandString = "グー";
        } else if (randomNum < 2) {
            player1Hand = SCISSORS;
            player1HandString = "チョキ";
        } else if (randomNum < 3) {
            player1Hand = PAPER;
            player1HandString = "パー";
        }
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            player2Hand = STONE;
            player2HandString = "グー";
        } else if (randomNum < 2) {
            player2Hand = SCISSORS;
            player2HandString = "チョキ";
        } else if (randomNum < 3) {
            player2Hand = PAPER;
            player2HandString = "パー";
        }
        if(
            (player1Hand == STONE && player2Hand == SCISSORS) || 
            (player1Hand == SCISSORS && player2Hand == PAPER) ||
            (player1Hand == PAPER && player2Hand == STONE)) 
        {   
            result = "プレイヤー1の勝ち";
            playe1WinCount++;
        } else if (
            (player2Hand == STONE && player1Hand == SCISSORS) || 
            (player2Hand == SCISSORS && player1Hand == PAPER) ||
            (player2Hand == PAPER && player1Hand == STONE)
        ) {
            result = "プレイヤー2の勝ち";
            playe2WinCount++;
        } else 
        {
            result = "あいこ";
        }
        System.out.println(match + 1);
        System.out.println("プレイヤー１");
        System.out.println(player1HandString);
        System.out.println("プレイヤー２");
        System.out.println(player2HandString);
        System.out.println(result);
        }
        if(playe1WinCount > playe2WinCount) {
            System.out.println("プレイヤー1の総合勝ち");
        } else if (playe2WinCount > playe1WinCount) {
            System.out.println("プレイヤー2の総合勝ち");
        } else  {
            System.out.println("引き分け");
        }
    }
}