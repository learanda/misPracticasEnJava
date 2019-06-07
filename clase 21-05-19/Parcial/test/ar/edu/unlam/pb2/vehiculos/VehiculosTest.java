package ar.edu.unlam.pb2.vehiculos;

import org.junit.Assert;
import org.junit.Test;

public class VehiculosTest {
	
	@Test
	public void testQueVerifiqueLaCalleDelFabricanteDeUnVehiculo() {
		
		Moto moto = new Moto(350, 250, 0, "Zanella", "Rx 350", 200000, "Zan", "Mitre", 11099, "Buenos Aires");
		
		String valorEsperado = "Mitre";
		String valorObtenido = moto.getFabricante().getDireccion().getCalle();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueVerifiqueArrancarUnCamion() {
		
		Camion camion = new Camion(2, 20000, 8000, "Premium", false, "Kamaz", "6520", 2000000, "Kamaz TF", "Naberezhnye Chelny", 423888, "Respublika Tatarstan");
		
		Boolean valorObtenido = camion.arrancar();
		
		Assert.assertTrue(valorObtenido);
	}
	
	@Test
	public void testQueDescargueTodasLasCargas() {
		
		Camion camion = new Camion(2, 20000, 8000, "Premium", false, "Kamaz", "6520", 2000000, "Kamaz TF", "Naberezhnye Chelny", 423888, "Respublika Tatarstan");
		
		camion.descargar();
		Integer valorEsperado = 0;
		Integer valorObtenido = camion.getCarga().getPeso();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueVerifiqueQueUnaMotoQueAlIncrementarLaVelocidadNoSupereLaVelocidadMaxima() {
		
		Moto moto = new Moto(350, 250, 0, "Zanella", "Rx 350", 200000, "Zan", "Mitre", 11099, "Buenos Aires");
		
		moto.incrementaVelocidad(400);	// Intento forzar el seteo en 400, superaría la velocidad máxima
		
		Integer valorEsperado = 250;	// Es la velocidad máxima. Si le pones un valor superior a 250 fijate lo que te tira el rojo del test
										// Te va a decir que vos esperabas "X" valor pero que en realidad es 250 porque no se puede pasar.
		Integer valorObtenido = moto.getVelocidadActual();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueUnCamionNoPuedaCargarUnaCargaQueSuperaSuPesoMaximo() {
		
		Camion camion = new Camion(2, 20000, 8000, "Premium", false, "Kamaz", "6520", 2000000, "Kamaz TF", "Naberezhnye Chelny", 423888, "Respublika Tatarstan");
		
		Boolean valorObtenido = camion.agregarCarga(20000);
		// Hasta 20000, que es su peso máximo te va a tirar verde. A partir de 20001 que ya te pasas, es rojo. Supera el máximo.
		
		Assert.assertTrue(valorObtenido);
	}

}
