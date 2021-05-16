/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Set)
 */

package za.ac.cput;

public class Animal
{
    private int animalID;
    private String animalName;
    private String animalType;

    public Animal()
    {

    }

    public Animal(int animalID, String animalName, String animalType) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }



    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String toString()
    {
        return "Animal{" + "animalID=" + animalID + ", animalName='" + animalName + '\'' + ", animalType='" + animalType + '\'' + '}';
    }

}
