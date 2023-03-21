import java.util.Scanner;

/* Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 e a quantidade de números impares.
 */
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int  quantidadeNumeros;
        int count = 0;
        int numero;
        int quantPares = 0 , quantImpares = 0;
        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero % 2  == 0) quantPares++; 
            else quantImpares++;
            
            count++;

        }while(count < quantidadeNumeros);
        System.out.println("Quantidade Par " + quantPares);
        System.out.println("Quantidade Impar " + quantImpares);
    }
}
