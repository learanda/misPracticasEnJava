package ar.edu.unlam.pb2.fecha;

import org.junit.Assert;
import org.junit.Test;

public class FechaTest {
	
	@Test
	public void testQueSePuedaCrearUnaFecha() {
	// 1. Preparacion
		Integer dia = 23;
		Integer mes = new Integer (4); //Es lo mismo que dia y a�o, pero para escribirlo de otra forma
		Integer a�o = 2019;
		Fecha miFecha = new Fecha(dia, mes, a�o);
		
	// 2. Ejecuci�n
		Integer diaObtenido = miFecha.getDia();
		
		
	// 3. Contrastaci�n
		Assert.assertEquals(dia, diaObtenido);
	}
	
	@Test
	public void testQueDosFechasSeanIguales() {
		
		Fecha unaFecha = new Fecha(8,5,2017);
		Fecha otraFecha = new Fecha(8,5,2017);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = unaFecha.equals(otraFecha);
		Assert.assertEquals(valorEsperado, valorObtenido);
		// La comparaci�n entre objetos es con Equals
		
		
		/*
		Integer diaUno = 9;
		Integer mesUno = 12;
		Integer a�oUno = 2018;
		Integer diaDos = 9;
		Integer mesDos = 12;
		Integer a�oDos = 2018;
		Fecha fechaUno = new Fecha(diaUno, mesUno, a�oUno);
		Fecha fechaDos = new Fecha(diaDos, mesDos, a�oDos);
		
		
		Integer diaObtenidoUno = fechaUno.getDia();
		Integer mesObtenidoUno = fechaUno.getMes();
		Integer a�oObtenidoUno = fechaUno.getA�o();
		Integer diaObtenidoDos = fechaDos.getDia();
		Integer mesObtenidoDos = fechaDos.getMes();
		Integer a�oObtenidoDos = fechaDos.getA�o();
		
		Assert.assertEquals(diaObtenidoUno, diaObtenidoDos);
		Assert.assertEquals(mesObtenidoUno, mesObtenidoDos);
		Assert.assertEquals(a�oObtenidoUno, a�oObtenidoDos);
		*/
	}

}
