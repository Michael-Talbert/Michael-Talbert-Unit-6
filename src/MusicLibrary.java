
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
}
