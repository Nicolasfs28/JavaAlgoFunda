public class Ordenacao {
    public static void main(String[] args) {
    int vetor[]={1,15,5,4,20,22,50};
    int aux=0;
    for(int j=0; j<vetor.length; j++){
    for( int c=0;c<vetor.length; c++){
    if(vetor[j]<vetor[c]){
    aux=vetor[j];
    vetor[j]=vetor[c];
    vetor[c]=aux;
    }
    }
    }
    for(int i=0; i<vetor.length; i++){
    System.out.println(vetor[i]+ " ");
    }
    }
    }