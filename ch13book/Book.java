package ch13book;
public class Book {
    Author author;
    String title;
    BookType booktype;
    int currentPage;

    public Book(Author author, String title, BookType booktype, int currentPage) {
        this.author = author;
        this.title = title;
        this.booktype = booktype;
        this.currentPage = currentPage;
        
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return booktype.getDescription();
    }

    public void setType(BookType booktype) {
        this.booktype = booktype;
    }
    
    public int getPage() {
		return currentPage;
	}

	public void setPage(int page) {
		this.currentPage = page;
	}

    public void getInfo() {
        System.out.println("Book: " + author.name + " , " + title + " , " + booktype.getDescription() + " , " + currentPage);
    }
}