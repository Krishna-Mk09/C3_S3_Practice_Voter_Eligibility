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

    /**
     * If the age is greater than or equal to 18, return the name of the person and a message saying that they are eligible
     * to vote. If the age is greater than 0 and less than 18, return the name of the person and a message saying that they
     * are not eligible to vote. If the age is less than or equal to 0, return a message saying that the age cannot be
     * negative or zero
     *
     * @param age The age of the voter
     * @return String
     */
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



