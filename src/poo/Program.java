package poo;

/*
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. C�lculos:
 * 
 * ---- 09 de agosto
 * 1. Promedio del semestre: OK
 * 2. Cu�ntas notas/asignaturas perdi�.
 * 3. Cu�ntas asignaturas gan�
 * 4. Cada asignatura tiene un n�mero de cr�ditos, se debe indicar cu�ntos cr�ditos
 * perdi� y cu�nto dinero debe pagar para repetir los cr�ditos/asignatura. * 
 * 5. Crear al menos 5 estudiantes con diferentes valores
 * 6. Crear el proyecto en GitHub * 
 * 
 * ---- 13 de agosto:
 * 7. Cambiar todo el programa anterior para que utilice arreglos
 * 8. No permitir asignaturas repetidas
 * */
public class Program {

	public static void main(String[] args) {
			
		//Crear un objeto Estudiante
		Estudiante e1 = new Estudiante(); //6 = ADICIONAR + 1 = 7, cancelar = -2 -> 4
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
		as3.nombre = "Dise�o de algoritmos";
		as3.nota = 2;
		as3.nroDeCreditos = 2;
		
		Asignatura as4 = new Asignatura();
		as3.nombre = "Dise�o de algoritmos";
		as3.nota = 5;
		as3.nroDeCreditos = 3;
		
		e1.asignaturas[0] = as1;
		e1.cantAsignaturas++;
		
		e1.asignaturas[1] = as3;
		e1.cantAsignaturas++;
		
		e1.asignaturas[2] = as3;
		e1.cantAsignaturas++;
		
		e1.asignaturas[3] = as3;
		e1.cantAsignaturas++;
		
		//Relaciones entre objetos
		//Relaci�n es: Un estudiante tiene 3 asignaturas.
		
		float promedioE1 = e1.calcularPromedio();
		System.out.println("Promedio e1: " + promedioE1);
	}

}
