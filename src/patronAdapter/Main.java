package patronAdapter;

public class Main {
	public static void main(String[] args) {
		
		MedidorEnMetros medidorEnMetros = new MedidorEnMetros(200); // Creamos el objeto
	     
	     MedidorEnYardas medidorEnYardas = new AdapterMedidor(medidorEnMetros); // Creamos el Adapter, pasando el medidor de metros

	     System.out.println("Medida en yardas: " + medidorEnYardas.obtenerMedidaEnYardas());
	     
	}
}