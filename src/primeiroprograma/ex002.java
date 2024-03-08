package primeiroprograma;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
           Scanner name = new Scanner(System.in);
        System.out.print("Qual seu nome ?: ");
          String nome = name.nextLine();
        System.out.println("Seja bem vindo " + nome);

    }

}