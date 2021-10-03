/*
Name    : Showmik Debnath
ID      : 2012020075
Section : B
email   : cse_2012020075@lus.ac.bd
Date    : 16-07-2021
 */

package showmik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	    String section;

        System.out.print("Please enter your section : ");
        section = input.nextLine();

        Info info = new Info();
        Hobby hobby = new Hobby();

        System.out.println("Section : "+section);
        System.out.println("Name : "+info.name);
        System.out.println("ID : "+info.id);
        System.out.println("Hobby : "+hobby.hobbyName);
    }
}
