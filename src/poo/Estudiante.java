package poo;

//Clase
public class Estudiante {
	
	//Atributos
	String nombre;
	
	static final int MAX_ASIGNATURAS = 15;
	Asignatura[] asignaturas = new Asignatura[Estudiante.MAX_ASIGNATURAS];
	int cantAsignaturas = 0;
	
	int nroDeCreditos;	
	
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
			throw new MaxAsignaturasException("El estudiante ya tiene inscritas el m�ximo de asignaturas");			
		}
		
		int creditosHastaElMomento = 0;
		for(int i = 0; i<cantAsignaturas; i++) {
			creditosHastaElMomento = creditosHastaElMomento + asignaturas[i].nroDeCreditos;
		}			
		
		creditosHastaElMomento = creditosHastaElMomento + a.nroDeCreditos;
		if(creditosHastaElMomento > nroDeCreditos) {
			throw new CreditosInsuficientesException("El estudiante no tiene cr�ditos suficientes para inscribir " + a.nombre);
		}
		
		asignaturas[cantAsignaturas] = a;
		cantAsignaturas++;				
	}
}









