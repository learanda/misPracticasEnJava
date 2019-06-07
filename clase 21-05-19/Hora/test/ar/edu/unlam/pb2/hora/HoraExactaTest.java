package ar.edu.unlam.pb2.hora;

import org.junit.Assert;
import org.junit.Test;

public class HoraExactaTest {
	
	@Test
	public void testQueAlIncrementarLaHoraDe235959de000000() {
		
		HoraExacta horaExacta = new HoraExacta(23, 59, 59);
		
		horaExacta.setSegundos(59);
		horaExacta.incrementar();
		horaExacta.setMinutos(59);
		horaExacta.setHora(23);
		Integer horaEsperada = 00;
		Integer minutoEsperado = 00;
		Integer segundoEsperado = 00;
		Integer horaObtenida = horaExacta.getHora();
		Integer minutoObtenido = horaExacta.getMinutos();
		Integer segundoObtenido = horaExacta.getSegundos();
		
		
		Assert.assertEquals(horaEsperada, horaObtenida);
		Assert.assertEquals(minutoEsperado, minutoObtenido);
		Assert.assertEquals(segundoEsperado, segundoObtenido);
	}

}
