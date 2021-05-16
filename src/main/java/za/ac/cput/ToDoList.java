/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Collection)
 */
package za.ac.cput;

public class ToDoList
{
    private int priority;
    private String toDoList;

    public ToDoList()
    {
    }

    public ToDoList( int priority, String toDoList)
    {
        this.priority = priority;
        this.toDoList = toDoList;
    }

    public String getToDoList()
    {
        return toDoList;
    }

    public void setToDoList(String toDoList)
    {
        this.toDoList = toDoList;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public String toString()
    {
        return "Task: "+ priority +" "+ toDoList+"\n";
    }

}
