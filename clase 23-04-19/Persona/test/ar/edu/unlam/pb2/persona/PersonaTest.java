package ar.edu.unlam.pb2.persona;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
	
	@Test
	public void testQueDosPersonasSeanIguales() {
		Persona personaUno = new Persona(12345678, "Pepito", 30);
		Persona personaDos = new Persona(12345678, "Juan", 26);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = personaUno.equals(personaDos);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
