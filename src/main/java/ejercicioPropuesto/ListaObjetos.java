package ejercicioPropuesto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ej21.Libro;

public class ListaObjetos {

	private ArrayList<ClaseObjeto> lista;

	//Constructor
	public ListaObjetos() {
		lista = new ArrayList<>();
	}
	
	//Método para insertar objetos
	public void insertarObjeto(ClaseObjeto obj) {
		lista.add(obj);
	}
	
	//Método para borrar objetos
	public void borarObjeto(int pos) {
		if (pos >= 0 && pos < lista.size()) {
			lista.remove(pos);
        }
	}
	
	//Método para obtener objetos
	public ClaseObjeto obtenerObjeto(int pos) {
		if (pos >= 0 && pos < lista.size()) {
            return this.lista.get(pos);
        }
		return null;
	}
	
	//Método para modificar objetos
	public void modificarObjeto(ClaseObjeto obj, int pos) {
		if (pos >= 0 && pos < lista.size()) {
            lista.set(pos, obj);
        }
		
	}
	
	//Método para imprimir lista
	public void imprimirLista() {
		lista.forEach(item -> System.out.print(" " + item));
		System.out.println();
	}
	
	//Método para ordenar por nombre
	public void ordenarNombre() {
		Comparator<ClaseObjeto> criterio = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        Collections.sort(this.lista, criterio);
	}
	
	//Método para ordenar por num
	public void ordenarNum() {
		Comparator<ClaseObjeto> criterio = (o1, o2) -> o1.getNum().compareTo(o2.getNum());
        Collections.sort(this.lista, criterio);
	}
	
	//Método para buscar objetos por nombre
	public int buscarNombre(ClaseObjeto obj) {
		Comparator<ClaseObjeto> criterio = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        int posicion = Collections.binarySearch(lista, obj, criterio);

        return posicion;
	}
	
	//Método para obtener la primera ocurrencia del objeto con el num indicado
	public int buscarNum(ClaseObjeto obj) {
		Comparator<ClaseObjeto> criterio = (o1, o2) -> o1.getNum().compareTo(o2.getNum());
        int posicion = Collections.binarySearch(lista, obj, criterio);

        return posicion;
	}
}
