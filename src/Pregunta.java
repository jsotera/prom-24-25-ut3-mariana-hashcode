public class Pregunta {
    private String enunciado;
    private String categoria;
    private String opcion1, opcion2, opcion3, opcion4;
    private int respuestaCorrecta;

    // Constructor
    public Pregunta(String enunciado, String categoria, String opcion1, String opcion2, String opcion3, String opcion4, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.categoria = categoria;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Método para mostrar la pregunta y sus opciones
    public void mostrarPregunta() {
        System.out.println("Categoría: " + categoria);
        System.out.println("Pregunta: " + enunciado);
        System.out.println("1. " + opcion1);
        System.out.println("2. " + opcion2);
        System.out.println("3. " + opcion3);
        System.out.println("4. " + opcion4);
    }

    // Verifica si la respuesta seleccionada es correcta
    public boolean esCorrecta(int respuesta) {
        return respuesta == respuestaCorrecta;
    }


    //Constructor V2
    /*
    public Pregunta(String enunciado, String categoria, String opcion1, String opcion2, String opcion3, String opcion4, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.categoria = categoria;

        // Reorganizar las opciones de manera aleatoria
        int randomOrder = (int) Math.floor(Math.random() * 6) + 1; // Genera un número entre 1 y 6

        switch (randomOrder) {
            case 1:
                // Orden original
                this.opcion1 = opcion1;
                this.opcion2 = opcion2;
                this.opcion3 = opcion3;
                this.opcion4 = opcion4;
                break;
            case 2:
                // Intercambiar opción 1 con opción 2
                this.opcion1 = opcion2;
                this.opcion2 = opcion1;
                this.opcion3 = opcion3;
                this.opcion4 = opcion4;
                break;
            case 3:
                // Intercambiar opción 1 con opción 3
                this.opcion1 = opcion3;
                this.opcion2 = opcion1;
                this.opcion3 = opcion2;
                this.opcion4 = opcion4;
                break;
            case 4:
                // Intercambiar opción 1 con opción 4
                this.opcion1 = opcion4;
                this.opcion2 = opcion1;
                this.opcion3 = opcion2;
                this.opcion4 = opcion3;
                break;
            case 5:
                // Rotar las opciones: 1 -> 2, 2 -> 3, 3 -> 4, 4 -> 1
                this.opcion1 = opcion2;
                this.opcion2 = opcion3;
                this.opcion3 = opcion4;
                this.opcion4 = opcion1;
                break;
            case 6:
                // Rotar las opciones: 1 -> 3, 3 -> 4, 4 -> 2, 2 -> 1
                this.opcion1 = opcion3;
                this.opcion2 = opcion4;
                this.opcion3 = opcion2;
                this.opcion4 = opcion1;
                break;
        }

        // Ajustar la respuesta correcta en función del reordenamiento
        if (randomOrder == 1) {
            this.respuestaCorrecta = respuestaCorrecta; // El orden no cambia
        } else if (randomOrder == 2) {
            this.respuestaCorrecta = (respuestaCorrecta == 1) ? 2 : (respuestaCorrecta == 2) ? 1 : respuestaCorrecta;
        } else if (randomOrder == 3) {
            this.respuestaCorrecta = (respuestaCorrecta == 1) ? 3 : (respuestaCorrecta == 3) ? 1 : respuestaCorrecta;
        } else if (randomOrder == 4) {
            this.respuestaCorrecta = (respuestaCorrecta == 1) ? 4 : (respuestaCorrecta == 4) ? 1 : respuestaCorrecta;
        } else if (randomOrder == 5) {
            this.respuestaCorrecta = (respuestaCorrecta == 1) ? 2 : (respuestaCorrecta == 2) ? 3 : (respuestaCorrecta == 3) ? 4 : 1;
        } else if (randomOrder == 6) {
            this.respuestaCorrecta = (respuestaCorrecta == 1) ? 3 : (respuestaCorrecta == 3) ? 1 : (respuestaCorrecta == 4) ? 2 : 4;
        }


        OTRA OPCIÓN

        // Ajustar la respuesta correcta en función del reordenamiento
        if (randomOrder == 1) {
            // El orden no cambia
            this.respuestaCorrecta = respuestaCorrecta;
        } else if (randomOrder == 2) {
            // Intercambio de opción 1 con opción 2
            if (respuestaCorrecta == 1) {
                this.respuestaCorrecta = 2;
            } else if (respuestaCorrecta == 2) {
                this.respuestaCorrecta = 1;
            } else {
                this.respuestaCorrecta = respuestaCorrecta;
            }
        } else if (randomOrder == 3) {
            // Intercambio de opción 1 con opción 3
            if (respuestaCorrecta == 1) {
                this.respuestaCorrecta = 3;
            } else if (respuestaCorrecta == 3) {
                this.respuestaCorrecta = 1;
            } else {
                this.respuestaCorrecta = respuestaCorrecta;
            }
        } else if (randomOrder == 4) {
            // Intercambio de opción 1 con opción 4
            if (respuestaCorrecta == 1) {
                this.respuestaCorrecta = 4;
            } else if (respuestaCorrecta == 4) {
                this.respuestaCorrecta = 1;
            } else {
                this.respuestaCorrecta = respuestaCorrecta;
            }
        } else if (randomOrder == 5) {
            // Rotar las opciones: 1 -> 2, 2 -> 3, 3 -> 4, 4 -> 1
            if (respuestaCorrecta == 1) {
                this.respuestaCorrecta = 2;
            } else if (respuestaCorrecta == 2) {
                this.respuestaCorrecta = 3;
            } else if (respuestaCorrecta == 3) {
                this.respuestaCorrecta = 4;
            } else if (respuestaCorrecta == 4) {
                this.respuestaCorrecta = 1;
            }
        } else if (randomOrder == 6) {
            // Rotar las opciones: 1 -> 3, 3 -> 4, 4 -> 2, 2 -> 1
            if (respuestaCorrecta == 1) {
                this.respuestaCorrecta = 3;
            } else if (respuestaCorrecta == 3) {
                this.respuestaCorrecta = 1;
            } else if (respuestaCorrecta == 4) {
                this.respuestaCorrecta = 2;
            } else if (respuestaCorrecta == 2) {
                this.respuestaCorrecta = 4;
            }
        }

    }
     */
}
