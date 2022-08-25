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

    public String getAgeCriteria(int age) {

        if (age >= VOTER_ELIGIBLE_AGE) {
            return this.name + " Is Eligible to vote";
        }
        if (age > 0 && age < VOTER_ELIGIBLE_AGE) {
            return this.name + " is not eligible to vote";
        } else {
            return "Age cannot be Negative and Zero";
        }
    }
}



