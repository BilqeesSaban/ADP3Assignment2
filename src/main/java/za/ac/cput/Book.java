/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (List)
 */

package za.ac.cput;

public class Book
{
    private int bookID;
    private String bookTitle;
    private String bookAuthor;

    public Book()
    {
    }

    public Book(int bookID, String bookTitle, String bookAuthor)
    {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle()
    {
        return this.bookTitle;
    }

    public String getBookAuthor()
    {
        return this.bookAuthor;
    }

    public int getBookID()
    {
        return this.bookID;
    }

    public void setBookTitle(String BookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String BookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public void setBookAuthor(int bookID)
    {
        this.bookID = bookID;
    }

    public String toString()
    {
        return "ID: "+ bookID + " Title: "+ bookTitle +" Author: " + bookAuthor+ "\n";
    }
}
