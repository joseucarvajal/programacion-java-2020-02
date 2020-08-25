package poo;

import javax.swing.tree.ExpandVetoException;

/*
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. Cálculos:
 * 
 * ---- 09 de agosto
 * 1. Promedio del semestre: OK
 * 2. Cuántas notas/asignaturas perdió.
 * 3. Cuántas asignaturas ganó
 * 4. Cada asignatura tiene un número de créditos, se debe indicar cuántos créditos
 * perdió y cuánto dinero debe pagar para repetir los créditos/asignatura. * 
 * 5. Crear al menos 5 estudiantes con diferentes valores
 * 6. Crear el proyecto en GitHub * 
 * 
 * ------------------- 13 de agosto: ---------------------------------
 * 7. Cambiar todo el programa anterior para que utilice arreglos
 * 8. No permitir asignaturas repetidas
 * 
 * ------------------- 19 de agosto: ---------------------------------
 * 9. Implementar método "addAsignatura", dentro de este método se deben validar las
 * siguientes reglas:
 * 	a. 	No permitir asignaturas repetidas
 *  b. 	Cada estudiante tiene un número máximo de créditos y cada asignatura
 *     	también tien un número máximo de créditos. Si el estudiante no tiene 
 *  	suficientes créditos para agregar la asignatura, el sistema debe indicarle
 *  	un error. 
 *  		EJ: Un estudiante tiene 8 créditos
 *  			Agrega la asignatura X1 = 3 créditos. Se agrega bien 
 *  			Agrega la asignatura X2 = 4 créditos. Se agrega bien
 *  			Agrega la asignatura X3 = 3 créditos. Sale error "No tiene créditos suficientes"
 *  
 *  Próxima clase:
 *  	a.	Si sale algún error que no se termine el programa pero que muestre el error
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
		as3.nombre = "Diseño de algoritmos";
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
			//código a escribir si todo sale bien
			
			//Relaciones entre objetos
			//Relación es: Un estudiante tiene 3 asignaturas.
			
			float promedioE1 = e1.calcularPromedio();
			System.out.println("Promedio e1: " + promedioE1);
			
		} catch (MaxAsignaturasException mae) {			//
			throw new Exception(mae.getMessage());
		} catch(CreditosInsuficientesException cie) {			
			System.out.println(cie.getMessage());
		} catch(Exception e) {
			System.out.println("Ocurrió un error inesperado");
		}		
	}

}
