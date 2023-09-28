/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("PROGRAMA CALCULADORA CON NUMEROS DE TODO TIPO, ENTERON Y REALES");
        int op;

        do {
            System.out.println("ingrese 2 numeros");
            double num1 = leer.nextDouble();
            double num2 = leer.nextDouble();
            System.out.println("que operacion desea realizar:");
            System.out.println("1-SUMA");
            System.out.println("2-RESTA");
            System.out.println("3-MULTIPLICACION");
            System.out.println("4-DIVISION");
            System.out.println("5-SALIR");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    double suma = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + suma);
                    break;
                case 2:
                    double resta = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resta);
                    break;
                case 3:
                    double multiplicacion = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
                    break;
                case 4:
                    double division = 0;
                    if (num2 != 0) {
                        division = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + division);

                    } else {
                        System.out.println("no se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("opcion incorrecta");

            }

        } while (op != 5);
        System.out.println("nos vemos!");
        
       

    }

}
