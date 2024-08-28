package com.csc;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primes(int number) {
    ArrayList<Integer> numbers = new ArrayList<>();
    // check for 1 or 0
    if (number == 1 || number == 0) {
      numbers = null;
      return numbers;
    }//dividing out 2
    while (number % 2 == 0) {
      numbers.add(2);
      number /= 2;
    }

    // number must be odd at this point. So we can
    // skip one element
    for (int i = 3; i <= Math.sqrt(number); i += 2) {
      // While i divides number, add i to arry and divide number
      while (number % i == 0) {
        numbers.add(i);
        number /= i;
      }
    }

    //for when the number is prime but greater than 2
    if (number > 2)
      numbers.add(number);
    return numbers;
  }
}
