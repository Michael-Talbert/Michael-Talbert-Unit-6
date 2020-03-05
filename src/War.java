

public class War {
    public int count = 0;

    public int round(Card p1Card, Card p2Card){
        if(p1Card.compareTo(p2Card)>0){
            return 1;
        } else if(p1Card.compareTo(p2Card)<0){
            return 2;
        } else
            return 0;

    }

    public void game(){
        p1.getCar
    }

    public static void main(String[] args) {
        Deck deck = new Deck();

        Player p1 = new Player(1, deck);
        Player p2 = new Player(2, deck);

        deck.shuffle();

    }
}
