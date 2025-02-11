package structural.composite;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Note a = new Note('A');
        Note b = new Note('B');
        Note c = new Note('C');
        Note d = new Note('D');
        Note e = new Note('E');
        Note f = new Note('F');
        Note g = new Note('G');

        Song song = new Song();
        song.addNote(a);
        song.addNote(b);
        song.addNote(c);
        song.addNote(d);
        song.addNote(e);
        song.addNote(f);
        song.addNote(g);

//        song.getNotes().get(0).play();
//        song.getNotes().get(1).play();
//        song.getNotes().get(2).play();
//        song.getNotes().get(3).play();
//        song.getNotes().get(4).play();
//        song.getNotes().get(5).play();
//        song.getNotes().get(6).play();

        song.play();



    }
}
