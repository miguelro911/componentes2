package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.vernotas;

public class Vernota implements vernotas {

	@Override
	public void vernota() {
		JOptionPane.showMessageDialog(null, "Soy desde ver notas "+getClass().getName());	
		
	}

}
