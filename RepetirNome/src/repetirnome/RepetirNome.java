
package repetirnome;

import java.util.Scanner;

public class RepetirNome {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.print("Digite o número de vezes: ");
        int n = teclado.nextInt();
        
        int i = 0; // ou substituir linhas 17 a 21 por for(int i=0;i<n;i++)
        
        while (i<n)
        {
            i = i + 1;
            System.out.println("Vez "+i+": "+ nome);
  
        }
        
        System.out.println("Fim do programa");
    }
    
}
