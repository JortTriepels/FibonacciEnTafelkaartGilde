package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gooi eens een leuk nummertje");
        int n = scanner.nextInt();
        fibonacci(n);
        tafelkaart(n);


    }


    private static void fibonacci(int n) {
        int fibonacci = 1;
        int last = 1;
        int next = 0;
         ;
        for (int i = 0; i < n; i++) {

            System.out.print(fibonacci + ", ");
             next = fibonacci + last;
             fibonacci = last;
             last = next;
        }
        System.out.println("\n \n");

    }

    private static void tafelkaart(int n) {
        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d",i * j);
            }
            System.out.println();


        }
    }
}