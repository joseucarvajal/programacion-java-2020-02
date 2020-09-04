package listas.enlazadas;

public class ProgramListInt {

	public static void main(String[] args) {
		
		ListInt list = new ListInt();
		list.insert(9);
		list.insert(5);
		list.insert(3);
		list.insert(38);
		list.insert(7, 2);
		
		list.printList();

	}

}
