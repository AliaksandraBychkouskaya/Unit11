package by.tr.mod11;

public class NotebookTesting {
    public static void main(String[] args) {
        Notebook myNoteBook = new Notebook();
        myNoteBook.add(new Note("content1", new Data(1,1,2001)));
        myNoteBook.add(new Note("content2", new Data(2,2,2001)));
        myNoteBook.add(new Note("content3", new Data(3,3,2001)));
        Note findNote = myNoteBook.findByContent("content2");
        if(findNote != null){
            System.out.println(findNote.toString());
        }
        System.out.println(myNoteBook.toString());
    }

}

