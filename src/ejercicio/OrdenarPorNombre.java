package ejercicio;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Alumno>{

	public int compare(Alumno o1, Alumno o2) {

		return o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase());
	}

	
}
