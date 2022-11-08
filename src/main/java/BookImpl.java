/*
 * Author : Ankit Kishor
 * Date: 08-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class BookImpl {
    public static void main(String[] args) {

        Book book = new Book("Paul Coelho","The Alchemist","12q1","Adultery","Fiction",241);

        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        System.out.println(book.getPrice());
        System.out.println(book.getNumberISBN());
        System.out.println(book.displayBookDetails());


    }
}
