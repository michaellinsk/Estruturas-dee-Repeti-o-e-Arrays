import java.util.Scanner;

/*faça um programa que leia um conjunto de 2 valores
 * o primimeiro representando o nome do aluno e o segundo representano sua idade.
 * (pare o programa inserindo o valor 0 no nome)
 */
public class Ex01_NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);


        String nome;
        int idade;

    while (true){


        System.out.println("Nome: ");
        nome= scan.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
}
        System.out.println("finalizada a execução");
    }
}
