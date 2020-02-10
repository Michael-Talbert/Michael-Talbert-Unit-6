
public class MusicLibrary {
    private Album[] library;

    public MusicLibrary(){
        library = new Album[10];
    }



    public boolean add(Album album) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = album;
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        String result = "";

        for(Album a : library){
            if (a != null) {
                result += a.toString() + "\n";
            }
        }
        return result;
    }



    public void remove(int index){
        library[index] = null;
    }




    public int findTitle(String title){
        for (int i = 0; i<library.length; i++){
            if(library[i] != null && library[i].getTitle().equals(title)){
               return i;
            }
        }
        return -1;
    }


    public int findArtist(String artist){
        for (int i = 0; i<library.length; i++){
            if(library[i] != null && library[i].getArtist().equals(artist)){
                return i;
            }
        }
        return -1;
    }



    public Album getAlbum(int index){
        return library[index];
    }

    public void sortTitle(){
        String temp;
        int min;

        for (int i=0; i<library.length; i++){
            min = i;
            for (int scan = i+1; scan < library.length; scan++){
                if (library[scan].getTitle().compareTo(library[min].getTitle()) > 0 ){
                    min = scan;
                }
            }
        }
    }
}
