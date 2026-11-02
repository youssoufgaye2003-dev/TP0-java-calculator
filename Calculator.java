/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/** 
 * auteur : Youssouf Gaye
 * Date : 02/11/2026
 * Objectif du programme : Créer une calculatrice
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CALCULATOR ===");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Modulo");
        System.out.print("Please enter the operator: ");

        int operator = sc.nextInt();

        if (operator < 1 || operator > 5) {
            System.out.println("Please choose a value between 1 and 5.");
            return;
        }

        System.out.print("Please enter the first operand: ");
        int operand1 = sc.nextInt();

        System.out.print("Please enter the second operand: ");
        int operand2 = sc.nextInt();

        switch (operator) {

            case 1:
                System.out.println("The result is: " + (operand1 + operand2));
                break;

            case 2:
                System.out.println("The result is: " + (operand1 - operand2));
                break;

            case 3:
                System.out.println("The result is: " + (operand1 * operand2));
                break;

            case 4:
                if (operand2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("The result is: " + ((double) operand1 / operand2));
                }
                break;

            case 5:
                if (operand2 == 0) {
                    System.out.println("Modulo by zero is not allowed.");
                } else {
                    System.out.println("The result is: " + (operand1 % operand2));
                }
                break;
        }

        sc.close();
    }
    
}
