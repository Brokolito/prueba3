public class Vendedor extends Persona {
	private String titulo;
	private String estado_civil;

	public String getTitulo() {
		return this.titulo;
	}

	public String getEstado_civil() {
		return this.estado_civil;
	}

	public Vendedor(String nombre, String apellido, String rut, String direccion, String titulo, String estado_civil) {
		super(nombre,apellido,rut,direccion);
		this.estado_civil=estado_civil;
		this.titulo=titulo;
	}

	public String getType() {
		return "Vendedor";
	}

	@Override
	public String toString() {
		return "Nombre: "+getNombre()+", apellido: "+getApellido()+", rut: "+getRut()+", direccion: "+ getDireccion()+", titulo"+getTitulo()+"Estado:"+getEstado_civil() +getType();
	}
}