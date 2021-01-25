package ej21;

public class Libro {
	private String autor, nombreLibro;
	private int numPag;
	
	
	
	public Libro(String autor, String nombreLibro, int numPag) {
		super();
		this.autor = autor;
		this.nombreLibro = nombreLibro;
		this.numPag = numPag;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getNombreLibro() {
		return nombreLibro;
	}
	
	public int getNumPag() {
		return numPag;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((nombreLibro == null) ? 0 : nombreLibro.hashCode());
		result = prime * result + numPag;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (nombreLibro == null) {
			if (other.nombreLibro != null)
				return false;
		} else if (!nombreLibro.equals(other.nombreLibro))
			return false;
		if (numPag != other.numPag)
			return false;
		return true;
	}
	
	
}
