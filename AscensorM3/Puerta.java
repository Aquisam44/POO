public class Puerta {
    private boolean abierta;

    
    public Puerta() {
        this.abierta = false;
    }

   
    public String abrir() {
        if (!abierta) {
            abierta = true;
            return "Puerta abierta";
        } else {
            return "La puerta ya estaba abierta";
        }
    }

    
    public String cerrar() {
        if (abierta) {
            abierta = false;
            return "Puerta cerrada";
        } else {
            return "La puerta ya estaba cerrada";
        }
    }

    
    public boolean isAbierta() {
        return abierta;
    }

   
    public static void main(String[] args) {
        Puerta puerta = new Puerta();

        System.out.println(puerta.abrir());
        System.out.println("¿Está abierta? " + puerta.isAbierta());

        System.out.println(puerta.cerrar());
        System.out.println("¿Está abierta? " + puerta.isAbierta());
    }
}
