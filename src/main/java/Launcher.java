public class Launcher {
    public static void main(String[] args) {
        introduccion();
    }
    public static void introduccion(){
        Inmoviliaria inmoviliaria=new Inmoviliaria();
        Cliente cliente=new Cliente("Procopio","Buendia","11788966-7","Peruanos");
        inmoviliaria.addCliente(cliente);
        Vendedor vendedor=new Vendedor("Agustin","Paredes","11788966-8","Enrique Segoviano","Ingeniero","Casado");
        inmoviliaria.addVendedor(vendedor);
        Ubicacion_geografica ubicacion_geografica=new Ubicacion_geografica("Peruanildo los mercedes","Arica");
        Inmueble inmueble=new Inmueble(ubicacion_geografica,Construccion.MADERA,1000);
        inmoviliaria.addInmueble(inmueble);
        inmoviliaria.removeInmueble(inmueble);

    }
}
