
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

    public
}
