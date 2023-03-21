import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada, 
 capaz de gerar a tabuada de qualquer número entre 1 e 10.
 O usuário deve informar de qual número ele deseja ver a tabuada.
 A saíde deve ser igual a do exemplo abaixo:
 Tabuada de 5: 
 5 x 1 = 5
 5 x 2 = 10
 ....
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int tabuada;

        System.out.println("Tabuada: ");
         tabuada = scan.nextInt();
         System.out.println("Tabuada de " + tabuada);
        
         for(int i = 1; i <= 10 ; i++ ){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));

         }

    }
}
