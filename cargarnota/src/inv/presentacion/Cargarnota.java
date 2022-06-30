package inv.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.cargarnota;

public class Cargarnota implements cargarnota {

	@Override
	public void cargarnotaa() {
		JOptionPane.showMessageDialog(null, "Soy desde cargarnota "+getClass().getName());	
		
	}

}
