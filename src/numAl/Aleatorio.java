package numAl;

import javax.swing.JOptionPane;

public class Aleatorio {

	public static void main(String[] args) {
		
		double numAl= (int) (Math.random()*100);
		int num, intentos=0;
		
		
	
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero del 0-100"));
			
			if(num>numAl) {
				JOptionPane.showConfirmDialog(null, "Menos");
				
			}
			else if(num<numAl) {
				JOptionPane.showConfirmDialog(null, "M�s");
			}
			else if(num==numAl) {
				JOptionPane.showConfirmDialog(null, "Haz acertado el n�mero, por lo tanto se termina el programa");
			}
				
			intentos++;
	}while(numAl!=num);
		
		JOptionPane.showConfirmDialog(null, "El n�mero de intentos fue: "+intentos);

}}
