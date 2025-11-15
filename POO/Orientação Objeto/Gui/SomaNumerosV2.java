package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SomaNumerosV2 {
    public static void main(String[] args) {
       
    	JFrame janelaInicial = new JFrame("Bem-vindo");
        janelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaInicial.setSize(300, 150);
        janelaInicial.setLayout(null);
        
        JLabel label = new JLabel("Clique no botão para prosseguir!");
        label.setBounds(50, 30, 200, 30);
        janelaInicial.add(label);

        JButton botaoProsseguir = new JButton("Prosseguir");
        botaoProsseguir.setBounds(100, 70, 100, 30);
        janelaInicial.add(botaoProsseguir);
        
        janelaInicial.setVisible(true);
        
        botaoProsseguir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janelaInicial.dispose(); 	// Fecha a janela inicial
                abrirJanelaSoma(); 			// Chama a função para abrir a janela de soma
            }
        });
    	
    }
    
    private static void abrirJanelaSoma() {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero2 = Integer.parseInt(input2);

        int soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    }
}
