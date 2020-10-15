
package vetormatriznumeroprimo;

public class VetorMatrizNumeroPrimo {

    public static void main(String[] args) {
        int[] primo = {1, 2, 3, 5, 7, 11, 13};
        
        //primo [3] = 10; //modifica o quarto elemento do vetor
        
        for(int i=0; i<primo.length; i++)
            System.out.println(primo[i]);
        
        int soma = 0;
        
        for(int i=0; i<primo.length; i++)
            if(primo[i]>5)
                soma = soma + primo[i];
        System.out.println(soma);
        
        
        //ou
        //System.out.println(primo[0]);
        //System.out.println(primo[3]);
        //System.out.println(primo[6]);
    }
    
}
