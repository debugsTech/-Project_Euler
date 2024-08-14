package org.projEuler;


import java.util.logging.Level;
import java.util.logging.Logger;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000. */
public class MultiplesOf3And5 {
    static final Logger logger = Logger.getLogger(MultiplesOf3And5.class.getName());
    public static void main(String[] args0) {
        int output = 0;
        for (int i = 1; i <= 999; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                output += i;
            }
        }
        logger.log(Level.INFO, "The sum of all multiples of 3 or 5 below 1000 is: {0}", output);
    }
}
