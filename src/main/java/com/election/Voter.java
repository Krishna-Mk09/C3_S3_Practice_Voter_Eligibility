/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.election;

public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter() {
    }

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeCriteria(int age) {
        if (age >= 18) {
            System.out.println(this.name + "Is Eligible to vote");
            if (age == 0 || age < 18) {
                System.out.println(this.name + "is not eligible to vote");
            } else {
                System.out.println("age cannot be negative");
            }
        }
        return age;
    }


}
