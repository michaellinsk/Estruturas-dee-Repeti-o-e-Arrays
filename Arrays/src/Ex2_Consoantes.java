import java.util.Scanner;

/*Faça um programa que leeia um veetor de 6 caracteres,
 e diga quantas consoantes foram lidas.
 imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] consoantes = new String[6];
             int quantidadeConsoantes = 0;

             int count = 0;
             do {
                System.out.println("letra: ");
                String letra = scan.next();
                
                if(  !(letra.equalsIgnoreCase ("a" ) |
                         letra.equalsIgnoreCase ("e" ) |
                         letra.equalsIgnoreCase ("i" ) |
                         letra.equalsIgnoreCase ("o" ) |
                         letra.equalsIgnoreCase ("u" ) 
                ) ){

                    consoantes[count]= letra;
                    quantidadeConsoantes++;
                }
                count++;

             }while(count < consoantes.length);

             System.out.println("consoantes: ");
             for (String consoante : consoantes) {
                if(consoante != null)
                System.out.print(consoante + " ");
                
             }
            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        }


    }   
}
