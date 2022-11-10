package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Create a variable of sum and avg
        int sum = 0;
        int count = 0;

        while(true){
            // checking if the input valid or not
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                // if valid sum the input number
                int num = scanner.nextInt();
                sum += num;
                count++;
            }else{
                // to prevent division by 0, increase the value of count by 1
                // break the loop
                if(count == 0){
                    count++;
                }
                break;
            }
        }

        // Check the pure avg value of input number
        // and convert it to long since we want to show the rounded number
        double pureAvg = (double) sum / count;
        long avg = Math.round(pureAvg);

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}