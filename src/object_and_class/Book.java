package object_and_class;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book (String bookName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return "Книга " + bookName + ", год выпуска " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book c = (Book) other;
        return bookName.equals(c.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
