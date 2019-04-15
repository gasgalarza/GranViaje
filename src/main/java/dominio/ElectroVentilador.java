package dominio;

public class ElectroVentilador {
	private Motor motor;
	
	public void activarse(){
		this.motor.disminuirTemperatura(15);
	}

}
