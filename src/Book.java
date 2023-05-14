import java.util.Objects;
public class Book {
    private String name;
    private String author;
    private  int yearOfPublication;
    public Book(String name, String author, int  yearOfPublication) {
        this.name = name;
        this.author =  author;
        this.  yearOfPublication = yearOfPublication ;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public  int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString() {
        return " Имя: " +  name  +  "/  Автор: " +  author +"/  Год публикации: " +  yearOfPublication;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getYearOfPublication());
    }





}

