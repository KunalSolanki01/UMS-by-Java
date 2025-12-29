package ums;

public abstract class Person {
    private final int id; 
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Person created with ID: " + this.id);
    }

    public abstract String getRoleDetails();

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public int getId() { return id; }
    public String getName() { return name; }

     @Override
    protected void finalize() throws Throwable {
        System.out.println("GC: Person object with ID " + id + " is being finalized.");
    }
}