package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    String getName(){
        return name;
    }
    int getStudentId(){
        return studentId;
    }
    int getNumberOfCredits(){
        return numberOfCredits;
    }
    double getGpa(){
        return gpa;
    }
    void setName(String aName){
        name = aName;
    }
    void setStudentId(int aStudentId){
        studentId = aStudentId;
    }
    void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    void setGpa(double aGpa){
        gpa = aGpa;
    }
}