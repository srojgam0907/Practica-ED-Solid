package ejercicio2;

public class PagoService {

	final IMetodoPago metodoPago;

	public PagoService(IMetodoPago metodo) {
		this.metodoPago = metodo;
	}
	
	public void pagar(double cantidad) {
		metodoPago.procesar(cantidad);
	}

}
