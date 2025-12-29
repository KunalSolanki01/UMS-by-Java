package ums;

public class Student extends Person {
    private static int studentCount = 0;
     private final int MAX_COURSES = 5; 
    
    private String studentId;

    public Student(int id, String name, int age, String studentId) {
        super(id, name, age); 
        this.studentId = studentId;
        studentCount++;
    }

    @Override
    public String getRoleDetails() {
        return "Student (ID: " + studentId + ") enrolled in max " + MAX_COURSES + " courses.";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Student ID: " + studentId;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}