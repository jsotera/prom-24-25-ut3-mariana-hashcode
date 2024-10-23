public class Juego {
    private Jugador jugador1, jugador2, jugador3, jugador4;
    private int turnoActual;

    // Constructor
    public Juego(Jugador j1, Jugador j2, Jugador j3, Jugador j4) {
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.jugador3 = j3;
        this.jugador4 = j4;
        this.turnoActual = 1; // Empieza el turno con el jugador 1
    }

    // Método para repartir preguntas a los jugadores
    public void repartirPreguntas(Pregunta p1, Pregunta p2, Pregunta p3, Pregunta p4) {

        int opcion = (int) Math.floor(Math.random() * 4) + 1;  // Generar un número entre 1 y 4

        switch (opcion) {
            case 1:
                jugador1.asignarPregunta(p1);
                jugador2.asignarPregunta(p2);
                jugador3.asignarPregunta(p3);
                jugador4.asignarPregunta(p4);
                break;
            case 2:
                jugador1.asignarPregunta(p2);
                jugador2.asignarPregunta(p3);
                jugador3.asignarPregunta(p4);
                jugador4.asignarPregunta(p1);
                break;
            case 3:
                jugador1.asignarPregunta(p3);
                jugador2.asignarPregunta(p4);
                jugador3.asignarPregunta(p1);
                jugador4.asignarPregunta(p2);
                break;
            case 4:
                jugador1.asignarPregunta(p4);
                jugador2.asignarPregunta(p1);
                jugador3.asignarPregunta(p2);
                jugador4.asignarPregunta(p3);
                break;
        }
    }

    // Método para jugar el turno del jugador actual
    public void jugarTurno(Jugador jugador, int opcion) {
        //System.out.println("Turno de " + jugador.getNombre() + ":");
        jugador.responder(opcion);

        // Cambiar al siguiente jugador
        turnoActual++;
        if (turnoActual > 4) {
            turnoActual = 1;
        }
    }

    // Método para mostrar los resultados finales
    public void mostrarResultados() {

        System.out.println("Resultados:");
        jugador1.mostrarPuntos();
        jugador2.mostrarPuntos();
        jugador3.mostrarPuntos();
        jugador4.mostrarPuntos();
        System.out.println("-------------------");
        System.out.println();
    }

    public Jugador getJugadorTurnoActual() {
        switch (turnoActual) {
            case 1:
                return jugador1;
            case 2:
                return jugador2;
            case 3:
                return jugador3;
            case 4:
                return jugador4;
            default:
                return null;
        }
    }

    public void comprobarOrdenJugadores() {
        Jugador primero = jugador1, segundo = jugador2, tercero = jugador3, cuarto = jugador4;

        // Comparamos los puntos de los jugadores mediante if
        if (jugador1.getPuntos() >= jugador2.getPuntos() && jugador1.getPuntos() >= jugador3.getPuntos() && jugador1.getPuntos() >= jugador4.getPuntos()) {
            primero = jugador1;
            if (jugador2.getPuntos() >= jugador3.getPuntos() && jugador2.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador2;
                if (jugador3.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador3;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador3;
                }
            } else if (jugador3.getPuntos() >= jugador2.getPuntos() && jugador3.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador3;
                if (jugador2.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador2;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador2;
                }
            } else {
                segundo = jugador4;
                if (jugador2.getPuntos() >= jugador3.getPuntos()) {
                    tercero = jugador2;
                    cuarto = jugador3;
                } else {
                    tercero = jugador3;
                    cuarto = jugador2;
                }
            }
        } else if (jugador2.getPuntos() >= jugador1.getPuntos() && jugador2.getPuntos() >= jugador3.getPuntos() && jugador2.getPuntos() >= jugador4.getPuntos()) {
            primero = jugador2;
            if (jugador1.getPuntos() >= jugador3.getPuntos() && jugador1.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador1;
                if (jugador3.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador3;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador3;
                }
            } else if (jugador3.getPuntos() >= jugador1.getPuntos() && jugador3.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador3;
                if (jugador1.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador1;
                }
            } else {
                segundo = jugador4;
                if (jugador1.getPuntos() >= jugador3.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador3;
                } else {
                    tercero = jugador3;
                    cuarto = jugador1;
                }
            }
        } else if (jugador3.getPuntos() >= jugador1.getPuntos() && jugador3.getPuntos() >= jugador2.getPuntos() && jugador3.getPuntos() >= jugador4.getPuntos()) {
            primero = jugador3;
            if (jugador1.getPuntos() >= jugador2.getPuntos() && jugador1.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador1;
                if (jugador2.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador2;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador2;
                }
            } else if (jugador2.getPuntos() >= jugador1.getPuntos() && jugador2.getPuntos() >= jugador4.getPuntos()) {
                segundo = jugador2;
                if (jugador1.getPuntos() >= jugador4.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador4;
                } else {
                    tercero = jugador4;
                    cuarto = jugador1;
                }
            } else {
                segundo = jugador4;
                if (jugador1.getPuntos() >= jugador2.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador2;
                } else {
                    tercero = jugador2;
                    cuarto = jugador1;
                }
            }
        } else {
            primero = jugador4;
            if (jugador1.getPuntos() >= jugador2.getPuntos() && jugador1.getPuntos() >= jugador3.getPuntos()) {
                segundo = jugador1;
                if (jugador2.getPuntos() >= jugador3.getPuntos()) {
                    tercero = jugador2;
                    cuarto = jugador3;
                } else {
                    tercero = jugador3;
                    cuarto = jugador2;
                }
            } else if (jugador2.getPuntos() >= jugador1.getPuntos() && jugador2.getPuntos() >= jugador3.getPuntos()) {
                segundo = jugador2;
                if (jugador1.getPuntos() >= jugador3.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador3;
                } else {
                    tercero = jugador3;
                    cuarto = jugador1;
                }
            } else {
                segundo = jugador3;
                if (jugador1.getPuntos() >= jugador2.getPuntos()) {
                    tercero = jugador1;
                    cuarto = jugador2;
                } else {
                    tercero = jugador2;
                    cuarto = jugador1;
                }
            }
        }

        // Mostrar el orden final de los jugadores
        System.out.println("Orden final:");
        System.out.println("1. " + primero.getNombre() + " con " + primero.getPuntos() + " puntos.");
        System.out.println("2. " + segundo.getNombre() + " con " + segundo.getPuntos() + " puntos.");
        System.out.println("3. " + tercero.getNombre() + " con " + tercero.getPuntos() + " puntos.");
        System.out.println("4. " + cuarto.getNombre() + " con " + cuarto.getPuntos() + " puntos.");
    }

}
