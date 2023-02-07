/*faça um programa que peça N numeros inteiros
 * calcule e mostre a quantidade de numeros 
 * pares e a quantidadee de numeros impares.
 */
import java.util.Scanner;




public class Ex04_ImparEPar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantnumeros;
    int numero;
    int quantPares=0, quantImpares =0;
    
    System.out.println("quantidade de numeros: ");
    
    quantnumeros = scan.nextInt();

    int count =0 ;
    do{
        System.out.println("Numero: ");
        numero =scan.nextInt();

        if (numero%2 ==0) quantPares++;
        else quantImpares++;
            count++;
    } while (count < quantnumeros);

    System.out.println("A Quantidades de  numeros Pares é: "+ quantPares );
    System.out.println("A Quantidades de  numeros Impares é: "+ quantImpares );

    }
}
