package ejercicio;

import java.util.Collections;
import java.util.List;

public class GestionAlumno {

	private List <Alumno> lista;

	public GestionAlumno(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	public String toString() {
		return "GestionAlumno [lista=" + lista + "]";
	}
	
	public Alumno buscarPorMaxApellido () {
		
		return Collections.max(lista);
	}
	
	public Alumno buscarPorMinNombre () {
		
		return Collections.min(lista, new OrdenarPorNombre());
	}	

	public void reemplazarAlumno(Alumno nuevo, int indice) {
		
		Collections.replaceAll(lista, lista.get(indice - 1), nuevo);
		// Pongo -1 porque el usuario al meter un número no sabe que empieza por 0.
		// y pone un alumno más del que quiera.
		imprimirLista();
	}
	
	public void invertirLista () {
		
		// En este método en vez de cambiarle los signos al compare, o ponerle
		// un - al principio del return, usamos este método para invertir el orden.

		Collections.reverse(lista);
		imprimirLista();
	}
	
	public void cambiarPosicion(int indice1, int indice2) {
		
		Collections.swap(lista, indice1 - 1, indice2 - 1);
		// Le agrego un -1 a los números porque al empezar a contar por 0,
		// el usuario escogería sin quererlo la segunda opción al presionar 1.
		imprimirLista();
	}
	
	public void desordenarLista () {
		
		Collections.shuffle(lista);
		imprimirLista();
	}
	
	public void imprimirLista () {
		int contador=0;
		System.out.println();
		for (Alumno alumno : lista) {
			contador++;
			System.out.println(contador+". "+alumno);
		}
		System.out.println();
	}
}
