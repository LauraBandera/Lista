/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej25;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author laura
 */
public class ListaReproduccion {

    private ArrayList<Cancion> lista;
    private int contadorCanciones = 0;

    public ListaReproduccion() {
        this.lista = new ArrayList<>();
    }

    public int numeroCanciones() {
        return contadorCanciones;
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public Cancion escucharCancion(int pos) {
        if (pos >= 0 && pos < lista.size()) {
            return this.lista.get(pos);
        }
        return null;
    }

    public void cambniarCancion(int pos, Cancion song) {
        if (pos >= 0 && pos < lista.size()) {
            this.lista.set(pos, song);
        }
    }

    public void grabarCancion(Cancion song) {
        this.lista.add(song);
    }

    public void eliminaCancion(int pos) {
        //Mirar que la posición es correcta
        if (pos >= 0 && pos < lista.size()) {
            this.lista.remove(pos);
        }
    }
    
    /*
    SI LA CLASE CANCIÓN NO TIENE IMPLEMANTADO EL METODO EQUALS
    EL METODO REMOVE NO SE GARANTIZA QUE FUNCIONE CORRECTAMENTE
    */
    public void eliminaCancion(Cancion cancion) {
        //Mirar que la posición es correcta
        this.lista.remove(cancion);
    }

    public static void imprimirLista(ListaReproduccion tmp) {
        for (int i = 0; i < tmp.lista.size(); i++) {
            System.out.println(tmp.lista.get(i).getNombre());
        }
    }

    //SI NO TENGO EL MÉTODO EQUALS NO FUNCIONA
    public int buscarCancion(Cancion c) {
        return lista.indexOf(c);
    }

    public void ordenarTitulo() {
        //Collections.sort(this.lista, Cancion.getNombre());
    }

    public void ordenarArtista() {
        //Collections.sort(Cancion.getArtista());
    }

    public void buscar() {
        //Collections.binarySearch(lista, Cancion.getNombre());
    }

}
