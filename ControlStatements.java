/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatements;

import java.util.Scanner;

/**
 *
 * @author satvi
 */
public class ControlStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        age= sc.nextInt();
        if(age>=18)
            System.out.println("You are eligible to vote");
        else 
            System.out.println("You are not eligible to vote  ");
        if(age>=20)
            System.out.println("You are a Major");
        else
            System.out.println("You are not a Major");
            
            
            
        
        
            
        
    }
    
}
