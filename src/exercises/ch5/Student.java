package exercises.ch5;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        //gpa = (total score quality) / (total number of credits), tsq = letter grade * numcredits
        //if student received an A(worth 4) on a 3 credit course and a b on a 4, their quality would be 4*3+3*4=24, 24/7=3.43
        double tsq = this.gpa * this.numberOfCredits;
        this.gpa = (tsq + (grade*courseCredits)/(this.numberOfCredits+courseCredits));
    }

    public String getGradeLevel() {
        if(this.numberOfCredits>=90){
            return "Senior";
        } else if(this.numberOfCredits>=60){
            return "Junior";
        } else if(this.numberOfCredits>=30){
            return "Sophmore";
        } else if(this.numberOfCredits>=0) {
            return "Freshman";
        } else {
            return "Error. Credit data failure.";
        }
    }

    /* getters and setters omitted */

}