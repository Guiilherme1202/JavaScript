package JAVA;
import java.util.Scanner;
public class teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que quer ver a Tabuada:");
        int numero = scan.nextInt();

        Tabuada(numero); // Chamada do método
        
        System.out.println("Digite os numeros para a Soma");
        int a = scan.nextInt();
        int b = scan.nextInt();

        Soma(a,b);

        System.out.println("Digite os números para a divisão: ");

        int diva = scan.nextInt();
        int divb = scan.nextInt();

        divisao(diva,divb);
        scan.close();
    }

    public static void Tabuada(int tabuada){
        int res;
        for(int c = 0; c <= 10; c++){
        res = tabuada*c;

        System.out.println(tabuada+" X "+ c + " = " +res );
        }
    }

    public static void Soma(int somaa,int somab){
        int res;

        res = somaa + somab;

        System.out.println(somaa + " + " + somab  + " = " + res);
        
    }

    public static void divisao(int diva, int divb){
        
        int res;

        res = diva / divb;

        System.out.println("A divisão entre " + diva + " e " + divb + " é "+  res);
    }
}
