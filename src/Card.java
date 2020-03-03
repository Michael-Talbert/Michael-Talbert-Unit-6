public class Card {
    private int suite;
    private int value;

    public Card(int suite, int value){
        this.suite=suite;
        this.value=value;
    }


    public int getValue(){
        return value;
    }

    public int getSuite(){
        return suite;
    }



}
