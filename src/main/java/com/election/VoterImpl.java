/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();

        voter.setAge(25);
        voter.setName("vamshi");
        int age = voter.getAge();
        voter.setAge(13);
        int age1 = voter.getAge();


        System.out.println(voter.getAgeCriteria(age1));
        System.out.println(voter.getAgeCriteria(age));
        voter.setAge(-1);
        int age2 = voter.getAge();
        System.out.println(voter.getAgeCriteria(age2));
    }
}
