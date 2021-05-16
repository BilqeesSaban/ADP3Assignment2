/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Set)
 */

package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Set<Animal> animalList;
    Animal Duck;
    Animal Cat;
    Animal Snake;

    @BeforeEach
    void setUp()
    {
        animalList = new HashSet();

        Snake = new Animal (01, "Boofey", "Reptile");
        Cat = new Animal (02, "Bibi", "Mammal");
        Duck = new Animal (03, "Rick", "Anatidae");

        animalList.add(Snake);
        animalList.add(Cat);
        animalList.add(Duck);
    }

    @Test
    public void testSetAdd()
    {
        animalList.add(new Animal (04, "Sloth", "Mammal"));


        assertEquals(4, animalList.size());
        System.out.println("Animal has been successfully added"+ "\n" +"Updated List:" + animalList);

    }

    @Test
    public void testSetRemove()
    {
        animalList.remove(Snake);
        assertFalse(animalList.contains(Snake));
        System.out.println("Animal has been removed."+ "\n" +"Updated List:" + animalList);
    }

    @Test
    public void testSetFind()
    {
        assertTrue(animalList.contains(Duck));
        System.out.println("Animal has been found.");
    }
}