/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler.pkg4;

/**
 *
 * @author Anshuman
 */
public class Euler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, flag = 0;

            for (i = 999; i >= 100; i--) {
                for (j = i; j >= 100; j--) {
                    k = i * j;

                    m = 0;
                    n = k;

                    while (n > 0) {
                        l = n % 10;
                        m = m * 10 + l;
                        n = n / 10;
                    }

                    if (m == k) {
                        System.out.println("product " + k + " of " + i + " and " + j);
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1) {
                    break;
                }
            }
        }
    }    
     
    
