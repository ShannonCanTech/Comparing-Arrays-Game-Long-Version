/*Simple Array List:
* This sample code showcases the basics (or longer version) of assigning array values to another variable.
* It also compares each integer in an array to another array of the same data type to determine which has the greatest value.
* Giving 1 point for each integer value that is greater than another of the same index in a different array.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        int a0, a1, a2, b0, b1, b2;
        int length = 0;
        Scanner scan = new Scanner(System.in);
//      Assign a value to each program.
        int[] alice = new int[3];
        int[] bob = new int[3];
        int aPoints = 0;
        int bPoints = 0;

//      Alice array
        System.out.println("Enter a number for Alice: ");
        a0 = scan.nextInt();
        scan.nextLine();
        alice[0] = a0;
        System.out.println("Enter a number for Alice: ");
        a1 = scan.nextInt();
        scan.nextLine();
        alice[1] = a1;
        System.out.println("Enter a number for Alice: ");
        a2 = scan.nextInt();
        scan.nextLine();
        alice[2] = a2;
//      Bob array
        System.out.println("Enter a number for Bob: ");
        b0 = scan.nextInt();
        scan.nextLine();
        bob[0] = b0;
        System.out.println("Enter a number for Bob: ");
        b1 = scan.nextInt();
        scan.nextLine();
        bob[1] = b1;
        System.out.println("Enter a number for Bob: ");
        b2 = scan.nextInt();
        scan.nextLine();
        bob[2] = b2;

        for(int i = 0; i < alice.length; i++){
            if (alice[i]>bob[i]){
                aPoints = aPoints + 1;
            }
        }
        for(int i = 0; i < bob.length; i++){
            if (alice[i]<bob[i]){
                bPoints = bPoints + 1;
            }
        }

        System.out.println("Alice Points: " +aPoints);
        System.out.println("Bob Points: " +bPoints);

        /*
        * assign alice = "a" + indexNumberInTheArray
        * parse integer example a0
        * if alice[i] is greater than bob[i] add 1 point and vice versa
        * */
    }

}
