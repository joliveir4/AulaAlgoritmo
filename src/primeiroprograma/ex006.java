package primeiroprograma;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
           Scanner name1 = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
          String nome1 = name1.nextLine();
        System.out.print("Digite seu sobrenome: ");
          String sobrenome = name1.nextLine();
        System.out.printf("Seu nome completo é %s %s%n",nome1,sobrenome);


    }
}
