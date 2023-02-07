import java.util.Scanner;

/*Desenvolva um gerador de tabuadda,
 capaz de gerar a tabuada  qualquer numero inteiro entre 1 a 10.
 O usuario deve informar e qual numero ele deseja ver a tabuada.
 a saida deve ser conforme o exemplo abaixo:
 Tabuada dde 5:
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 = 50
 */
public class Ex05_Tabuada {
     public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Tabuada:     ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de: " + tabuada);
             
            for(int i = 1;i <= 10 ;i ++ ) {
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            }
        }
     }
}
