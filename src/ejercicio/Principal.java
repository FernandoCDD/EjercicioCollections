package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, cero = 0, indice = 0, indiceNuevoAlumno = 0;

		String nombre, apellido;

		List<Alumno> alumnos = new ArrayList<Alumno>();

		/*
		 * En este ejercicio tendremos una colección List con los alumnos de 1º DAM,
		 * donde con los métodos de la Clase Collections tendremos realizar las
		 * indicaciones que nos piden.
		 */

		// 1. Agregar alumnos con addAll.
		// 2. Buscar el alumno con el apellido más lejano alfabéticamente y 
		//		el alumno con el nombre más cercano.
		// 3. Reemplazar un alumno antiguo por uno nuevo.
		// 4. Invertir la lista.
		// 5. Intercambiar la posición de un alumno por otro
		// 6. Barajar la lista con Shuffle.
		// 7. Ordenar la lista por nombre
		// 8. Ordenar la lista por apellido.

		Alumno a1 = new Alumno("Pilar", "Aguilar");
		Alumno a2 = new Alumno("Pablo", "Cámara");
		Alumno a3 = new Alumno("Fernando", "Claro");
		Alumno a4 = new Alumno("Tomás", "Del Pino");
		Alumno a5 = new Alumno("José Carlos", "Fernández");
		Alumno a6 = new Alumno("Pedro", "Franch");
		Alumno a7 = new Alumno("Miguel", "Garfia");
		Alumno a8 = new Alumno("Abdelmonaim", "Hachim");
		Alumno a9 = new Alumno("Rafael", "Hernández");
		Alumno a10 = new Alumno("Alejandro", "Jiménez");
		Alumno a11 = new Alumno("Marisa", "Lozano");
		Alumno a12 = new Alumno("Alexander", "Luque");
		Alumno a13 = new Alumno("Mario", "Macho");
		Alumno a14 = new Alumno("Antonio", "Martínez");
		Alumno a15 = new Alumno("Daniel", "Martínez");
		Alumno a16 = new Alumno("Sebastián", "Millán");
		Alumno a17 = new Alumno("Manuel", "Molina");
		Alumno a18 = new Alumno("Miguel Ángel", "Perez");
		Alumno a19 = new Alumno("Marco", "Pertegal");
		Alumno a20 = new Alumno("Alvaro", "Polonio");
		Alumno a21 = new Alumno("Javier", "Prieto");
		Alumno a22 = new Alumno("Christian", "Pulido");
		Alumno a23 = new Alumno("Carlos", "Rasero");
		Alumno a24 = new Alumno("Roberto", "Rebolledo");
		Alumno a25 = new Alumno("Alejadro", "Rubens");
		Alumno a26 = new Alumno("Carlos", "Ruíz");
		Alumno a27 = new Alumno("Fran", "Ruíz");
		Alumno a28 = new Alumno("Jose Rafael", "Segura");

		// Los agregamos con addAll para mostrar su funcionamiento, pero hacerlo con
		// add y new Alumno funcionaría igual.

		Collections.addAll(alumnos, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18,
				a19, a20, a21, a22, a23, a24, a25, a26, a27, a28);

		GestionAlumno ga = new GestionAlumno(alumnos);

		System.out.println("Buenos días, esta es la lista de 1º DAM\n");
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
		}

		System.out.println();
		do {

			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Agregar Alumnos.");
			System.out.println("2. Buscar el alumno con el apellido más lejano alfabéticamente,\n"
							+ "y el alumno con el nombre más cercano alfabéticamente.");
			System.out.println("3. Reemplazar un alumno antiguo por uno nuevo.");
			System.out.println("4. Invertir la lista.");
			System.out.println("5. Intercambiar la posición de un alumno por otro.");
			System.out.println("6. Desordenar la lista.");
			System.out.println("7. Ordenar la lista por nombre (No natural)");
			System.out.println("8. Ordenar la lista por apellido (Natural)");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;

			case 1:
				System.out.println("Nombre del alumno?");
				nombre = Leer.dato();

				System.out.println("¿Apellido del alumno?");
				apellido = Leer.dato();

				Alumno a = new Alumno(nombre, apellido);

				Collections.addAll(alumnos, a);
				System.out.println();
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			case 2:

				System.out.println("Apellido más lejano: " + Collections.max(alumnos));
				System.out.println("Nombre más cercano: " + Collections.min(alumnos, new OrdenarPorNombre()));
				System.out.println();
				break;

			case 3:
				// En este método creamos un alumno nuevo, y remplazamos su nombre y apellido
				// pero no su número, que se lo damos al nuevo alumno.

				System.out.println("¿Nombre del nuevo alumno?");
				nombre = Leer.dato();
				System.out.println("¿Apelido?");
				apellido = Leer.dato();

				System.out.println("¿En que índice está el alumno al que quieres cambiar?");
				indice = Leer.datoInt();

				Alumno nuevo = new Alumno(nombre, apellido);

				Collections.replaceAll(alumnos, alumnos.get(indice - 1), nuevo);
				// Pongo -1 porque el usuario al meter un número no sabe que empieza por 0.
				// y pone un alumno más del que quiera.
				System.out.println();
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				
				break;

			case 4:
				// En este método en vez de cambiarle los signos al compare, o ponerle
				// un - al principio del return, usamos este método para invertir el orden.

				Collections.reverse(alumnos);
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			case 5:

				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				System.out.println("Índice del alumno que quieres mover?");
				indice = Leer.datoInt();

				System.out.println("¿Índice del alumno por el que lo quieres cambiar?");
				indiceNuevoAlumno = Leer.datoInt();

				Collections.swap(alumnos, indice - 1, indiceNuevoAlumno - 1);

				// Le agrego un -1 a los números porque al empezar a contar por 0,
				// el usuario escogería sin quererlo la segunda opción al presionar 1.

				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			case 6:

				Collections.shuffle(alumnos);
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			case 7:
				Collections.sort(alumnos, new OrdenarPorNombre());
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			case 8:
				Collections.sort(alumnos);
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println((i + 1) + ". " + alumnos.toArray()[i]);
				}
				System.out.println();
				break;

			default:
				System.out.println("Escoja una opción válida.");
				System.out.println();
				break;
			}
		} while (opcion != cero);
	}

}