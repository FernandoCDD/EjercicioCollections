package ejercicio;

public class Alumno implements Comparable <Alumno>{

	private String nombre;
	private String apellido;
	

	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public int compareTo(Alumno o) {
		
		return this.apellido.toLowerCase().compareTo(o.getApellido().toLowerCase());
	}

	
}
