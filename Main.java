package ums;

import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        UniversityService service = new UniversityService(2);

        Student s1 = new Student(101, "Alice Smith", 20, "S9001");
        Person p1 = new Student(201, "Dr. Jones", 45, "Computer Science");
        Student s2 = new Student(102, "Bob Johnson", 21, "S9002");
        
        System.out.println("\nTotal Students (static): " + Student.getStudentCount());
        
        try {
            service.addPersonToArray(s1);
            service.addPersonToArray(p1);
            service.addPersonToArray(s2); 
        } catch (UMSException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        } finally {
             System.out.println("Array capacity check complete.");
        }

        service.addPersonToList(s1);
        service.addPersonToList(p1);
        service.addPersonToList(s2);
        service.listAllRoleDetails();
        

        System.out.println("\nDemonstrating GC (System.gc())... (Wait 2 seconds)");

        s1 = null; 
        p1 = null;
        s2 = null;
        System.gc(); 

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

