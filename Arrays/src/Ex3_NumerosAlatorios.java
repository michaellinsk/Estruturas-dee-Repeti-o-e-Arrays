import java.util.Random;

/*
 Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100) armazene os em um vetor
 Ao final mostre os numeros e seus sucessores.
 */
public class Ex3_NumerosAlatorios {
    public static void main(String[] args) {
          Random random = new Random();

          int[] numeerosAleatorios = new int[20];

          for(int i = 0;i < numeerosAleatorios.length; i++ ){
            int numero = random.nextInt(100);
            numeerosAleatorios[i]= numero;
        
          }
          System.out.print("Numeros Aleatorios: ");
          for (int numero : numeerosAleatorios) {
            System.out.print(numero +" ");
            
          }
          System.out.print("\nAntecessor dos numeeros Aleatorios: ");
          for (int numero : numeerosAleatorios) {
            System.out.print(numero - 1 +" ");
            
          }
          System.out.print("\nSucessores dos numeeros Aleatorios: ");
          for (int numero : numeerosAleatorios) {
            System.out.print(numero + 1 +" ");
            
          }
        
    }

    
}
