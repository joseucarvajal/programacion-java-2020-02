package poo;

import javax.swing.tree.ExpandVetoException;

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
 * ------------------- 13 de agosto: ---------------------------------
 * 7. Cambiar todo el programa anterior para que utilice arreglos
 * 8. No permitir asignaturas repetidas
 * 
 * ------------------- 19 de agosto: ---------------------------------
 * 9. Implementar m�todo "addAsignatura", dentro de este m�todo se deben validar las
 * siguientes reglas:
 * 	a. 	No permitir asignaturas repetidas
 *  b. 	Cada estudiante tiene un n�mero m�ximo de cr�ditos y cada asignatura
 *     	tambi�n tien un n�mero m�ximo de cr�ditos. Si el estudiante no tiene 
 *  	suficientes cr�ditos para agregar la asignatura, el sistema debe indicarle
 *  	un error. 
 *  		EJ: Un estudiante tiene 8 cr�ditos
 *  			Agrega la asignatura X1 = 3 cr�ditos. Se agrega bien 
 *  			Agrega la asignatura X2 = 4 cr�ditos. Se agrega bien
 *  			Agrega la asignatura X3 = 3 cr�ditos. Sale error "No tiene cr�ditos suficientes"
 *  
 *  Pr�xima clase:
 *  	a.	Si sale alg�n error que no se termine el programa pero que muestre el error
 *  		y que los objetos que hay en memoria, no se borren.
 *  	b.	Terminar programa bajo cierto tipo de error (MaxAsignaturasException)
 * */
public class Program {

	public static void main(String[] args) throws Exception {
			
		//Crear un objeto Estudiante
		Estudiante e1 = new Estudiante(); //6 = ADICIONAR + 1 = 7, cancelar = -2 -> 4
		e1.nombre = "Pepito";
		e1.nroDeCreditos = 4;			
		
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
		as3.nroDeCreditos = 3;
		
		Asignatura as4 = new Asignatura();
		as4.nombre = "Arquitectura de software";
		as4.nota = 5;
		as4.nroDeCreditos = 1;
		
		try {
			e1.addAsignatura(as1);
			e1.addAsignatura(as2);
			e1.addAsignatura(as3);
			e1.addAsignatura(as4);			
			//c�digo a escribir si todo sale bien
			
			//Relaciones entre objetos
			//Relaci�n es: Un estudiante tiene 3 asignaturas.
			
			float promedioE1 = e1.calcularPromedio();
			System.out.println("Promedio e1: " + promedioE1);
			
		} catch (MaxAsignaturasException mae) {			//
			throw new Exception(mae.getMessage());
		} catch(CreditosInsuficientesException cie) {			
			System.out.println(cie.getMessage());
		} catch(Exception e) {
			System.out.println("Ocurri� un error inesperado");
		}		
	}

}
