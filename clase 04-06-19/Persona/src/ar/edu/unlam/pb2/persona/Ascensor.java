package ar.edu.unlam.pb2.persona;

import java.util.ArrayList;

// los list admiten duplicados y los va agregando a donde van o se puede establecer la posicion
// los set no admiten duplicados y se pueden ir ordenando en base a un algoritmo

public class Ascensor {
	
	private Double capMaxima;
	private Integer cantPersonasMax;
	ArrayList<Persona> lista = new ArrayList<Persona>();
	
	public Ascensor(Double capMaxima, Integer cantPersonasMax, ArrayList<Persona> lista) {
		this.capMaxima = capMaxima;
		this.cantPersonasMax = cantPersonasMax;
		this.lista = new ArrayList<Persona>();
	}

	public Double getCapMaxima() {
		return capMaxima;
	}

	public void setCapMaxima(Double capMaxima) {
		this.capMaxima = capMaxima;
	}

	public Integer getCantPersonasMax() {
		return cantPersonasMax;
	}

	public void setCantPersonasMax(Integer cantPersonasMax) {
		this.cantPersonasMax = cantPersonasMax;
	}
	
	public void subirPersona(Persona persona) {
		
		if(obtenerPesoActual() < capMaxima && obtenerCantidadPersonas() < cantPersonasMax) {
			lista.add(persona);
		} if(obtenerPesoActual() > capMaxima) {
			lista.remove(persona);
		}
	}

	public Integer obtenerCantidadPersonas() {
		return lista.size();
	}

	public ArrayList<Persona> getLista() {
		return lista;
	}
	
	public Double obtenerPesoActual() {
		Double suma = 0.0;
		for(Persona personaUno:lista) {	// se va a repetir el for mientras haya elementos en la lista. "For each"
			suma+= personaUno.getPeso();
		}
		return suma;
	}
	
	public Boolean verificarSiEstaLaPersona() {
		Boolean esta = false;
		for(Persona personaUno:lista) {
			if(personaUno.equals(personaUno)){
				esta = true;
			}
			else {
				esta = false;
			}
		}
		return esta;
	}
	
	
	// investigar iterator para recorrer arraylist. C�mo recorrer el Arraylist
	

}
