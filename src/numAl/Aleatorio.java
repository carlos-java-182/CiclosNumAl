package numAl;

import javax.swing.JOptionPane;

public class Aleatorio {

	public static void main(String[] args) {
		
		double numAl= (int) (Math.random()*100);
		int num, intentos=0;
		
		
	
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digita un número del 0-100"));
			
			if(num>numAl) {
				JOptionPane.showConfirmDialog(null, "Menos");
				
			}
			else if(num<numAl) {
				JOptionPane.showConfirmDialog(null, "Más");
			}
			else if(num==numAl) {
				JOptionPane.showConfirmDialog(null, "Haz acertado el número, por lo tanto se termina el programa");
			}
				
			intentos++;
	}while(numAl!=num);
		
		JOptionPane.showConfirmDialog(null, "El número de intentos fue: "+intentos);

}}
