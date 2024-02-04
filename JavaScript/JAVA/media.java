package JAVA;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1,nota2,nota3;
        float media;

        System.out.println("Digite a primeira nota: ");
        nota1= scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextFloat();
        if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10){
            System.out.println("Notas inválidas!");
        }
        else {
            media = (nota1 + nota2 + nota3) /3;
            System.out.println("Média do aluno é " + media);
        }
    }
}
