
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTela {

  
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dime = tk.getScreenSize();
        System.out.println("Sua tela tem resolução");
        System.out.println(dime.width + " X " + dime.height);
    }
    
}
