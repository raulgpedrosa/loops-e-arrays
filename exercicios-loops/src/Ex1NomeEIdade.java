import java.util.Scanner;

public class Ex1NomeEIdade {
    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner leitor = new Scanner(System.in);

        while(true){

            System.out.println("Nome: ");
            nome = leitor.next();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = leitor.nextInt();
        }
        System.out.println("Fim do programa!");
    }
}
