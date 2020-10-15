
package matrizvetorvendas;

public class MatrizVetorVendas {

    public static void main(String[] args) {
        
        int[][] vendas = {{40,32,30}, {20,26}, {10,4,18,40};
        
        for(int i=0; i<vendas.length; i++) //para duas linhas
        {
            System.out.print("Vendedor " +i+": ");
            
            for(int j = 0; j<vendas[i].length; j++) //para 3 colunas
            {
                System.out.print(vendas[i][j]);
                System.out.print(" ");
               
            }
            
            System.out.println();
        }
        
    }
    
}
