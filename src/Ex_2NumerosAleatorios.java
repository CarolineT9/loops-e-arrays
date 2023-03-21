/*
 Faça um programa que leia 20 números inteiros aleatórios,
 (entre 0 e 100) armazene-os num vetor.
 Ao final mostre os números e seus sucessores.
 */
import java.util.Random;
public class Ex_2NumerosAleatorios {
    public static void main(String[] args) {
        Randon randon = new Random();

        int[] numerosAleatorios = new int [20];
        
        for(int i = 0; i < numerosAleatorios.length; i++) {
             int numero = randon.nextInt(100);
            numerosAleatorios[i] = numero;
        }
    System.out.print("Numeros aletórios: ");
    for (int numero : numerosAleatorios) {
        System.out.print(numero + "");
        
    }

    System.out.print("Numeros sucessores: ");
    for (int numero : numerosAleatorios) {
        System.out.print((numero+1) + "");
        
    }

}

}
