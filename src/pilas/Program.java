package pilas;

public class Program {

	public static void main(String[] args) {
		
		PilaAsignatura pilaAsignaturas = new PilaAsignatura();
		
		Asignatura a1 = new Asignatura();
		a1.nombre = "Programación";
		a1.nota = 3.7f;
		pilaAsignaturas.push(a1);
		
		Asignatura a2 = new Asignatura();
		a2.nombre = "Estructuras de datos";
		a2.nota = 5f;
		pilaAsignaturas.push(a2);
	
		Asignatura a3 = new Asignatura();
		a3.nombre = "Algoritmos";
		a3.nota = 4.5f;
		pilaAsignaturas.push(a3);
		
		float promedio = calcularPromedioNotas(pilaAsignaturas);
		System.out.print("El promedio de las notas es: " + promedio);		
	}
	
	public static float calcularPromedioNotas(PilaAsignatura pilaAsignaturas) {
		float suma = 0;
		int cantidadAsignaturas = 0;
		while(pilaAsignaturas.estaVacia() == false) {
			Asignatura asignatura = pilaAsignaturas.pop();
			suma = suma + asignatura.nota;
			cantidadAsignaturas++;
		}
		
		float promedio = suma/cantidadAsignaturas;
		
		return promedio;
	}

}
