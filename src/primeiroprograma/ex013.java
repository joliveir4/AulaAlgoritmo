package primeiroprograma;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
        System.out.println("Calculadora de areas");

        System.out.print("Valor A: ");
         double a= sc.nextDouble();

        System.out.print("Valor B: ");
         double b= sc.nextDouble();

        System.out.print("Valor C: ");
         double c= sc.nextDouble();

         double pi=3.14159;
         double tri,cir,tra,quad,reta;

         tri=(a*c)/2;
        System.out.printf("Area do Triangulo: %.3f\n",tri);

         cir=Math.pow(c,2);
        System.out.printf("Area do Circulo: %.3f\n",pi*cir);

         tra = ((a + b) * c) / 2;
        System.out.printf("Area do Trapezio: %.3f\n",tra);

         quad=Math.pow(b, 2);
        System.out.printf("Area do Quadrado: %.3f\n",quad);

         reta=a*b;
        System.out.printf("Area do Retangulo %.3f\n",reta);

        sc.close();



    }
}
