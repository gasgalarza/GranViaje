package dominio;

public class Tanque {
	private float capacidadTotal;
	private float capacidadActual;
	
	public boolean estaEnReserva(){
		return this.porcentajeActualCombustible() < 10;
	}
	public boolean proximoAReserva(){
		return this.porcentajeActualCombustible() < 15 && this.porcentajeActualCombustible() > 10;
	}
	public float porcentajeActualCombustible(){
		return capacidadActual*100/capacidadTotal;
	}
	public void consumirCombustible(float unPorcentaje){
		capacidadActual =- unPorcentaje*capacidadActual/100;
	}
	

}
