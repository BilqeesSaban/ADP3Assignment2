/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Map)
 */


package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{
    Map<Integer,Student> studentList;
    Student student1;
    Student student2;
    Student student3;

    @BeforeEach
    void setUp()
    {
        studentList = new HashMap<>();

        student1 = new Student (219090866, "Bilqees", "Saban");
        student2 = new Student (219062986, "Nurah", "Soeker");
        student3 = new Student (219097615, "Allen", "Tempest");

        studentList.put(01, student1);
        studentList.put(02, student2);
        studentList.put(03, student3);
    }

    @Test
    public void testMapAdd()
    {

        Student student4 = new Student(219628792,"Luke","George");
        studentList.put(04,student4);

        assertEquals(4, studentList.size());
        System.out.println("Student has been successfully added"+ "\n" +"Updated List:" + studentList);
    }

    @Test
    public void testMapRemove()
    {
        studentList.remove(02);
        assertFalse(studentList.containsKey(02));
        System.out.println("Student removed."+ "\n" +"Updated List:" + studentList);
    }

    @Test
    public void testMapFind()
    {
        assertTrue(studentList.containsKey(01));
        System.out.println("Student found: "+ studentList.get(01));
    }
}