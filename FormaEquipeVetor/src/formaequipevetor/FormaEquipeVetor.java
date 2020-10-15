
package formaequipevetor;

import java.util.Scanner;

public class FormaEquipeVetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de jogadores: ");
        int n = teclado.nextInt();
        
        String[] equipe = new String[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.print("Digite o nome do jogador " + (i+1) + ": ");
            equipe[i] = teclado.next();
        }    
         
        for (int i=0; i<n; i++)
            System.out.println(equipe[i]);
    }
    
}
