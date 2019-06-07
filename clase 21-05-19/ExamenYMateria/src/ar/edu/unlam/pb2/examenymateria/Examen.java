package ar.edu.unlam.pb2.examenymateria;

public class Examen {
	
	private Integer nota;
	
	public Examen(Integer nota) {
		this.nota = nota;
	}
	
	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public void calificar(Integer nota) {
		this.nota = nota;
	}

}
