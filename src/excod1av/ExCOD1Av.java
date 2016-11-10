
package excod1av;

import javax.swing.JOptionPane;


public class ExCOD1Av {

    
    public static void main(String[] args) {
        
        //creo el metodo calcular area de un rectangulo
        float base;
        float altura;
        float area;
        
        base=Float.parseFloat(JOptionPane.showInputDialog("base"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        area = base*altura;
        
        JOptionPane.showMessageDialog(null, "el area del rectangulo es =" + area); 
        
    }
    
}
