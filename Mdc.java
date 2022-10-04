import java.util.Scanner;
public class Mdc {
public static void main(String[] args) {
try (Scanner prompt = new Scanner(System.in)) {
    int num1=0;
    System.out.println("Digite o primeiro numero");
    num1=prompt.nextInt();
    int num2=0;
    System.out.println("Digite o segundo numero");
    num2=prompt.nextInt();
    int menor, maior;
    if(num1>num2){
    maior=num1;
    menor=num2;
    }else{
    maior = num2;
    menor = num1;
    }
    int aux=0;
    while((maior%menor)!=0){
    aux=menor;
    menor=(maior%menor);
    maior=aux;
    }
    System.out.println("MDC de ("+ num1 + " , " + num2 + ") = " +
    menor);
}
}
}