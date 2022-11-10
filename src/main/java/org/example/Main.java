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
            // for checking if the input valid or not
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                sum += num;
                count++;
            }else{
                if(count == 0){
                    count++;
                }
                break;
            }
        }

        double pureAvg = (double) sum / count;
        long avg = Math.round(pureAvg);

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}