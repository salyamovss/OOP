package market;

public class Book extends Product{
    private long id;
    private String authorFullName;



    public Book(long id, String authorFullName) {
        this.id = id;
        this.authorFullName = authorFullName;
    }

    public Book() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Book{" +
               "id=" + id +
               ", authorFullName='" + authorFullName + '\'' +
               '}';
    }
}
