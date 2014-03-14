/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler.pkg5;

/**
 *
 * @author Anshuman
 */
public class Euler5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i = 9699690; ; i += 9699690) {
               if( i % 4 == 0
                && i % 6 == 0
                && i % 8 == 0 
                && i % 9 == 0
                && i % 10 == 0
                && i % 12 == 0
                && i % 14 == 0 
                && i % 15 == 0
                && i % 16 == 0
                && i % 18 == 0
                && i % 20 == 0) {
            System.out.println(i);
            break;
        }
    } // TODO code application logic here
    }
    
}
