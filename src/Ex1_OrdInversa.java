
/* 
 Crie um vetor de 6 números inteiros
 e mostre a ordem inversa.
 */

public class Ex1_OrdInversa {
    public static void main(String[] args) {
        
    
    System.out.println("Vetor: ");
    int[] vetor = {-5, -6, 15, 50, 8, 4};
    int count = 0;    
    while(count < vetor.length){
        System.out.print(vetor [count] + " ");
        count++;
    }
    System.out.println("\nVetor: ");
    for(int i = (vetor.length-1); i >= 0 ; i--){
        System.out.print(vetor[i] + " ");

    }

    
}
}