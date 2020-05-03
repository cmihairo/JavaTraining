package problem6;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book("bookName1", 1, "Author1", "Publisher1");
        Book book2 = new Book("bookName2", 2, "Author2", "Publisher2");
        Book book3 = new Book("bookName3", 3, "Author3", "Publisher3");

        String[] bookArray = new String[3];
        bookArray[0] = book1.getBookInfo();
        bookArray[1] = book2.getBookInfo();
        bookArray[2] = book3.getBookInfo();

        System.out.println(Arrays.toString(bookArray));

    }
}
