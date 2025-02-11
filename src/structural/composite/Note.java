package structural.composite;

public class Note implements MusicalItem{

    public final char note;

    public Note(char note){
        this.note = note;
    }

    @Override
    public void play(){
        System.out.println(note);
    }
}
