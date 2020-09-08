package listas.enlazadas;

public class ListInt {
	NodoInt head;
	
	public void insert(int value) {
		NodoInt newNodo = new NodoInt();
		newNodo.data = value;
		
		//Lista está vacía
		if(head == null) {
			head = newNodo;
		}
		else {
			NodoInt tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNodo;
		}
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("La lista está vacía");
		}
		else {
			NodoInt tmp = head;
			while(tmp != null) {
				System.out.print(tmp.data + ", ");
				tmp = tmp.next;
			}
		}	
	}
	
	public void insert(int value, int p) {
		
		NodoInt nuevo = new NodoInt();
		nuevo.data = value;
		
		if(head == null && p == 0) {
			head = nuevo;
		}
		else {
			int count = 0;
			NodoInt tmp = head;
			while(tmp != null) {				
				if(count == p-1) {
					nuevo.next = tmp.next;
					tmp.next = nuevo;
					break;
				}
				count++;
				tmp = tmp.next;
			}
		}		
	}
	
	public int sumarElementos() {
		int sum = 0;
		if(head == null) {
			return sum;
		}
		
		NodoInt tmp = head;
		while(tmp != null) {
			sum = sum + tmp.data;
			tmp = tmp.next;
		}
		
		return sum;
	}
}
