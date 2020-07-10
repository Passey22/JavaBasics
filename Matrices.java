/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author satvi
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  mat[][]= {{"2","6","8"},{"4","8","6"},{"4","6","9"},{"All","The","Best!"}};
        for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
        System.out.print(mat[i][j]+ "  ");
        }
        System.out.println();
        }
        }  
}  
