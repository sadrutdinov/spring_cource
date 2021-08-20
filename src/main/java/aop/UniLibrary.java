package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("берем книгу из UniLibrary ");
        System.out.println("---------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        String book = "война и мир";
        System.out.println("мы возвращаем книгу в UniLibrary");
        return book;
    }

    public void getMagazine() {
        System.out.println("берем журнал из UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал в UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("---------------------------------------");
    }

}
