package Gui;
import javax.swing.JOptionPane;

public class SomaNumeros {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        
        int numero1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        
        int numero2 = Integer.parseInt(input2);
        
        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    }
}
