/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler.pkg3;

/**
 *
 * @author Anshuman
 */
public class Euler3 {

   static long j = 600851475143L;
/**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    for(long i = 2; i < Math.sqrt(j); i++)
    {
    if(j % i == 0)
    {  j = j/i;
    i--;
    }
    System.out.println(j);
    
    }
    
    
    }
   
    

}
    
