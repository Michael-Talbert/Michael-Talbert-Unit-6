import java.util.ArrayList;

public class ArrayListPractice {

    public void removeZeros(ArrayList list) {
        for(int i = 0; i<list.size();i++ ){
            if(list.get(i).equals(0)){
                list.remove(i);
            }
        }
    }

    public int countLetters(ArrayList list) {
        int count;
        for (int i = 0; i < list.size(); i++){
            count++;
        }
    }


}
