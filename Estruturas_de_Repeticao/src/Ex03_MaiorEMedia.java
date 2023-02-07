/*faça um porgrama que leia 5 notas
 * imprima o valor a maior nota
 * e imprima a media de todas as notas.
 */
import java.util.Scanner;

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int numero;

        int maior = 0;
        int soma = 0;
        int count = 0;
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            
            if(numero > maior) maior = numero;
            
            count = count + 1;
        }while(count < 5);
        
        System.out.println("Maior: " + maior);
        System.out.println("media :" + (soma /5));

        
    }

}
