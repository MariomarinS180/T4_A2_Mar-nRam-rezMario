public class ArbolBinario {
	NodoArbol nodoRaiz; 
	
	//1 crear arbol
	public void crearArbol() {
		nodoRaiz = null;
		System.out.println("Se ha creado correctamente.");
	}
	//2 insertar nodo
	public void insertarNodo(int dato) {
		NodoArbol nuevoNodo = new NodoArbol(dato);
		if (nodoRaiz == null) {
			nodoRaiz = nuevoNodo;
		} else {
			NodoArbol aux = nodoRaiz;
			NodoArbol nodoAnterior;
			while (aux != null) {
				nodoAnterior = aux;
				if (dato >= aux.getDato()) { // derecho
					aux = aux.getNodoDerecho();
					if (aux == null) {
						nodoAnterior.setNodoDerecho(nuevoNodo);
					}
				} else { // izquierdo
					aux = aux.getNodoIzquierdo();
					if (aux == null) {
						nodoAnterior.setNodoIzquierdo(nuevoNodo);
					}
				}
			} // While
		}
	}// FIN -  Metodo Insertar Nodo
	
	//4 .- Mostrar Nodos
	public void mostrarTodosNodos(NodoArbol nodoRaiz) {
		if(!(nodoRaiz == null)) {
		mostrarTodosNodos(nodoRaiz.getNodoIzquierdo());
		mostrarTodosNodos(nodoRaiz.getNodoDerecho());
		System.out.print("("+nodoRaiz.getDato()+")-");
		}
	}
	public void recorridoPreorden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz == null)) {
			System.out.print(nodoRaiz.getDato() + " -> ");
			recorridoPreorden(nodoRaiz.getNodoIzquierdo());
			recorridoPreorden(nodoRaiz.getNodoDerecho());
		}
	}
	public void recorridoInorden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz == null)) {
			recorridoInorden(nodoRaiz.getNodoIzquierdo());
			System.out.print(nodoRaiz.getDato() + " -> ");
			recorridoInorden(nodoRaiz.getNodoDerecho());
		}
	} 
	public void recorridoPostOrden(NodoArbol nodoRaiz) {
		if(!(nodoRaiz == null)) {
			recorridoPostOrden(nodoRaiz.getNodoIzquierdo());
			recorridoPostOrden(nodoRaiz.getNodoDerecho());
			System.out.print(nodoRaiz.getDato() + " -> ");
		}
	}
	
	// 5.- Mostrar dato mayor
	public void datoMayor() {
		if(nodoRaiz != null) {
			NodoArbol mayor = nodoRaiz; 
			while(mayor.getNodoDerecho() != null) {
				mayor = mayor.getNodoDerecho();
			}
		System.out.println("Dato mayor: (" + mayor.getDato()+ ")");
		}
	}
	// 6.- Mostrar dato menor 
	public void datoMenor() {
		if(nodoRaiz != null) {
			NodoArbol menor = nodoRaiz; 
			while(menor.getNodoIzquierdo() != null) {
				menor = menor.getNodoIzquierdo();
			}
		System.out.println("Dato menor: (" + menor.getDato()+ ")");
		}
	}
	
	
}//class
