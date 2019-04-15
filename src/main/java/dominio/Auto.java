package dominio;

public class Auto {
	private int velocidad;
	//private Estado estado;
	private Motor motor;
	private Tanque tanque;
	
	public void encendete(){
		this.motor.aumentarTemperatura(70);
		this.tanque.consumirCombustible((float) 0.001);	
	}
	public void acelerar(int unosKm){
		if(this.estaEncendido()){
		velocidad=unosKm;
		}else{
			//lanza una excepcion
		}
		
	}
	public int velocidadActual(){
		return velocidad;
	}
	public void estaCaliente(){
		this.motor.estaCaliente();
		
	}
	public void estasEnReservaDeCombustible(){
		this.tanque.estaEnReserva();
	}
	public boolean estaEncendido(){
		return true;
	}
	

}
