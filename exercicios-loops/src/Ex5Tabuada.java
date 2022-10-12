import java.util.Scanner;

public class Ex5Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Qual tabuada deseja saber? ");
        tabuada = scan.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada * i );

        }




        /*
        System.out.println(tabuada + " x 1 = " + tabuada * 1 );
        System.out.println(tabuada + " x 2 = " + tabuada * 2 );
        System.out.println(tabuada + " x 3 = " + tabuada * 3 );
        System.out.println(tabuada + " x 4 = " + tabuada * 4 );
        System.out.println(tabuada + " x 5 = " + tabuada * 5 );
        System.out.println(tabuada + " x 6 = " + tabuada * 6 );
        System.out.println(tabuada + " x 7 = " + tabuada * 7 );
        System.out.println(tabuada + " x 8 = " + tabuada * 8 );
        System.out.println(tabuada + " x 9 = " + tabuada * 9 );
        System.out.println(tabuada + " x 10 = " + tabuada * 10 );
        */





    }
}
