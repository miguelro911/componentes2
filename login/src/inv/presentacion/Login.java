package inv.presentacion;

import api.com.cableado.login;
import javax.swing.JOptionPane;

public class Login implements login {

	@Override
	public void logear() {
		JOptionPane.showMessageDialog(null, "Soy desde login "+getClass().getName());	
	}

}
