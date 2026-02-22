package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class InventarioService {

	private List<Libro> libros;
	
	public InventarioService() {
		this.libros= new ArrayList<>();
	}
	
	public void agregar(Libro libro) {
		libros.add(libro);  
	}
	
	public boolean eliminarPorIsbn(String isbn) {
		Libro libro= buscarPorIsbn(isbn);
		
		if(libro != null) {
			return libros.remove(libro); 
		}
		
		return false;
	}
	
	public Libro buscarPorIsbn(String isbn) {
		for (Libro libro: libros) {
			if(libro.getIsbn().equals(isbn)) {
				return libro; 
			}
		}
		return null;
	}
	
	public boolean estaDisponible(String isbn) {
		Libro libro= buscarPorIsbn(isbn);
		
		if(libro != null && libro.estaDisponible()) {
			return true;
			
		} else {
			return false; 
		}
	}
	
	public List<Libro> getLibros() {
		
		return libros; 
	}
}
 