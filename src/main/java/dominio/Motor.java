package dominio;

public class Motor {
	private float temperatura;
	private ElectroVentilador electroVentilador;
	
	public void aumentarTemperatura(float unaTemperatura){
		temperatura =+ unaTemperatura;
	}
	public void disminuirTemperatura(float unaTemperatura){
		temperatura =- unaTemperatura;
	}
	public boolean estaCaliente(){
		return temperatura >= 95;
	}
	public void activarElectro(){
		this.electroVentilador.activarse();
	}

}
