package primeiroprograma;

import java.util.Scanner;

public class ex012 {
      public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
          System.out.print("Digite seu numero: ");
            int numfc = sc.nextInt();

          System.out.print("Digite suas horas trabalhadas: ");
            int horas = sc.nextInt();

          System.out.print("Quanto recebe por hora: ");
            double shr = sc.nextDouble();

            double salariof = shr*horas;

          System.out.println("Number: "+ numfc);
          System.out.printf("Salary= U$ %.2f",salariof);

      }

}
