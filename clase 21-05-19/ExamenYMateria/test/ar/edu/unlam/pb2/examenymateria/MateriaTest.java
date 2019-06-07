package ar.edu.unlam.pb2.examenymateria;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {
	
	@Test
	public void testQueVerificaNotaExamenUno() {
		
		Materia miMateria = new Materia();
		miMateria.evaluar(1, 9);
		
		Integer ve = 9;
		Integer vo = miMateria.getExamenUno().getNota();
		// miMateria.getExamenUno() eso es un examen, y con getNota() obtengo la nota de ese examen
		
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	public void testQueVerificaNotaExamenDos() {
		
		Materia miMateria = new Materia();
		miMateria.evaluar(2, 8);
		
		Integer ve = 8;
		Integer vo = miMateria.getExamenDos().getNota();
		// miMateria.getExamenUno() eso es un examen, y con getNota() obtengo la nota de ese examen
		
		Assert.assertEquals(ve, vo);
	}

}
