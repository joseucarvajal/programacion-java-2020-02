package colas;

public class ColaClientes {

	NodoCliente head;
	NodoCliente tail;
	int tamaño = 0;
	
	public void enqueue(Cliente cliente) {
		
		NodoCliente nuevoNodo = new NodoCliente();
		nuevoNodo.cliente = cliente;
		
		if(head == null) {
			head = nuevoNodo;
			tail = nuevoNodo;
		}
		else {
			tail.next = nuevoNodo;
			tail = nuevoNodo;
		}
		
		tamaño++;
	}
	
	public Cliente dequeue() {
		if(head == null) {
			return null;
		}
		
		Cliente cliente = head.cliente;
		head = head.next;
		
		tamaño--;
		return cliente;
	}
	
}
