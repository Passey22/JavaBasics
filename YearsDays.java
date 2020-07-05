/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearsdays;

import java.util.Scanner;

/**
 *
 * @author satvi
 */
public class YearsDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        double minutes= input.nextDouble();
        long year = (long) ( minutes/525600 );
        int days = (int) (minutes/1440) %365 ;
        
        System.out.println((int)minutes + "minutes is:"+ year + " years and "+days + "days");
         }
    
}
