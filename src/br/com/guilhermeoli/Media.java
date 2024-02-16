package br.com.guilhermeoli;

import java.util.Scanner;

/**
 * @author guiol
 */
public class Media {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        int num1 = s.nextInt();
        System.out.println("Digite a nota 2");
        int num2 = s1.nextInt();
        System.out.println("Digite a nota 3");
        int num3 = s2.nextInt();
        System.out.println("Digite a nota 4");
        int num4 = s3.nextInt();

        int media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 7) {
            System.out.println("Você foi aprovado sua média é: " + media);
        } else if (media >= 5){
            System.out.println("Você está de recuperação sua média é: " + media);
        } else {
            System.out.println("Você foi reprovado sua média é: " + media);
        }

    }
}
