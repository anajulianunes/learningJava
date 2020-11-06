/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Fabroncio
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Ana";
        String nome2 = "Ana";
        String nome3 = new String("Ana");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        //para objetos usamos .iguals
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
                
        
    }
    
}
