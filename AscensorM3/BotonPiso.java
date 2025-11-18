 public class BotonPiso extends Boton {
    private String direccion; 


    public BotonPiso(String direccion) {
        super(); 
        this.direccion = direccion;
    }

  
    public String getDireccion() {
        return direccion;
    }


    public static void main(String[] args) {
       
        BotonPiso subir = new BotonPiso("subir");
        BotonPiso bajar = new BotonPiso("bajar");

        System.out.println("Botón de " + subir.getDireccion() + " encendido? " + subir.isEncendido());
        subir.presionar();
        System.out.println("Después de presionar: " + subir.isEncendido());

        System.out.println("\nBotón de " + bajar.getDireccion() + " encendido? " + bajar.isEncendido());
        bajar.presionar();
        System.out.println("Después de presionar: " + bajar.isEncendido());
    }
}