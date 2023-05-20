import java.util.Scanner;
public class BuscaMultiplo {
    public static void main(String[] args) {
        int [] v = new int[10]; //declarando e instanciando um vetor de inteiros
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 10 valores");
        for (i=0; i<10; i++){ //lendo os valores para o vetor
            System.out.println((i+1) + "o: ");
            v[i] = sc.nextInt();
        }
        System.out.println("Digite o valor para busca: ");
        int x = sc.nextInt();
        int cont = 0;
        System.out.println("\nProcurando os multiplos de " + x);
        for (i=0; i<10; i++) {
            if (v[i] % x == 0){
                System.out.print (v[i] + " ");
                cont++;
            }
            
        }
        scanner.close();
        System.out.println("\nForam encontrados " + cont + " multiplos");
    }
    
    
}
