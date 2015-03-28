
public class Carro extends MedioDeTransporte{

Carro(int cantidad_pasajeros, double velocidad_maxima)
{
	super(cantidad_pasajeros, velocidad_maxima);
}

@Override
int getCantidadDeLLantas()
{
	cantidad_de_llantas=4;
	return cantidad_de_llantas;
}

}