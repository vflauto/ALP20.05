import java.util.Random;
import java.util.Scanner;

public class BrincandoComVetores {
    public static void main(String[] args) {
        int[] v;
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("digite um tamanho de vetor para comecar: ");
        int t = scanner.nextInt();
        while (t > 0){
            v = new int[t];
            System.out.print("\nO vetor: ");
            v[0] = r.nextInt(t);
            System.out.print(v[0] + " ");
            for (int i=1; i<t; i++){
                int novo = r.nextInt(t);
                boolean repete = false;
                int j = i-1;
                while(j>=0 && !repete) {
                    if(v[j] == novo){
                        repete = true;
                    }
                    else {
                        j--;
                    }
                }
                if(repete){
                    i--;
                }
                else{
                    v[i] = novo;
                    System.out.print(v[i] + " ");
                }
                
            }


            System.out.print("\n\ndigite outro tamanho, 0 encerra: ");
            t = scanner.nextInt();

        }
    }
}
