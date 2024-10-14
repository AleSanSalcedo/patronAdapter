package adapter;

public class AdapterMedidor implements MedidorEnYardas {
	private MedidorEnMetros medidorEnMetros;  // Referencia a la clase que usa metros

	public AdapterMedidor(MedidorEnMetros medidorEnMetros) {
		this.medidorEnMetros = medidorEnMetros;
	}

	@Override
	public double obtenerMedidaEnYardas() {
     // Llamamos al método que nos da los metros y los convertimos a yardas
		double metros = medidorEnMetros.obtenerMedidaEnMetros(); 
		return convertirMetrosAYardas(metros); 
	}

	private double convertirMetrosAYardas(double metros) {
		return metros * 1.09361;  // 1 metro = 1.09361 yardas
	}
}

