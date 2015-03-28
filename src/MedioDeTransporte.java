
public class MedioDeTransporte {

	int cantidad_pasajeros;
	double velocidad_maxima;
	int cantidad_de_llantas;
	
	MedioDeTransporte(int cantidad_pasajeros, double velocidad_maxima)
	{
		this.cantidad_pasajeros = cantidad_pasajeros;
		this.velocidad_maxima = velocidad_maxima;
		this.cantidad_de_llantas = cantidad_de_llantas;
	}
	
	int getCantidadPasajeros()
	{
		return cantidad_pasajeros;
	}
	
	void setCantidadPasajeros()
	{
		this.cantidad_pasajeros = cantidad_pasajeros;
	}
	
	double getVelocidadMaxima()
	{
		return velocidad_maxima;
	}
	
	void setVelocidadMaxima()
	{
		this.velocidad_maxima = velocidad_maxima;
	}
	
	int getCantidadDeLLantas()
	{
		cantidad_de_llantas=0;
		return cantidad_de_llantas;
	}
	
	void setCantidadDeLLantas()
	{
		this.cantidad_de_llantas = cantidad_de_llantas;
	}
	
}
