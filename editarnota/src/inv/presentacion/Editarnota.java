package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.editarnota;

public class Editarnota implements editarnota {

	@Override
	public void editarnotaa() {
		JOptionPane.showMessageDialog(null, "Soy desde editar nota "+getClass().getName());	
		
	}

}
