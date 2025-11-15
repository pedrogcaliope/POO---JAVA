package Aulas;

import javax.swing.JOptionPane;

public class J_Option_Pane {

	public static void main(String[] args) {
		 
		 String str = JOptionPane.showInputDialog("Digite um n�mero");
		 
		 int num = Integer.parseInt(str);
		 
		 for (int i = 1; i<=num; i++) {
			 if(num%i==0){
				 System.out.printf("%d ",i);
			 }
		 }
	}
}
