import java.util.Scanner;

public class Ex2Nota {
    public static void main(String[] args) {

        int nota;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Correto! A nota digitada foi: " + nota);


    }
}
