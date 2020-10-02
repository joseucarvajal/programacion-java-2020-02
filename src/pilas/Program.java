package pilas;

public class Program {

	public static void main(String[] args) {
				
		PilaAsignatura pilaAsignaturas = fillStack();		
		float promedio = calcularPromedioNotas(pilaAsignaturas);
		System.out.println("El promedio de las notas es: " + promedio);
		
		pilaAsignaturas = fillStack();
		float menor = getAsignaturaMenorNota(pilaAsignaturas);
		System.out.println("La menor nota es: " + menor);
	}
	
	public static PilaAsignatura fillStack() {
		PilaAsignatura pilaAsignaturas = new PilaAsignatura();
		
		Asignatura a1 = new Asignatura();
		a1.nombre = "Programación";
		a1.nota = 1.7f;
		pilaAsignaturas.push(a1);
		
		Asignatura a2 = new Asignatura();
		a2.nombre = "Estructuras de datos";
		a2.nota = 3.1f;
		pilaAsignaturas.push(a2);
	
		Asignatura a3 = new Asignatura();
		a3.nombre = "Algoritmos";
		a3.nota = 4.5f;
		pilaAsignaturas.push(a3);

		Asignatura a4 = new Asignatura();
		a4.nombre = "Programación Dinámica";
		a4.nota = 3f;
		pilaAsignaturas.push(a4);

		return pilaAsignaturas;
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
	
	public static float getAsignaturaMenorNota(PilaAsignatura pilaAsignaturas) {
		float menor = pilaAsignaturas.pop().nota;
		
		while(pilaAsignaturas.estaVacia() == false) {
			float nota = pilaAsignaturas.pop().nota;
			if(nota < menor) {
				menor = nota;
			}
		}
		
		return menor;
	}

}
