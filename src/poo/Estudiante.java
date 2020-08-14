package poo;

//Clase
public class Estudiante {
	
	//Atributos
	String nombre;
	
	static final int MAX_ASIGNATURAS = 8;
	Asignatura[] asignaturas = new Asignatura[Estudiante.MAX_ASIGNATURAS];
	int cantAsignaturas = 0;
	
	//M�todos
	float calcularPromedio() {
		float prom = 0;
		
		for(int i = 0; i<cantAsignaturas; i++) {
			prom = prom + asignaturas[i].nota;
		}
		
		return prom / cantAsignaturas;
	}
	
	public void addAsignatura(Asignatura a) throws Exception {
		
		if(cantAsignaturas == MAX_ASIGNATURAS) {
			throw new Exception("El estudiante ya tiene inscritas el m�ximo de asignaturas");			
		}
		
		asignaturas[cantAsignaturas] = a;
		cantAsignaturas++;
	}
}









