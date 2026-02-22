package ejercicio2;

public class TarjetaCredito implements IMetodoPago{
	
	@Override
	public void procesar(double cantidad) {
		System.out.println("Pagando con Tarjeta de Crédito: " + cantidad + "€");
		
	}

}
