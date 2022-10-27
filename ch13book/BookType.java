package ch13book;
public enum BookType {
    ADVENTURE("ADVENTURE"), FANTASY("FANTASY"), NONFICTION("NONFICTION"), HORROR("HORROR"), CLASSICS("CLASSICS");

    private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}