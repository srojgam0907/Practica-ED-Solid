package ejercicio2;

public class MainPago {

	public static void main(String[] args) {
		new MainPago(). show();

	}
	
	public void show() {
		IMetodoPago paypal= new Paypal();
		IMetodoPago Tcredito= new TarjetaCredito();
		
		PagoService servicio1= new PagoService(paypal);
		PagoService servicio2= new PagoService(Tcredito);
		
		servicio1.pagar(50);
		servicio2.pagar(25); 
		
	}

}
