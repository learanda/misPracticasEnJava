package ar.edu.unlam.pb2.examenymateria;

public class Materia {
	
	private Examen examenUno;
	private Examen examenDos;
	
	public Materia() {
		examenUno = new Examen(null);
		examenDos = new Examen(null);
	}
	
	public Examen getExamenUno() {
		return examenUno;
	}

	public void setExamenUno(Examen examenUno) {
		this.examenUno = examenUno;
	}

	public Examen getExamenDos() {
		return examenDos;
	}

	public void setExamenDos(Examen examenDos) {
		this.examenDos = examenDos;
	}

	public void evaluar(Integer numExamen, Integer nota) {
		if(numExamen == 1) {
			examenUno.calificar(nota);
		} if(numExamen == 2) {
			examenDos.calificar(nota);
		}
	}

}
