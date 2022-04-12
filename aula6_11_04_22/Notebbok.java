import java.util.ArrayList;

public class Notebbok {
    private ArrayList notes;

    public void storeNote(String note) {
        notes.add(note);
    }

    public int getNumberOfNotes() {
        return notes.size();
    }
}
