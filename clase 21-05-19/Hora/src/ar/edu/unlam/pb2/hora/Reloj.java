package ar.edu.unlam.pb2.hora;

public class Reloj {
	
	private Hora alarma;
	private Hora reloj;
	private Boolean sonar;
	
	public Reloj(Integer horaAlarma, Integer minutosAlarma, Integer horaReloj, Integer minutosReloj, Boolean sonar) {
		this.alarma = new Hora(horaAlarma, minutosAlarma); // Composición, tengo un objeto de la clase Hora dentro de reloj
		this.reloj = new Hora(horaReloj, minutosReloj);  // Composición, otro objeto de la clase Hora
		this.sonar = sonar;
	}
	
	public Hora getAlarma() {
		return alarma;
	}

	public Hora getReloj() {
		return reloj;
	}

	public void setSonar(Boolean sonar) {
		this.sonar = sonar;
	}

	public Boolean getSonar() {
		return sonar;
	}

	public void iniciar() {
		while(true) {
			reloj.incrementar();    // Incrementa 1 minuto
			if(this.alarma.getHora() == this.reloj.getHora() && this.alarma.getMinutos() == this.reloj.getMinutos()) {
				this.sonar = true;
				break;
			}
		}
	}
	
}
