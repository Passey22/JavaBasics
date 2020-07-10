/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatements1;

import java.util.Scanner;

/**
 *
 * @author satvi
 */
public class ControlStatements1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("Pick one : 1. HI\t 2. HEY\t  3. HELLO\t");
        Scanner s= new Scanner(System.in);
        choice= s.nextInt();
        switch(choice)
        { 
            case 1 : System.out.println("YOU SAID HI");
                     break;
            case 2 : System.out.println("YOU SAID HEY");
                     break;
            case 3 : System.out.println("YOU SAID HELLO");
                     break;
            default: System.out.println("INVALID CHOICE");
        }
    }
    
}
