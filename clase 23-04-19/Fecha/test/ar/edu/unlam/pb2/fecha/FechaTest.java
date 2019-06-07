package ar.edu.unlam.pb2.fecha;

import org.junit.Assert;
import org.junit.Test;

public class FechaTest {
	
	@Test
	public void testQueSePuedaCrearUnaFecha() {
	// 1. Preparacion
		Integer dia = 23;
		Integer mes = new Integer (4); //Es lo mismo que dia y año, pero para escribirlo de otra forma
		Integer año = 2019;
		Fecha miFecha = new Fecha(dia, mes, año);
		
	// 2. Ejecución
		Integer diaObtenido = miFecha.getDia();
		
		
	// 3. Contrastación
		Assert.assertEquals(dia, diaObtenido);
	}
	
	@Test
	public void testQueDosFechasSeanIguales() {
		
		Fecha unaFecha = new Fecha(8,5,2017);
		Fecha otraFecha = new Fecha(8,5,2017);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = unaFecha.equals(otraFecha);
		Assert.assertEquals(valorEsperado, valorObtenido);
		// La comparación entre objetos es con Equals
		
		
		/*
		Integer diaUno = 9;
		Integer mesUno = 12;
		Integer añoUno = 2018;
		Integer diaDos = 9;
		Integer mesDos = 12;
		Integer añoDos = 2018;
		Fecha fechaUno = new Fecha(diaUno, mesUno, añoUno);
		Fecha fechaDos = new Fecha(diaDos, mesDos, añoDos);
		
		
		Integer diaObtenidoUno = fechaUno.getDia();
		Integer mesObtenidoUno = fechaUno.getMes();
		Integer añoObtenidoUno = fechaUno.getAño();
		Integer diaObtenidoDos = fechaDos.getDia();
		Integer mesObtenidoDos = fechaDos.getMes();
		Integer añoObtenidoDos = fechaDos.getAño();
		
		Assert.assertEquals(diaObtenidoUno, diaObtenidoDos);
		Assert.assertEquals(mesObtenidoUno, mesObtenidoDos);
		Assert.assertEquals(añoObtenidoUno, añoObtenidoDos);
		*/
	}

}
