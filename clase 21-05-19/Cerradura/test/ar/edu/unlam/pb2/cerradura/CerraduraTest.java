package ar.edu.unlam.pb2.cerradura;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {
	
	@Test
	public void queUnaCerraduraNuevaEstaCerrada() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, false, 0, 0, false);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = miCerradura.estaCerrada();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, false, 0, 0, false);
		
		miCerradura.abrir(1234);
		
		Assert.assertTrue(miCerradura.estaAbierta());
		
	}
	
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, false, 0, 0, false);
		
		miCerradura.abrir(5641);
		
		Assert.assertTrue(miCerradura.estaCerrada());
		
	}
	
	@Test
	public void queIngresoIncorrectamenteTresVecesYSeBloquea() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, false, 0, 0, false);
		
		miCerradura.abrir(5641);
		miCerradura.abrir(5641);
		miCerradura.abrir(5641);
		
		Assert.assertTrue(miCerradura.fueBloqueada());
		
	}
	
	@Test
	public void queUnaCerraduraNuevaComienzaAbierta() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, true, 0, 0, false);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = miCerradura.estaAbierta();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void queUnaCerraduraNuevaComienzaAbiertaYLaCierro() {
		
		Cerradura miCerradura = new Cerradura(1234, 3, true, 0, 0, false);
		
		miCerradura.cerrar();
		
		Assert.assertTrue(miCerradura.estaCerrada());
		
	}

}
