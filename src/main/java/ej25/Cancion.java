/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej25;

import java.util.Objects;

/**
 *
 * @author laura
 */
public class Cancion {
    private String nombre, artista, album;
    private EstiloMusical estilo;
    
	public String getNombre() {
		return nombre;
	}
	public String getArtista() {
		return artista;
	}
	public String getAlbum() {
		return album;
	}
	public EstiloMusical getEstilo() {
		return estilo;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /* EQUALS
        Necesito este metodo para usar el metodo remove el, 
        metodo contains y el indexof
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.artista, other.artista)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        if (this.estilo != other.estilo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", artista=" + artista + ", album=" + album + ", estilo=" + estilo + '}';
    }

    
    
        
    
}
