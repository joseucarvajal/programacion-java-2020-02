package colas;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaClientes colaClientes = new ColaClientes();
		
		Cliente c1 = new Cliente();
		c1.documento = "1";
		c1.nombre = "Pepito";
		c1.valorAConsignar = 100;

		Cliente c2 = new Cliente();
		c2.documento = "1";
		c2.nombre = "Carlitos";
		c2.valorAConsignar = 200;
		
		colaClientes.enqueue(c2);
		colaClientes.enqueue(c1);
		

		float valorTotalConsignaciones = 0;
		
		
		while(colaClientes.tamaño > 0) {
			Cliente c = colaClientes.dequeue();
			valorTotalConsignaciones = valorTotalConsignaciones + c.valorAConsignar;
		}
		
		System.out.println("Valor total del banco en consignaciones: " + valorTotalConsignaciones);
	}

}
