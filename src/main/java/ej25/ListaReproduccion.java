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
		//Falta inicializar
		//lista.add();
		contadorCanciones++; //Hacer tras cada canción incluida
	}
	
	public int numeroCanciones() {
		return contadorCanciones;
	}
	
	public boolean estaVacia() {
		return (contadorCanciones == 0);
	}
	
	public Cancion escucharCancion(int pos) {
		return this.lista.get(pos);
	}
	
	public void cambniarCancion(int pos, Cancion song) {
		this.lista.set(pos, song);
	}
	
	public void grabarCancion(Cancion song) {
		this.lista.add(song);
	}
	
	public void eliminaCancion(int pos) {
		this.lista.remove(pos);
	}
    
    public static void imprimirLista(ListaReproduccion tmp) {
    	for(int i = 0; i < tmp.lista.size(); i++) {
    		System.out.println(tmp.lista.get(i).getNombre());
    	}
    }
    
    public int buscarCancion (Cancion c) {
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
