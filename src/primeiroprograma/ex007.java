package primeiroprograma;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
           Scanner name = new Scanner(System.in);
        System.out.print("Nome do produto: ");
          String nome = name.nextLine();
        System.out.print("Valor de custo: ");
          float pc = name.nextFloat();
        System.out.print("Preço final: ");
          float pf = name.nextFloat();
          float pf2= pf-pc;
        System.out.println("O produto "+nome+" tem um lucro de "+pf2+ " Reais");

    }
}
