import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>;


    public Deck(){
        for(int i = 0; i<3; i++){
            for (int x = 0; x<12; x++){
                deck.add(new Card(i, x));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

}
