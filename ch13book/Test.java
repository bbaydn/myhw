package ch13book;
public class ReaderTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.printBookTypes();
        test.changeBookTypes();
        test.printBookTypes();
        System.out.println();

        Reader reader = new Reader("Busra","Aydin", 25, 'F');
        reader.getInfo();

        Author author = new Author("Hakan Gunday");
        author.getInfo();

        Book book = new Book(author, "Kinyas ile Kayra", BookType.CLASSICS, 724);
        book.getInfo();

    }

    private void changeBookTypes() {
        System.out.println("Changing.....");
        BookType.ADVENTURE.setDescription("ADVENTURE");
        BookType.FANTASY.setDescription("FANTASY");
        BookType.NONFICTION.setDescription("NONFICTION");
        BookType.CLASSICS.setDescription("CLASSICS");
        BookType.HORROR.setDescription("HORROR");
    }

    public void printBookTypes() {
        System.out.print("Book Types : ");

        for (BookType bookType : BookType.values()) {
            System.out.print(bookType.getDescription() + ", ");
        }
        System.out.println();
    }

}