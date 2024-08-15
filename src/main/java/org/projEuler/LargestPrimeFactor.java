package org.projEuler;


/*
The prime factors of 13195 are 5,7,13 and 29.

What is the largest prime factor of the number 600851475143?
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class LargestPrimeFactor {
    static final Logger logger = Logger.getLogger(LargestPrimeFactor.class.getName());

    public static void primeFactors(int n){
        //Print all prime factors of a given number
        while (n % 2 == 0) {
            logger.log(Level.INFO, "Twos that divide n: {0}", n);
            n /=2;
        }

        // n must be odd at this point. So we skip one element
        for (int i = 3; i <=Math.sqrt(n); i += 2) {

            //While i divides n, print i and divide n
            while(n % i == 0) {
                logger.log(Level.INFO, "Print i: {0}", i + " ");
                n /= i;
            }
        }
            /* This condition is to handle case when n is prime number
            greater than 2 */

            if (n > 2)
                logger.log(Level.INFO, "n is prime number greater than 2: {0}", n);



    }

    public static void main(String[] args){
        int n = 13195;
        primeFactors(n);
    }

}
