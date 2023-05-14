import java.util.Objects;
public class Author {



    private String name;
    private String  surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname =  surname;
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return " Имя:  " + this.name +   "/  Фамилия:  " +  this.surname;
    }


    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getName(), author.getName()) && Objects.equals(getSurname(), author.getSurname());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

}

