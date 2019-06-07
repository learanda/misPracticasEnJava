package ar.edu.unlam.pb2.vehiculos;

public class Camion extends Vehiculo {
	
	private Integer numeroDeEjes;
	private Integer pesoMaximo;
	private Carga carga;
	private Boolean enMarcha;
	
	public Camion(Integer numeroDeEjes, Integer pesoMaximo, Integer peso, String descripcion, Boolean enMarcha,
			String marca, String modelo, Integer precio, String nomFabr, String calleFabr, Integer numFabr, String locFabr) {
		super(marca, modelo, precio, nomFabr, calleFabr, numFabr, locFabr);
		this.numeroDeEjes = numeroDeEjes;
		this.pesoMaximo = pesoMaximo;
		this.carga = new Carga(peso, descripcion);
		this.enMarcha = enMarcha;
	}

	public Integer getNumeroDeEjes() {
		return numeroDeEjes;
	}

	public void setNumeroDeEjes(Integer numeroDeEjes) {
		this.numeroDeEjes = numeroDeEjes;
	}

	public Integer getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public Boolean getEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(Boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	public Boolean agregarCarga(Integer carga) {	// Este método me genera dudas, pero al parecer va bien ;-)
		this.carga.setPeso(carga);
		if(carga <= this.pesoMaximo) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean arrancar() {
		this.enMarcha = true;
		return this.enMarcha;
	}
	
	public void descargar() {
		this.carga.setPeso(0);
	}
	

}
