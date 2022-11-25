public class Cliente extends Persona {

	public Cliente(String nombre, String apellido, String rut, String direccion) {
		super(nombre, apellido, rut, direccion);
	}

	public String getType() {
		return "Cliente";
	}

	@Override
	public String toString() {
		return "Nombre: "+getNombre()+", apellido: "+getApellido()+", rut: "+getRut()+", direccion: "+ getDireccion()+""+ getType();
	}
}