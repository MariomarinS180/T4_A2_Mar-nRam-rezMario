import java.util.Scanner;
public class Prueba {
	public static void main(String[] args) {
		ArbolBinario ab = new ArbolBinario(); 
		Scanner e = new Scanner(System.in);
		byte opc = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		System.out.println("Arbol Binarios de BÚSQUEDA - Prueba");
		System.out.println("===================================");
		do {
		System.out.println("Que desea hacer:\n1)Crear ARBOL\n2)Insertar NODO\n3)Mostrar TODOS los NODOS\n4)Forma Preorden\n5)Forma Inorden\n6)Forma Postorden\n7)Mostrar dato mayor\n8)Mostrar dato menor\n9)Salir");
		System.out.println("===================================");
		opc = e.nextByte();
			switch (opc) {
			case 1: ab.crearArbol();
				break;
			case 2:
			System.out.println("Ingrese 5 Nodos: ");
			System.out.print("N1: ");
			n1 = e.nextInt();
			System.out.print("N2: ");
			n2 = e.nextInt();
			System.out.print("N3: ");
			n3 = e.nextInt();
			System.out.print("N4: ");
			n4 = e.nextInt();
			System.out.print("N5: ");
			n5 = e.nextInt();
			ab.insertarNodo(n1);
			ab.insertarNodo(n2);
			ab.insertarNodo(n3);
			ab.insertarNodo(n4);
			ab.insertarNodo(n5);
				break;
			case 3:
				if( n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
				System.out.println("Primero llene los NODOS");
				}else {
				ab.mostrarTodosNodos(ab.nodoRaiz);	
				}
				break;
			case 4:
				if( n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
					System.out.println("Primero llene los NODOS");
				}else{
					ab.recorridoPreorden(ab.nodoRaiz);
				}
				break;
			case 5: 
				if( n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
					System.out.println("Primero llene los NODOS");
				}else{
					ab.recorridoInorden(ab.nodoRaiz);
				}
				break;
			case 6: 
				if( n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
					System.out.println("Primero llene los NODOS");
				}else{
					ab.recorridoPostOrden(ab.nodoRaiz);
				}
				break;
			case 7:
				ab.datoMayor();
				break;
			case 8:
				ab.datoMenor();
				break;
			case 9:
				System.out.println("Salió...");
				break;
			default:
				System.out.println("No esta en la lista");
				break;
			}
		} while (opc != 9);		
		e.close();
	}//main
}//class
