import java.util.Scanner;
public class contagem {
    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.println("Informe a quantidades de números: ");
            int n=prompt.nextInt();
            int inteiro;
            int contador=0;
            int i=0;
            while(i<n){
                
                inteiro=prompt.nextInt();
                if(isInteger(inteiro)){
                    contador=contador+1;
            }
            i=i+1;
   }
   System.out.println("A quantidade de números inteiros é: " + contador);
        }
}

    private static boolean isInteger(int inteiro) {
        return false;
    }
}