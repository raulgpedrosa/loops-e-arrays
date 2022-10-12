import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int fatorial = 0;
        int multiplicacao = 1;

        System.out.println("Digite um número: ");
        fatorial = scan.nextInt();

        for(int i = fatorial; i >= 1; i--){
           multiplicacao = multiplicacao * i;
        }
        System.out.println(fatorial + "! = " + multiplicacao);
    }

}

