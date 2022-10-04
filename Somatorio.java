import java.util.Scanner;
public class Somatorio {
public static void main(String[] args) {
try (Scanner prompt = new Scanner(System.in)) {
    System.out.println("Informe a quantidade de número: ");
    int n= prompt.nextInt();
    int numero;
    int soma=0;
    int i =0;
    while(i<n){
    System.out.println("Informe um número");
    numero=prompt.nextInt();
    soma=soma+numero;
    i=i+1;
    }
    System.out.println("A soma dos "+ n +" numero é " + soma);
}
}
}