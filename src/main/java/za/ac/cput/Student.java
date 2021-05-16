/**
 * Author: Bilqees Saban
 * Student Number: 219090866
 * Date: 15/05/2021
 * Description: Testing of the Collection Interface (Map)
 */

package za.ac.cput;

public class Student
{
    private int studentNo;
    private String studentFName;
    private String studentLName;

    public Student(int studentNo, String studentFName, String studentLName)
    {
        this.studentNo = studentNo;
        this.studentFName = studentFName;
        this.studentLName = studentLName;
    }

    public int getStudentNo()
    {
        return studentNo;
    }

    public void setStudentNo(int studentNo)
    {
        this.studentNo = studentNo;
    }

    public String getStudentFName()
    {
        return studentFName;
    }

    public void setStudentFName(String studentFName)
    {
        this.studentFName = studentFName;
    }

    public String getStudentLName()
    {
        return studentLName;
    }

    public void setStudentLName(String studentLName)
    {
        this.studentLName = studentLName;
    }

    public String toString()
    {
        return ("Student" + "student Number:" + studentNo + ", First Name:" + studentFName + '\'' + ", Last Name='" + studentLName);
    }

}
