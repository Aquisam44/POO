public class Boton {
    private boolean encendido;

    
    public Boton() {
        this.encendido = false;
    }

   
    public boolean presionar() {
        if (!encendido) {
            encendido = true;
            return true;
        }
        return false;
    }

   
    public void cancelar() {
        encendido = false;
    }

    
    public boolean isEncendido() {
        return encendido;
    }

    
    public static void main(String[] args) {
        Boton b = new Boton();
        System.out.println("Estado inicial (debe ser false): " + b.isEncendido());

        boolean primera = b.presionar();
        System.out.println("Presionar() devuelve (debe ser true): " + primera);
        System.out.println("Estado después de presionar (debe ser true): " + b.isEncendido());

        boolean segunda = b.presionar();
        System.out.println("Presionar nuevamente (debe ser false porque ya estaba encendido): " + segunda);

        b.cancelar();
        System.out.println("Estado después de cancelar (debe ser false): " + b.isEncendido());
    }
}