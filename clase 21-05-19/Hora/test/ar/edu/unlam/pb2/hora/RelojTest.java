package ar.edu.unlam.pb2.hora;

import org.junit.Assert;
import org.junit.Test;

public class RelojTest {
	
	@Test
	public void testQueVerificaQueElDespertadorEstaSonando() {
		
		Reloj miReloj = new Reloj(8, 29, 8, 30, false);
		
		miReloj.iniciar();
		
		Assert.assertTrue(miReloj.getSonar());
	}
	
	@Test
	public void testQueVerificaQueLaHoraDeLaAlarmaSeaCorrecta() {
		
		Reloj miReloj = new Reloj(8, 29, 8, 30, false);
		
		miReloj.iniciar();
		Integer horaEsperada = miReloj.getReloj().getHora();
		Integer minutoEsperado = miReloj.getReloj().getMinutos();
		Integer horaObtenida = miReloj.getAlarma().getHora();
		Integer minutoObtenido = miReloj.getAlarma().getMinutos();
		
		Assert.assertEquals(horaEsperada, horaObtenida);
		Assert.assertEquals(minutoEsperado, minutoObtenido);
		
	}

}
