package objectOrientedPrograming;
public class ObjectJanken {
    public static void main(String[] args) {
        Player murata = new Murata("村田");
        Tactics murataTactics = new RandomTactics();
        murata.setTactics(murataTactics);
        Player yamada = new Yamada("山田");
        Tactics yamadaTactics = new RandomTactics();
        yamada.setTactics(yamadaTactics);
        Judge refree = new Judge();
        refree.startJanken(murata, yamada);
    }
}
