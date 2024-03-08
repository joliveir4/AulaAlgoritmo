package primeiroprograma;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
           Scanner raio = new Scanner(System.in);
        System.out.print("Digite o raio: ");
          double rai = raio.nextDouble();
          double area, area2;
          area = Math.pow(rai,2.0);
          area2= 3.14159*area;
        System.out.printf("A= %.4f\n",area2);


    }
}
