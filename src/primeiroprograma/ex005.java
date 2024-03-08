package primeiroprograma;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        System.out.println("Calculadora de Multiplicações");
           Scanner n1 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
          float num1 = n1.nextFloat();
        System.out.print("Digite um numero: ");
          float num2 = n1.nextFloat();
          float num3 = num1*num2;
        System.out.println("a multiplicação entre esses numeros é "+ num3);

    }
}

