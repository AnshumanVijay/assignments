/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler.pkg2;

/**
 *
 * @author Anshuman
 */
public class Euler2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int a = 0;
        int b = 1;
        int temp = 0;
        int sum = 0;

        do
        {
            if (b % 2 == 0)
                sum = sum + b;

            temp = a + b;
            a = b;
            b = temp;


        } while (b < 4000000);

        System.out.println(sum);

        
// TODO code application logic here
    }
    
}
