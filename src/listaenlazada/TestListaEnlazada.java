package listaenlazada;

public class TestListaEnlazada {

	public static void main(String[] args) {
		// creamos lista enlazada
		ListaEnlazada lista = new ListaEnlazada();
		lista.insertarPrincipio("putamierda");
		lista.insertarPrincipio("pues vaya");
		lista.verLista();
		/*en el nuevo nodo metemos a luismi, inicio apunta a luismi
		 * pero la condicion no se cumple ya que cuando llega hay un null
		 * y no se cumple el while, por eso no imrpime putamierda*/

	}

}
