package object_and_class;

public class Author {
    private String author;


    public Author (String author) {
        this.author = author;
    }
    public String getAuthorName() {
        return this.author;
    }

    @Override
    public String toString(){
        return "aвтор " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Author c = (Author) other;
        return author.equals(c.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(author);
    }
}
