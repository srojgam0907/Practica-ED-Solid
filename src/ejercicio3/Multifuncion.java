package ejercicio3;

public class Multifuncion implements FuncionBasica, FuncionAvanzada{

	@Override
	public void escanear() {
		System.out.println("Escaneando...");
		
	}

	@Override
	public void enviarFax(String numero) {
		System.out.println("Enviando a: " + numero);
		
	}

	@Override
	public void imprimir(String texto) {
		System.out.println("Imprimiendo: " + texto);
		
	}

}
