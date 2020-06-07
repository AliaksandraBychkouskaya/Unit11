package by.tr.mod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Notebook {
    private List<Note> notes = new ArrayList<Note>();

    public Notebook() {
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void add(Note note) {
        notes.add(note);
    }

    public boolean delete(Note note) {
        return notes.remove(note);
    }

    public Note findByContent(String content) {
        for (Note note : notes) {
            if (note.getNote().equals(content)) {
                return note;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(notes, notebook.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
