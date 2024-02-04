package JAVA;
import java.util.Random;

public class aleatorio {
    public static void main(String[] args) {

        Random rand = new Random();
        /*
        int numeroAleatorio = rand.nextInt(100);
        int multi;

        System.out.println("Número gerado é o " + numeroAleatorio);
        for(int i = 0;i <=10;i++){
        multi = numeroAleatorio * i;
        System.out.println("A tabuada de " + numeroAleatorio + " X " +  i  + " é igual a " + multi);
        }
        */

        int numero1 = rand.nextInt(100);
        int numero2 = rand.nextInt(100);
        int numero3 = rand.nextInt(100);
        System.out.println("Numeros Gerados: " + numero1 + "|| " + numero2 + " || " + numero3);
        if(numero1 > numero2 || numero1 > numero3){
            System.out.println("O maior número é o primeiro " + numero1);
        }else if(numero2 > numero1 || numero2 > numero3){
            System.out.println("O maior numero é o segundo " + numero2);
        }else if(numero3 > numero1 || numero3 > numero2){
            System.out.println("O maior numero é o terceiro" + numero3);
        } else{
            System.out.println("[ERRO]");
        }




    }
}
