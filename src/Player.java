import java.util.ArrayList;

public class Player {
    private int id;
    private ArrayList<Card> hand;
    private Deck theDeck;

    public Player(int id, Deck deck){
        this.id = id;
        theDeck = deck;
        hand = new ArrayList<>();
    }

    public void drawCard(){
        hand.add(theDeck.getDeck().remove(0));
    }

    public void initHand(int numCards){
        for (int i = 0; i < numCards; i++) {
            drawCard();
        }
    }

    public String toString(){
        return "Player " + id + ": " + hand;
    }

    public String getCard(int count){
        return hand(count).getSuit();
    }



}
