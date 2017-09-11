/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaReview;

import java.util.Scanner;

/**
 *
 * @author gavra1870
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize variables
        // type, name {= value};
        int age = 10;
        double length = 25.73;
        // math opptions
        // + addition
        // - sub
        // * mult
        // / division 
        // % modulus (remainder after division)
        age = age + 10;
        length = length * 2;
        age++; //adds 1 to the age
        age--; // subtract from age

        //conditions
        if (length > 100) {
            System.out.println(" Length is bigger then 100");
        } else if (length > 50) {
            System.out.println(" Lenght is between 50 and 100");
        } else {
            System.out.println(" Length is less then 50");


        }
        //While loops
        // && <-AND
        // || <- Or
        int count = 0;
        while (count < 10) {
//increase count and print
            count++;
            System.out.println(count);


        }

        for (int i = 0; i < 10; i++) {
            System.out.println(" i:  " + i);
        }
        //arrays
        String[] words = new String[5];
        words[0] = "cat";
        //input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.println(" Enter a word");
        words[i] = in.nextLine();
        if (words[i].equals("EXIT")){
            break;
            
        }
        int wordlength = words[i].length();
        
        }
    }
}
