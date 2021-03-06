package org.presentacion;

import javax.swing.JOptionPane;

import api.com.cableado.IModerador;
import api.com.cableado.cargarnota;
import api.com.cableado.editarnota;
import api.com.cableado.login;
import api.com.cableado.vernotas;
import api.com.utilidades.Cargador;

public class Orquestador implements IModerador {

	@Override
	public void moderar() {
		Cargador crg2 = new Cargador("core");

		// Para traer login
		try {
			Class cls = crg2.getClase(login.class.getName());
			login com = (login) cls.newInstance();
			com.logear();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no hay login");
		}
		
		// Para traer cargarnota
				try {
					Class cls = crg2.getClase(cargarnota.class.getName());
					cargarnota com = (cargarnota) cls.newInstance();
					com.cargarnotaa();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "no hay cargar nota");
				}
				
				// Para traer editarnota
				try {
					Class cls = crg2.getClase(editarnota.class.getName());
					editarnota com = (editarnota) cls.newInstance();
					com.editarnotaa();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "no hay editarnota");
				}
				try {
					Class cls = crg2.getClase(vernotas.class.getName());
					vernotas com = (vernotas) cls.newInstance();
					com.vernota();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "no hay ver nota");
				}
	}


	public static void main(String[] args) {
		new Orquestador().moderar();
	}
	
}



