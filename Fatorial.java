import java.util.Scanner;
public class Fatorial {
public static void main(String[] args) {
try (Scanner prompt = new Scanner(System.in)) {
    System.out.println("informe um número");
    int n= prompt.nextInt();
    int fatorial =1;
    int i=n;
    while(i>=1){
    fatorial=fatorial*i;
    i=i-1;
    }
    System.out.println("O fatorial de "+ n + " é "+ fatorial);
}
}
}