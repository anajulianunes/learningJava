
package precoproduto;

import java.util.Scanner;

public class PrecoProduto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: ");
        double preco = teclado.nextDouble(); //a variável teclado captura valor double
        
        if(preco <= 100.00)
        {
            System.out.println("Preço bom!");
            if (preco > 50)
                System.out.println("Compre uma unidade");
            else
                System.out.println("Compre duas unidades");
  
        }
        else
            System.out.println("Muito caro!");
        
        System.out.println("Obrigado!");
    }
    
}
