package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class InformeService {

	public String informeDetallado(List<Libro> libros) {
		return "----INFORME DETALLADO----\n" + listar(libros);
	}
	
	public String informeDisponibles(List<Libro> libros) {
		List<Libro> disponibles= filtrarPorEstado(libros, EstadoLibro.DISPONIBLE);
		return "----INFORME DISPONIBLES----" + listar(disponibles);
	}
	
	public String informePrestados(List<Libro> libros) {
		List<Libro> prestados= filtrarPorEstado(libros, EstadoLibro.PRESTADO);
		return "----INFORME PRESTADOS----" + listar(prestados);
	}
	
	private List<Libro> filtrarPorEstado(List<Libro> libros, EstadoLibro estado) {
		List<Libro> filtrados= new ArrayList<>();
		
		for(int i=0; i<libros.size(); i++) {
			Libro libro= libros.get(i);
			
			if(libro.getEstado() == estado) {
				filtrados.add(libro);
			}
		}
		
		return filtrados; 
	}
	
	private String listar(List<Libro> libros) {
		String listaLibros= "";
		
		for(int i=0; i<libros.size(); i++) {
			Libro libro= libros.get(i);
			
			listaLibros += "\nTitulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nIsbn: " + libro.getIsbn() + "\nEstado: " + libro.getEstado() + "\n";
		}
		
		return listaLibros; 
	}
	
}
