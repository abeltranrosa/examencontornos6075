
package excod1av;

import javax.swing.JOptionPane;


public class ExCOD1Av {

    
    public static void main(String[] args) {
        double lado;
        System.out.println("teclea lado :");
        lado = Double.parseDouble(JOptionPane.showInputDialog("lado"));
        System.out.println("area = " +lado*lado);
    }
    
}
