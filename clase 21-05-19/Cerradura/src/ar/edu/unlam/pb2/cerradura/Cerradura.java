package ar.edu.unlam.pb2.cerradura;

public class Cerradura {
	
	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estado;
	private Integer cantidadDeIntentosCorrectos;
	private Integer cantidadDeIntentosFallidos;
	private Boolean bloqueo;

	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean, Boolean estado,
			Integer cantidadDeIntentosCorrectos,Integer cantidadDeIntentosFallidos, Boolean bloqueo) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estado = estado;
		this.cantidadDeIntentosCorrectos = cantidadDeIntentosCorrectos;
		this.cantidadDeIntentosFallidos = cantidadDeIntentosFallidos;
		this.bloqueo = bloqueo;
	}

	public void abrir(Integer clave) {
		if (this.bloqueo == false) {
			if(this.estado == false) {
				if (this.claveDeApertura == clave) {
					this.estado = true;
					this.cantidadDeIntentosCorrectos++;
					this.cantidadDeIntentosFallidos = 0;
				} else {
					this.cantidadDeIntentosFallidos++;
				}
			}
		}
	}

	public void cerrar() {
		this.estado = false;
	}

	public boolean estaAbierta() {
		if (this.estado == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaCerrada() {
		if (this.estado == false) {
			return true;
		} else {
			return false;
		}
	}

	public boolean fueBloqueada() {
		if (this.cantidadDeIntentosFallidos == this.cantidadDeFallosConsecutivosQueLaBloquean) {
			this.bloqueo = true;
		} else {
			this.bloqueo = false;
		}
		return bloqueo;
	}
}