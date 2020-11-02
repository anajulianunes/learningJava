/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Fabroncio
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        // assim dá erro String valor = idade;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valo = "9.5";
        float nota = Float.parseFloat(valo);
        System.out.println(nota);
    }
    
}
