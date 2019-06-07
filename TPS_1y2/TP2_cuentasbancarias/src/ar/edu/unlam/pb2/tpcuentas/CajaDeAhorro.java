package ar.edu.unlam.pb2.tpcuentas;

/*Similar a CuentaSueldo, 
 * pero se pide que luego de la quinta extracción de dinero 
 * se cobre un costo adicional por extracción de $6 */

public class CajaDeAhorro extends CuentaSueldo {
	
	private Integer contador;

	public CajaDeAhorro(Double saldo, Integer contador) {
		super(saldo);
		this.contador = contador;
	}
	
	@Override
	public void extraer(Double extraccion) {
		if(extraccion <= saldo) {
			this.saldo = saldo - extraccion;
			this.contador++;
		}
		if(this.contador > 5) {
			this.saldo -= 6.0;
		}
	}

	
	
}
