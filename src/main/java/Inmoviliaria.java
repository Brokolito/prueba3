import java.util.ArrayList;

public class Inmoviliaria {
	private ArrayList<Venta> ventas;
	private ArrayList<Inmueble> inmuebles;
	private ArrayList<Persona> personas;

	public Inmoviliaria() {
		this.ventas=new ArrayList<>();
		this.inmuebles=new ArrayList<>();
		this.personas=new ArrayList<>();
	}

	public Cliente addCliente(Cliente cliente) {
		personas.add(cliente);
		System.out.println(cliente);
		return cliente;
	}

	public Vendedor addVendedor(Vendedor vendedor) {
		personas.add(vendedor);
		System.out.println(vendedor);
		return vendedor;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		inmuebles.add(inmueble);
		System.out.println(inmueble);
		return inmueble;
	}

	public void removeInmueble(Inmueble inmueble) {
		for(Inmueble inmueble1: this.inmuebles){
			if(inmueble1.equals(inmueble)){
				inmuebles.remove(inmueble);
				System.out.println("Se ha removido");
			}
		}
	}

	public ArrayList<Inmueble> look_Material(Construccion construccion) {
		ArrayList<Inmueble>equalConstruction=new ArrayList<>();
		for(Inmueble inmueble:this.inmuebles){
			if(inmueble.getConstruccion().equals(construccion)){
				equalConstruction.add(inmueble);
			}
		}
		return  equalConstruction;
	}

	public ArrayList<Inmueble> look_Precio(int precio) {
		ArrayList<Inmueble>equalPrice=new ArrayList<>();
		for(Inmueble inmueble:this.inmuebles){
			if(inmueble.getPrecio()==precio){
				equalPrice.add(inmueble);
			}
		}
		return  equalPrice;	}
}