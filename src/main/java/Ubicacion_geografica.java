public class Ubicacion_geografica {
	private String direccion;
	private String ciudad;
	public String getDireccion() {
		return this.direccion;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public Ubicacion_geografica(String direccion, String ciudad) {
		this.direccion=direccion;
		this.ciudad=ciudad;
	}
}