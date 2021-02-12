package listaenlazada;
//fecha:12.2.2021
//popo
public class ListaEnlazada {
	//atributos, apunta o referencia al primer nodo de la lista
	Nodo inicio; 
	
	//constructor
	public ListaEnlazada ()
	{
		//una referencia de un objeto que no apunta a ningún sitio es null
			inicio=null;
	}
	/*método que inserta un nodo al principio de la lista*/
	public void insertarPrincipio (Object obj) {
		//creamos un nuevo nodo y enlazamos con el primero
		
		Nodo nuevo = new Nodo(obj,inicio);
		//actualizamos inicio
		inicio = nuevo;
	}
	//metodo para visualizar contenido de la lista
	
	public void verLista () {
		
		//nos situamos en el primer nodo de la lista
		Nodo actual = inicio;
		//recorremos toda la lista
		while(actual != null)//no puede ser actual.null, porwue no se imrpimiria el primer null {
			System.out.println(actual.info);
			//avanzamos al nodo siguiente
			actual = actual.enlace;
		}
	
	//metodo que inserta un  nodo al final de la lista
	public void insertarFinal (Object obj)
	{
	nuevo = new Nodo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}

