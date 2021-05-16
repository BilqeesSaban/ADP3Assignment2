/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Collection)
 */

package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest
{
    Collection<ToDoList> toDoList;
    ToDoList item1;
    ToDoList item2;
    ToDoList item3;

    @BeforeEach
    void setUp()
    {
        toDoList = new LinkedList<>();

        item1 = new ToDoList (1,"ADP Assignment");
        item2 = new ToDoList (2,"Project Management Draft");
        item3 = new ToDoList(3, "ADT Marvel App");

        toDoList.add(item1);
        toDoList.add(item2);
        toDoList.add(item3);
    }

    @Test
    public void testCollectionAdd()
    {
        ToDoList item4 = new ToDoList (4,"Study");
        toDoList.add(item4);
        assertSame(4, toDoList.size());
        System.out.println("Updated To Do List:" + "\n" + toDoList);
    }

    @Test
    public void testCollectionRemove()
    {
        toDoList.remove(item1);
        assertFalse(toDoList.contains(item1));
        System.out.println(item1 +"has been removed"+ "\n" +"Updated List: " + toDoList);
    }

    @Test
    public void testCollectionFind()
    {
        assertTrue(toDoList.contains(item3));
        System.out.println(item3+"has been found.");
    }
}