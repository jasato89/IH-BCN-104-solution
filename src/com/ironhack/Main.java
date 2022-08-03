package com.ironhack;

public class Main {

    public static void main(String[] args) {
        /*
        Write a method in Java to get the difference between the largest and
         smallest values in an array of integers. The length of the array
          must be 1 and above.
         */
        int[] numbers = {10,4, 15, 6, 3, 7, 8};

        System.out.println("===EXERCISE 1===");
        System.out.println(difference(numbers));
        System.out.println("===EXERCISE 2===");
        twoSmallest(numbers);
        System.out.println("===EXERCISE 2 - With One Loop===");
        twoSmallestOneLoop(numbers);
        System.out.println("===EXERCISE 3===");
        System.out.println(resolveExpression(5, 8));;
    }

    public static double resolveExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
    }

    public static void twoSmallestOneLoop(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if(secondSmallest > numbers[i]) {
                secondSmallest = numbers[i];

            }
        }

        System.out.println("El número más pequeño es " + smallest);
        System.out.println("El segundo número más pequeño es " + secondSmallest);

    }

    public static void twoSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) smallest = numbers[i];
    }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < secondSmallest && numbers[i] != smallest ) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("El número más pequeño es " + smallest);
        System.out.println("El segundo número más pequeño es " + secondSmallest);

        }

    public static int difference(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number < smallest) smallest = number;
            if (number > largest) largest = number;
        }
        return largest - smallest;


    }

}
