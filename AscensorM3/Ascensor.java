class Ascensor {
    private int id;
    private int pisoActual;
    private Puerta puerta;
    private Map<Integer, BotonCabina> botones;

    public Ascensor(int id, int pisos) {
        this.id = id;
        this.pisoActual = 1; 
        this.puerta = new Puerta();
        this.botones = new HashMap<>();

        for (int i = 1; i <= pisos; i++) {
            botones.put(i, new BotonCabina(i));
        }
    }

    public String moverUnPiso(int destino) {
        if (!botones.containsKey(destino)) {
            return "Piso inválido.";
        }

        if (puerta.estaAbierta()) {
            return "No se puede mover: la puerta está abierta.";
        }

        if (destino == pisoActual) {
            return "El ascensor ya está en el piso " + pisoActual;
        }

        if (destino > pisoActual) {
            pisoActual++;
        } else {
            pisoActual--;
        }

        return "Ascensor " + id + " se movió al piso " + pisoActual;
    }

    public String llegar() {
        String mensaje = "";

        mensaje += puerta.abrir() + "\n";

        BotonCabina boton = botones.get(pisoActual);
        if (boton.isEncendido()) {
            boton.cancelar();
            mensaje += "Botón del piso " + pisoActual + " apagado\n";
        }

        mensaje += puerta.cerrar();

        return mensaje;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String presionarBotonCabina(int pisoDestino) {
        if (botones.containsKey(pisoDestino)) {
            botones.get(pisoDestino).presionar();
            return "Botón del piso " + pisoDestino + " presionado.";
        }
        return "Piso inválido.";
    }
}

