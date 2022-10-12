import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int cont  = 0;
        int maior = 0;
        int soma  = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma += numero;
            if (numero > maior) maior = numero;

            cont++;
        } while(cont < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/5);

    }
}
