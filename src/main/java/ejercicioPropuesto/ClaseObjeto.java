package ejercicioPropuesto;

public class ClaseObjeto {
	
	private String nombre;
	private Integer num;
	private boolean esta;
	
	
	public ClaseObjeto(String nombre, int num, boolean esta) {
		super();
		this.nombre = nombre;
		this.num = num;
		this.esta = esta;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getNum() {
		return num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public boolean isEsta() {
		return esta;
	}
	
	public void setEsta(boolean esta) {
		this.esta = esta;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (esta ? 1231 : 1237);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + num;
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
		ClaseObjeto other = (ClaseObjeto) obj;
		if (esta != other.esta)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaseObjeto [nombre=" + nombre + ", num=" + num + ", esta=" + esta + "]";
	}
	
}
