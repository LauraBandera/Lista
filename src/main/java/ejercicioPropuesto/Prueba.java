package ejercicioPropuesto;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaObjetos lista = new ListaObjetos();

		lista.insertarObjeto(new ClaseObjeto("nombre1", 1, true));
		lista.insertarObjeto(new ClaseObjeto("nombre9", 25, false));
		lista.insertarObjeto(new ClaseObjeto("nombre6", 3, false));
		lista.insertarObjeto(new ClaseObjeto("nombre5", 17, false));
		lista.insertarObjeto(new ClaseObjeto("nombre2", 1, true));
		
		System.out.println("El objeto obtenido es: " + lista.obtenerObjeto(4));
		lista.imprimirLista();
		
		lista.borarObjeto(4);
		lista.imprimirLista();
		
		lista.modificarObjeto(new ClaseObjeto("nombreNuevo", 30, true), 2);
		lista.imprimirLista();
		
		lista.ordenarNombre();
		lista.imprimirLista();
		int posicionObjetoNombre = lista.buscarNombre(new ClaseObjeto("nombre5", 17, false));
		
		lista.ordenarNum();
		lista.imprimirLista();
		int posicionObjetoNum = lista.buscarNum(new ClaseObjeto("nombreNuevo", 30, true));
		
		System.out.println("El objeto buscado por nombre está en la posición: " + posicionObjetoNombre
				+ "\nEl objeto buscado por num está en la posición: " + posicionObjetoNum);
		
		
	}

}
