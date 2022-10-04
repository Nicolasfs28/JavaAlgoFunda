import java.util.Scanner;
public class primos {
public static void main(String[] args) {
try (Scanner prompt = new Scanner(System.in)) {
    int numPrimo;
    int numDivisores=0;
    System.out.println("Digite um numero");
    numPrimo= prompt.nextInt();
    for(int i=1; i<=numPrimo; i++){
    if(numPrimo%i==0){
    numDivisores++;
    }
    }
    if(numDivisores==2){
    System.out.println("O numero digitado e primo.");
    }else{
    System.out.println("O numero digitado nao e primo");
    }
}
}
}