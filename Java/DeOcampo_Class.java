/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enabling;

/**
 *
 * @author gerso
 */
public class DeOcampo_Class
{
    //Constructor
    public DeOcampo_Class()
    {
        studentNo = 0;
        fname = null;
        lname = null;
        course = null;
    }

    //Data Members
    private int studentNo;
    private String fname;
    private String lname;
    private String course;

    //Method Members
    public int getStudentNo()
    {
        return studentNo;
    }

    public String getFname()
    {
        return fname;
    }

    public String getLname()
    {
        return lname;
    }

    public String getCourse()
    {
        return course;
    }


    public void setStudentNo(int studentNo)
    {
        this.studentNo = studentNo;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }
}
