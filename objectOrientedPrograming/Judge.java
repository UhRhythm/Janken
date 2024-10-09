package objectOrientedPrograming;

public class Judge {
    /** 
    ジャンケンを開始する
    * @param player1 判定対象プレイヤー1
    * @param player2 判定対象プレイヤー2
    */
    public void startJanken(Player player1, Player player2) {
        // ジャンケンの開始を宣言する
        System.out.println("【ジャンケン開始】\n");
        // ジャンケンを三回行う
        for( int cnt = 0; cnt < 3; cnt++){
            // 何回戦目かを表示する
            System.out.println(" "+ (cnt + 1) + "回戦目");
            Player winner = judgeJanken(player1, player2);
            if (winner != null) {
                System.out.println("\n" + winner.getName() + "勝ちました！");
                winner.notiFyResult(true);
            } else {
                System.out.println("あいこです！");
            }
        }
        // ジャンケンの開始を宣言する
        System.out.println("【ジャンケン終了です】\n");
        Player result = finalJudgeWinner(player1, player2);
        if(result != null ) {
            System.out.println(player1.getWinCount() + "対" + player2.getWinCount() + result.getName() + "の勝ちです！" );
        } else {
            System.out.println("引き分けです");
        }
    }

    private Player judgeJanken(Player player1, Player player2) {
        Player winner = null;
        int player1Hand = player1.showhand();
        int player2Hand = player2.showhand();
        // プレイヤー1の手を表示する
        PrintHand(player1Hand);
        System.out.println(" VS ");
        // プレイヤー2の手を表示する
        PrintHand(player2Hand);
        System.out.println("\n");
        // プレイヤー１が勝つ場合
        if(
            (player1Hand == Player.STONE && player2Hand == Player.SCISSORS) || 
            (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER) ||
            (player1Hand == Player.PAPER && player2Hand == Player.STONE)) 
        {   
            winner = player1;
        } else if (
            (player2Hand == Player.STONE && player1Hand == Player.SCISSORS) || 
            (player2Hand == Player.SCISSORS && player1Hand == Player.PAPER) ||
            (player2Hand == Player.PAPER && player1Hand == Player.STONE)
        ) {
            winner = player2;
        }
        return winner;
    }

    private Player finalJudgeWinner(Player player1, Player player2) {
        int player1WinCount = player1.getWinCount();
        int playe2WinCount = player2.getWinCount();
        Player winner = null;
        if(player1WinCount > playe2WinCount) {
            winner = player1;
        } else {
            winner = player2;
        }
        return winner;
    }

    private void PrintHand(int playerHand) {
        switch (playerHand) {
            case Player.STONE:
                System.out.println("グー");
                break;
            case Player.SCISSORS:
                System.out.println("チョキ");
                break;
            case Player.PAPER:
                System.out.println("パー");
                break;            
            default:
                break;
        }
    }
}
