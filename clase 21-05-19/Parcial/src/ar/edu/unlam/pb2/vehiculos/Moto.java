package ar.edu.unlam.pb2.vehiculos;

public class Moto extends Vehiculo{
	
	private Integer cilindrada;
	private Integer velocidadMaxima;
	private Integer velocidadActual;
	
	public Moto(Integer cilindrada, Integer velocidadMaxima, Integer velocidadActual, String marca, String modelo,
			Integer precio, String nomFabr, String calleFabr, Integer numFabr, String locFabr) {
		super(marca, modelo, precio, nomFabr, calleFabr, numFabr, locFabr);
		this.cilindrada = cilindrada;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	
	public void incrementarVelocidad() {
		if(velocidadActual < velocidadMaxima) {
			this.velocidadActual++;
		} // No se puede pasar de la velocidad máxima, por eso uso el if
	}
	
	public void incrementaVelocidad(Integer velocidad) {
		if(velocidad <= velocidadMaxima) {
			this.velocidadActual = velocidad;
		} else {
			this.velocidadActual = velocidadMaxima;
		}
	} // Hago que verifique que no se pase de la velocidad máxima, y si se pasa lo dejo en la velocidad máxima
	  // porque después de todo lo quería acelerar.
	
}
