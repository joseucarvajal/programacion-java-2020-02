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
}
