public class Ex1OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {9, -30, 5, 123, 78, 61, -98};

        int cont = 0;
        System.out.print("Ordem original do vetor: ");
        while(cont < (vetor.length)){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nOrdem inversa: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
