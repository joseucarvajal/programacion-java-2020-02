package poo;

//Clase
public class Estudiante {
	
	//Atributos
	String nombre;
	Asignatura a1;
	Asignatura a2;
	Asignatura a3;
	
	
	//Métodos
	float calcularPromedio() {
		float prom = 0;
		prom = (a1.nota + a2.nota + a3.nota) / 3;
		return prom;
	}
	
}
