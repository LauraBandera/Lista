package ej21;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ej21 lista = new Ej21();

		lista.aniadirLibro(new Libro ("Fernando de Rojas", "Celestina", 350));
		lista.aniadirLibro(new Libro ("Anónimo", "El Cid", 234));
		lista.aniadirLibro(new Libro ("Cervantes", "El Quijote", 350));
		
		Ej21.imprimirLista(lista);
		
		lista.eliminaLibro(1);
		
		Ej21.imprimirLista(lista);
		
	}

}
