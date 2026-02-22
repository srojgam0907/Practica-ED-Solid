package ejercicio3;

public class MainISP {

	public static void main(String[] args) {
		new MainISP().show();

	}
	
	public void show() {
		ImpresoraBasica basico= new ImpresoraBasica();
		Multifuncion avanzado= new Multifuncion();
		
		basico.imprimir("Hola mundo");
		
		avanzado.imprimir("Hola Mundo!");
		avanzado.escanear();
		avanzado.enviarFax("1234");
	}
	

}
