package ejercicio2;

public class Paypal implements IMetodoPago{

	@Override
	public void procesar(double cantidad) {
		System.out.println("Pagando con PayPal: " + cantidad + "€");
		
	}

}
