public class Jugador {
    private String nombre;
    private int puntos;
    private Pregunta preguntaActual;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.preguntaActual = null;
    }

    // Método para asignar una pregunta al jugador
    public void asignarPregunta(Pregunta pregunta) {
        this.preguntaActual = pregunta;
    }

    // El jugador responde la pregunta
    public void responder(int opcion) {
        if (preguntaActual != null && preguntaActual.esCorrecta(opcion)) {
            System.out.println("Respuesta correcta. ¡Has ganado un punto!");
            System.out.println("-------------------");
            puntos++;
        } else {
            System.out.println("Respuesta incorrecta.");
            System.out.println("-------------------");
        }
    }

    // Método para mostrar la pregunta asignada
    public void mostrarPregunta() {
        if (preguntaActual != null) {
            preguntaActual.mostrarPregunta();
        } else {
            System.out.println("No hay pregunta asignada.");
        }
    }

    // Muestra los puntos del jugador
    public void mostrarPuntos() {
        System.out.println(nombre + ": " + puntos + " puntos.");
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }
}


