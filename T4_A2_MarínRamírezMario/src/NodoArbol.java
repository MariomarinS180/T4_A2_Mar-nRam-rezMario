public class NodoArbol {
	private NodoArbol nodoIzquierdo;
	private int dato; 
	private NodoArbol nodoDerecho;
	
	public NodoArbol() {}
	public NodoArbol(int dato) {
		this.nodoIzquierdo = null;
		this.dato = dato;
		this.nodoDerecho = null;
	}
	public NodoArbol getNodoIzquierdo() {
		return nodoIzquierdo;
	}

	public void setNodoIzquierdo(NodoArbol nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoArbol getNodoDerecho() {
		return nodoDerecho;
	}

	public void setNodoDerecho(NodoArbol nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}
	
	
	public String toString() {
		return "NodoArbol [nodoIzquierdo=" + nodoIzquierdo + ", dato=" + dato + ", nodoDerecho=" + nodoDerecho + "]";
	}
}
