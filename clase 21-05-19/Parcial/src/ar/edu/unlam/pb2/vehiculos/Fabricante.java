package ar.edu.unlam.pb2.vehiculos;

public class Fabricante {
	
	private String nombre;
	private Direccion direccion;
	
	public Fabricante(String nombre, String calle, Integer numero, String localidad) {
		this.nombre = nombre;
		this.direccion = new Direccion(calle, numero, localidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
