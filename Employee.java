/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author satvi
 */
public class Employee {
    int YearOfJoining;
    String Name;
    String Address;
  
    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Name :");
        Name= in.next();
        System.out.println(" Year Of Joining :");
        YearOfJoining= in.nextInt();
        System.out.println(" Address :");
        Address= in.next();
    }
    public void display(){
    
        System.out.print("Name \n " +Name);
         System.out.print("Year Of Joining \n" +YearOfJoining);
          System.out.print(" Address \n " +Address);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e[]= new Employee[3];
        for (int i=0; i<3; i++){
            e[i]= new Employee();
            e[i].getInput();
           
        }
        for (int i=0; i<3; i++){
            e[i].display();
        }
        
        
    }
    
}
