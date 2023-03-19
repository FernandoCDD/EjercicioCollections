package ejercicio;

import java.util.List;

public class GestionAlumno {

	private List <Alumno> listaAlumnos;

	public GestionAlumno(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
}
