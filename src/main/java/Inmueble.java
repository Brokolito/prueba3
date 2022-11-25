public class Inmueble {
	private int precio;
	private Construccion material;
	private Ubicacion_geografica ubicacion_geografica;

	public Inmueble(Ubicacion_geografica ubicacion_geografica, Construccion contruccion, int precio) {
		this.ubicacion_geografica=ubicacion_geografica;
		this.material=contruccion;
		this.precio=precio;
	}

	public int getPrecio() {
		return this.precio;
	}

	public Construccion getConstruccion() {
		return this.material;
	}

	public Ubicacion_geografica getUbicacion_geografica() {
		return this.ubicacion_geografica;
	}

	@Override
	public String toString() {
		return "Precio: "+this.precio + ", material: " + this.material+ ", ubicacion geografica: " + this.ubicacion_geografica;
	}
}