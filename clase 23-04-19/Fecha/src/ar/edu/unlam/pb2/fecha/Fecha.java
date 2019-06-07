package ar.edu.unlam.pb2.fecha;

public class Fecha {
	
	private Integer dia, mes, a�o;
	
	public Fecha() {
		
	}
	
	public Fecha(Integer dia, Integer mes, Integer a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a�o == null) ? 0 : a�o.hashCode());
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (a�o == null) {
			if (other.a�o != null)
				return false;
		} else if (!a�o.equals(other.a�o))
			return false;
		if (dia == null) {
			if (other.dia != null)
				return false;
		} else if (!dia.equals(other.dia))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}
	
	
	
	

}
