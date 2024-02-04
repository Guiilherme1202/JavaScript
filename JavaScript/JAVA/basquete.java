package JAVA;
import java.util.Scanner;

public class basquete {
    public static void main(String[] args) {

        int total = 0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantiade de lances livres!");

        int ll = scan.nextInt();
        lancelivre(ll, total);

        System.out.println("Digite a quantiade de cestas para 2 pontos!");
        int duplo = scan.nextInt();
        lance2(duplo, total);

        System.out.println("Digite a quantidade de cestas para 3 pontos!");
        int triplo = scan.nextInt();
        lance3(triplo, total);

        System.out.println("O time marcou no total: " + total + " pontos");
        scan.close();
    }

    public static void lancelivre(int ll, int total) {
        int lancelivre = 1;
        int res;
        res = ll * lancelivre;
        System.out.println("O time marcou: " + res + " pontos com lances livres!");

        // Incrementa a variável total
        total += res;
    }

    public static void lance2(int duplo, int total) {
        int pt2 = 2;
        int res;
        res = duplo * pt2;
        System.out.println("O time marcou: " + res + " pontos com cestas de 2!");

        // Incrementa a variável total
        total += res;
    }

    public static void lance3(int triplo, int total) {
        int pt3 = 3;
        int res;
        res = triplo * pt3;
        System.out.println("O time marcou: " + res + " pontos com cestas de 3!");

        // Incrementa a variável total
        total += res;
        
    }
}


