/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Arman
 */
public class Student {


    private String Name;
    private String FamilyName;
    private String StudentID_Num;
    private String GPA;


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    public String getStudentID_Num() {
        return StudentID_Num;
    }

    public void setStudentID_Num(String StudentID_Num) {
        this.StudentID_Num = StudentID_Num;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }
        public Student(String Name, String FamilyName, String StudentID_Num, String GPA) {
        this.Name = Name;
        this.FamilyName = FamilyName;
        this.StudentID_Num = StudentID_Num;
        this.GPA = GPA;
    }
}
