public abstract class Persona {
	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public abstract String getType();

	public Persona(String nombre, String apellido, String rut, String direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.direccion=direccion;
	}
}