
package idiomasistema;

import java.util.Locale;


public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
