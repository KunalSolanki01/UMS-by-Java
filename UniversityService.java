package ums;

import java.util.*;

public class UniversityService {
    private Person[] personArray;
    private int personArraySize = 0;

    private List<Person> personList;

    public UniversityService(int initialCapacity) {
        this.personArray = new Person[initialCapacity];
        this.personList = new ArrayList<>();
    }

    public void addPersonToArray(Person p) throws UMSException {
        if (personArraySize >= personArray.length) {
            throw new UMSException("Error: Person Array is full. Cannot add " + p.getName());
        }
        personArray[personArraySize++] = p;
    }

    public void addPersonToList(Person p) {
        this.personList.add(p);
    }

    public void listAllRoleDetails() {
        System.out.println("\n--- All University Members' Roles ---");
        for (Person p : personList) {
            System.out.println(p.getName() + " -> " + p.getRoleDetails());
        }
    }
}