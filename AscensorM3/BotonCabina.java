public class BotonCabina extends Boton {
    private int piso;

   
    public BotonCabina(int piso) {
        super();
        this.piso = piso;
    }

    
    public int getPiso() {
        return piso;
    }

    public static void main(String[] args) {
        BotonCabina b1 = new BotonCabina(3);
        System.out.println("Botón del piso " + b1.getPiso() + " encendido? " + b1.isEncendido());

        b1.presionar();
        System.out.println("Después de presionar: " + b1.isEncendido());

        b1.cancelar();
        System.out.println("Después de cancelar: " + b1.isEncendido());
    }
}
