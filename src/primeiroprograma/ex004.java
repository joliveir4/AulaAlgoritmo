package primeiroprograma;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
                           Scanner name = new Scanner (System.in);
                        System.out.print("Digite seu nome: ");
                          String nome = name.nextLine();
                        System.out.print("Digite sua idade: ");
                          int idade = name.nextInt();
                        System.out.print("Muito prazer "+nome+" sua idade é " +idade+" anos");
    }

}

