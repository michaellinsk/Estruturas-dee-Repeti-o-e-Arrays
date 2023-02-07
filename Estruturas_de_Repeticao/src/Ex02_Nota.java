import java.util.Scanner;

/*faça um programa que peça uma nota entre 0 e 10.
|Mostre uma menssagem caso o valor seja invalido 
e continue pedindo até que o usuario fornsça um valor valido * 
 */
public class Ex02_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;

        System.out.println("Nota: ");
        nota= scan.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Nota Invalida");
            nota =scan.nextInt();

        }
    }
}