package poo;

//Clase
public class Estudiante {
	
	//Atributos
	String nombre;
	
	Asignatura[] asignaturas = new Asignatura[15];
	int cantAsignaturas = 0;
	
	//Métodos
	float calcularPromedio() {
		float prom = 0;
		
		for(int i = 0; i<cantAsignaturas; i++) {
			prom = prom + asignaturas[i].nota;
		}
		
		return prom / cantAsignaturas;
	}
	
}









