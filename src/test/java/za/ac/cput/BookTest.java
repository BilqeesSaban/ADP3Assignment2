/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (List)
 */

package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    List<Book> bookInfoList;
    Book book1;
    Book book2;
    Book book3;

    @BeforeEach
    void setUp()
    {
        bookInfoList = new ArrayList<>();

        book1 = new Book (01,"Billie Bears Adventures","Bilqees Saban");
        book2 = new Book (02,"EmoUnicorn and the Nerv of AllenTempest","Nurah Soeker");
        book3 = new Book (03,"Duck Station","Luke Allen");

        bookInfoList.add(book1);
        bookInfoList.add(book2);
        bookInfoList.add(book3);

    }

    @Test
    public void testListAdd()
    {
        bookInfoList.add(new Book (04, "Nerve's Ghost Stories","GhastlyNerv"));
        assertEquals(4, bookInfoList.size());
        System.out.println("Book has been successfully added: "+bookInfoList.get(03) + "\n");
    }

    @Test
    public void testListRemove()
    {
        bookInfoList.remove(book2);
        assertFalse(bookInfoList.contains(book2));
        System.out.println("Book has been removed."+ "\n" +"Updated List:" + "\n" + bookInfoList);
    }

    @Test
    public void testListFind()
    {
        bookInfoList.add(book3);
        assertTrue(bookInfoList.contains(book3));
        System.out.println("Book has been found.");
    }
}