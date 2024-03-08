package primeiroprograma;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
           Scanner dife = new Scanner(System.in);
        System.out.println("Digite os numeros: ");
          int a,b,c,d,diferenca;
         a= dife.nextInt();
         b= dife.nextInt();
         c= dife.nextInt();
         d= dife.nextInt();
         diferenca = (a * b - c * d);
        System.out.println("Diferença = "+diferenca);


    }
}
