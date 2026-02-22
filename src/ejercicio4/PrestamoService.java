package ejercicio4;

public class PrestamoService {

	private InventarioService inventario;
	
	public PrestamoService(InventarioService inventario) {
		this.inventario= inventario;
	}
	
	public boolean prestar(String isbn) {
		Libro libro= inventario.buscarPorIsbn(isbn);
		
		if(libro != null && libro.estaDisponible()) {
			libro.setEstado(EstadoLibro.PRESTADO);
			return true;
			
		} else {
			return false; 
		}
	}
	
	public boolean devolver(String isbn) {
		Libro libro = inventario.buscarPorIsbn(isbn);

		if (libro != null && !libro.estaDisponible()) {
			libro.setEstado(EstadoLibro.DISPONIBLE);
			return true; 

		} else {
			return false;
		}

	}
}
