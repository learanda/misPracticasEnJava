package ar.edu.unlam.pb2.hora;

public class HoraExacta extends Hora {
	
	private Integer segundos;

	public HoraExacta(Integer hora, Integer minutos, Integer segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	@Override
	public Integer getHora() {
		return super.getHora();
	}

	@Override
	public void setHora(Integer hora) {
		super.setHora(hora);
		if(super.getMinutos() == 00 && hora == 23) {
			super.setHora(00);
		}
	}

	@Override
	public Integer getMinutos() {
		return super.getMinutos();
	}

	@Override
	public void setMinutos(Integer minutos) {
		super.setMinutos(minutos);
		if(getSegundos() == 60) {
			this.segundos = 00;
			super.setMinutos(00);
		}
	}

	@Override
	public void incrementar() {
		this.segundos++;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		if(segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}	
	
}
