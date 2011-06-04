package edu.distrital.log.main;

public class laBarberia {

	public static void main(String[] args) {
		final int nSillas = 4;
		final int nClientes = 10;
		
		barberia laBarberia = new barberia(nSillas);
		barbero elBarbero = new barbero(laBarberia);
		cliente[] losClientes = new cliente[10];

		elBarbero.start();

		for (int i = 0; i < nClientes; i++) {
			losClientes[i] = new cliente(laBarberia, i);
			losClientes[i].start();
		}
	}
}
