package ar.edu.unlam.pb2.hora;

public class Hora {
	
	protected Integer hora;
	protected Integer minutos;
	
	public Hora(Integer hora, Integer minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		if(minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}
	
	public void incrementar() {
		this.minutos++;
	}

}
