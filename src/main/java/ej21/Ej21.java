package ej21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ej21 {
	
	private ArrayList<Libro> lista;
	private static int contadorLibros = 0;
	
	public Ej21() {
        this.lista = new ArrayList<>();
    }

    public int numeroLibros() {
        return contadorLibros;
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public Libro leerLibro(int pos) {
        if (pos >= 0 && pos < lista.size()) {
            return this.lista.get(pos);
        }
        return null;
    }

    public void cambiarLibro(int pos, Libro book) {
        if (pos >= 0 && pos < lista.size()) {
            this.lista.set(pos, book);
        }
    }

    public void aniadirLibro(Libro book) {
        this.lista.add(book);
        contadorLibros++;
    }

    public void eliminaLibro(int pos) {
        //Mirar que la posición es correcta
        if (pos >= 0 && pos < lista.size()) {
            this.lista.remove(pos);
            contadorLibros--;
        }
    }

    /*
    SI LA CLASE LIBRO NO TIENE IMPLEMANTADO EL METODO EQUALS
    EL METODO REMOVE NO SE GARANTIZA QUE FUNCIONE CORRECTAMENTE
     */
    public void eliminaLibro(Libro book) {
        //Mirar que la posición es correcta
        this.lista.remove(book);
        contadorLibros--;
    }

    public static void imprimirLista(Ej21 tmp) {
        for (int i = 0; i < tmp.lista.size(); i++) {
            System.out.println(tmp.lista.get(i).getNombreLibro());
        }
    }

    //SI NO TENGO EL MÉTODO EQUALS NO FUNCIONA
    public int buscarLibro(Libro book) {
        return lista.indexOf(book);
    }

    public void ordenarTitulo() {
        Comparator<Libro> criterio = (l1, l2) -> l1.getNombreLibro().compareTo(l2.getNombreLibro());
        Collections.sort(this.lista, criterio);
    }

    public void ordenarAutor() {
        Comparator<Libro> criterio = (l1, l2) -> l1.getAutor().compareTo(l2.getAutor());
        Collections.sort(this.lista, criterio);
    }

    //Para usar búsqueda binaria el array o la lista
    // debe estar ordenador según el criterio por el uqe 
    // se va a buscar
    public int buscarPorNombre(Libro l) {
    	Comparator<Libro> criterio = (l1, l2) -> l1.getNombreLibro().compareTo(l2.getNombreLibro());
        int posicion = Collections.binarySearch(lista, l, criterio);

        return posicion;
    }
	
	
}
