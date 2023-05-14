import javax.xml.namespace.QName;
import java.util.Objects;
public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    @Override

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {


        System.out.println("Домашняя работа № 12, 13");


        System.out.println("Задание № 1");


        System.out.println(" ");



        Book book = new Book(" Война и мир ", "  Лев Толстой", 1863);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());


        System.out.println(" ");

        Book book2 = new Book("Гранатовый браслет", "А. И. Куприн", 1911);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());

        System.out.println(" ");

        Book book3 = new Book("Преступление и наказание", "Ф.М. Достоевский ", 1867);
        System.out.println("book3.name = " + book3.getName());
        System.out.println("book3.author = " + book3.getAuthor());
        System.out.println("book3.yearOfPublication = " + book3.getYearOfPublication());

        System.out.println(" ");

        System.out.println("Изменяем год публикации с помощью сеттера");
        book.setYearOfPublication(1864);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        System.out.println(" ");

        System.out.println("Задание № 2");

        System.out.println(" ");

        Author author = new Author(" Лев", "  Толстой ");
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());

        System.out.println(" ");

        Author author2 = new Author("  Александр ", "Куприн ");
        System.out.println("author2.name = " + author2.getName());
        System.out.println("author2.surname = " + author2.getSurname());

        System.out.println(" ");

        Author author3 = new Author("Федор", "Достоевский");
        System.out.println("author3.name = " + author3.getName());
        System.out.println("author3.surname = " + author3.getSurname());

        System.out.println("**********************Задания по работе № 13*********************** ");
        System.out.println(" ");


        System.out.println("Использован метод  to String в классe Book   ");


        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(" ");


        System.out.println("Использован метод to String в классe Author  ");

        System.out.println(author);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(" ");

        System.out.println("Проверка метода (сгенерированного кодом) equals (Book) ");

        System.out.println(book.getYearOfPublication() == book.getYearOfPublication() && Objects.equals(book.getName(), book.getName()) && Objects.equals(book.getAuthor(), book.getAuthor()));
        System.out.println(book2.getYearOfPublication() == book2.getYearOfPublication() && Objects.equals(book2.getName(), book2.getName()) && Objects.equals(book2.getAuthor(), book2.getAuthor()));
        System.out.println(book3.getYearOfPublication() == book3.getYearOfPublication() && Objects.equals(book3.getName(), book3.getName()) && Objects.equals(book3.getAuthor(), book3.getAuthor()));

        System.out.println(" ");

        System.out.println("Проверка метода hashCode  (Book)");


        System.out.println(Objects.hash(book.getName(), book.getAuthor(), book.getYearOfPublication()));
        System.out.println(Objects.hash(book.getName(), book.getAuthor(), book.getYearOfPublication()));
        System.out.println(Objects.hash(book2.getName(), book2.getAuthor(), book2.getYearOfPublication()));
        System.out.println(Objects.hash(book2.getName(), book2.getAuthor(), book2.getYearOfPublication()));
        System.out.println(Objects.hash(book3.getName(), book3.getAuthor(), book3.getYearOfPublication()));
        System.out.println(Objects.hash(book3.getName(), book3.getAuthor(), book3.getYearOfPublication()));


        System.out.println(" ");



        System.out.println("Проверка метода (сгенерированного кодом) equals  (Author)");


        System.out.println(Objects.equals(author.getName(), author.getName()) && Objects.equals(author.getSurname(), author.getSurname()));
        System.out.println(Objects.equals(author2.getName(), author2.getName()) && Objects.equals(author2.getSurname(), author2.getSurname()));
        System.out.println(Objects.equals(author3.getName(), author3.getName()) && Objects.equals(author3.getSurname(), author3.getSurname()));

        System.out.println(" ");

        System.out.println("Проверка метода hashCode (Author) ");

        System.out.println(Objects.hash(author.getName(), author.getSurname()));
        System.out.println(Objects.hash(author.getName(), author.getSurname()));
        System.out.println(Objects.hash(author2.getName(), author2.getSurname()));
        System.out.println(Objects.hash(author2.getName(), author2.getSurname()));
        System.out.println(Objects.hash(author3.getName(), author3.getSurname()));
        System.out.println(Objects.hash(author3.getName(), author3.getSurname()));


    }

}





