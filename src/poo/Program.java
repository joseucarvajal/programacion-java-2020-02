package poo;

/*
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. Cálculos:
 * 1. Promedio del semestre: OK
 * 2. Cuántas notas/asignaturas perdió.
 * 3. Cuántas asignaturas ganó
 * 4. Cada asignatura tiene un número de créditos, se debe indicar cuántos créditos
 * perdió y cuánto dinero debe pagar para repetir los créditos/asignatura. * 
 * 5. Crear al menos 5 estudiantes con diferentes valores
 * 6. Crear el proyecto en GitHub
 * */
public class Program {

	public static void main(String[] args) {
			
		//Crear un objeto Estudiante
		Estudiante e1 = new Estudiante();
		e1.nombre = "Pepito";
		
		//Crear 3 objetos Asignatura
		Asignatura as1 = new Asignatura();
		as1.nombre = "P.O.O";
		as1.nota = 3;
		as1.nroDeCreditos = 2;
		Asignatura as2 = new Asignatura();
		as2.nombre = "Estructuras de datos";
		as2.nota = 5;
		as2.nroDeCreditos = 2;
		Asignatura as3 = new Asignatura();
		as3.nombre = "Diseño de algoritmos";
		as3.nota = 2;
		as3.nroDeCreditos = 2;
		
		//Relaciones entre objetos
		//Relación es: Un estudiante tiene 3 asignaturas.
		e1.a1 = as1;
		e1.a2 = as2;
		e1.a3 = as3;
		
		float promedioE1 = e1.calcularPromedio();
		System.out.println("Promedio e1: " + promedioE1);
	}

}
