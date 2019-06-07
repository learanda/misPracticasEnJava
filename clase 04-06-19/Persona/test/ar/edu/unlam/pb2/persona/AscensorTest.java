package ar.edu.unlam.pb2.persona;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AscensorTest {
	
	@Test
	public void testParaMeterUnaPersonaEnLaLista() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 80.0);
		
		miAscensor.subirPersona(tipito);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = miAscensor.obtenerCantidadPersonas();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void testParaVerElApellidoDeUnaPersonaDeLaLista() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 80.0);
		Persona tipitoDos = new Persona(12345999, "Lopez", 90.0);
		
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);
		
		// ArrayList<Persona> valorObtenido = miAscensor.getLista();		// me devuelve toda la lista
		// Persona valorObtenido = miAscensor.getLista().get(0);    		// me devuelve la persona de la posicion 0
		String valorObtenido = miAscensor.getLista().get(0).getApellido();  // me devuelve el apellido de la persona de la posicion 0
		String valorEsperado = "Gomez";
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void testParaComprobarElPesoActual() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 80.0);
		Persona tipitoDos = new Persona(12345999, "Lopez", 90.0);
		
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);
		
		Double valorEsperado = 170.0;
		Double valorObtenido = miAscensor.obtenerPesoActual();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void testQueNoPermitaExcederLaCantidadDePersonas() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 50.0);
		Persona tipitoDos = new Persona(12345999, "Lopez", 50.0);
		
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);
		// Lo compruebo contando el peso total de las 5 personas que deberian haber podido subir
		Double valorEsperado = 250.0;
		Double valorObtenido = miAscensor.obtenerPesoActual();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void testQueNoPermitaExcederElPesoMaximoDelAscensor() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 250.0);
		Persona tipitoDos = new Persona(12345999, "Lopez", 450.0);
		
		miAscensor.subirPersona(tipito);
		miAscensor.subirPersona(tipitoDos);

		// Lo compruebo verificando que solo subi� la 1er persona, que pesa 250
		Double valorEsperado = 250.0;
		Double valorObtenido = miAscensor.obtenerPesoActual();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void testQueVerificaQueUnaPersonaYaEstaEnElAscensor() {
		
		Ascensor miAscensor = new Ascensor(600.0, 5, null);
		Persona tipito = new Persona(12345678, "Gomez", 250.0);
		
		miAscensor.subirPersona(tipito);
		
		Assert.assertTrue(miAscensor.verificarSiEstaLaPersona());
		
		
	}
	
	

}
