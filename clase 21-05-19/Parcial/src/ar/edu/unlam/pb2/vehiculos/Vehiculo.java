package ar.edu.unlam.pb2.vehiculos;

public class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected Integer precio;
	protected Fabricante fabricante;
	
	public Vehiculo(String marca, String modelo, Integer precio, String nomFabr, String calleFabr, Integer numFabr, String locFabr) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fabricante = new Fabricante(nomFabr, calleFabr, numFabr, locFabr);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}
