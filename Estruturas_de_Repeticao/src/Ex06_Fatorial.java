import java.util.Scanner;

/*faça um programa que calculo de um numero inteiro fornecido pelo usuario.
 exemplo: 5!= 120 ( 5 x 4 x 3 x 2 x 1 )
 */
public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: "); 
        int fatorial =  scan.nextInt();
        
        int multiplicacao = 1;

        System.out.print(fatorial + "! =");

        for (int i = fatorial; i>=1 ;i -- ) {
            multiplicacao = multiplicacao*i;
            System.out.println(multiplicacao);

        } 
    }
}
