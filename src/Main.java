import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear los jugadores
        Jugador jugador1 = new Jugador("Mikel");
        Jugador jugador2 = new Jugador("Javi");
        Jugador jugador3 = new Jugador("Spyros");
        Jugador jugador4 = new Jugador("Eduardo");

        // Crear el juego y repartir las preguntas
        Juego juego = new Juego(jugador1, jugador2, jugador3, jugador4);

        // Crear las preguntas

        // Preguntas de historia
        Pregunta preguntaHistoria1 = new Pregunta("¿En qué año llegó el hombre a la luna?", "Historia", "1965", "1969", "1971", "1975", 2);
        Pregunta preguntaHistoria2 = new Pregunta("¿Quién fue el primer presidente de los Estados Unidos?", "Historia", "George Washington", "Thomas Jefferson", "Abraham Lincoln", "James Madison", 1);
        Pregunta preguntaHistoria3 = new Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?", "Historia", "1914", "1939", "1945", "1929", 2);
        Pregunta preguntaHistoria4 = new Pregunta("¿Cuál fue el imperio más grande de la historia?", "Historia", "Imperio Británico", "Imperio Mongol", "Imperio Romano", "Imperio Otomano", 1);

        // Preguntas de ciencia
        Pregunta preguntaCiencia1 = new Pregunta("¿Cuál es el planeta más grande del sistema solar?", "Ciencia", "Tierra", "Júpiter", "Saturno", "Marte", 2);
        Pregunta preguntaCiencia2 = new Pregunta("¿Qué partícula subatómica tiene carga positiva?", "Ciencia", "Electrón", "Protón", "Neutrón", "Fermión", 2);
        Pregunta preguntaCiencia3 = new Pregunta("¿Cuál es la fórmula química del agua?", "Ciencia", "H2O", "CO2", "O2", "CH4", 1);
        Pregunta preguntaCiencia4 = new Pregunta("¿Qué científico propuso la teoría de la relatividad?", "Ciencia", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla", 2);

        // Preguntas de literatura
        Pregunta preguntaLiteratura1 = new Pregunta("¿Quién escribió 'Cien años de soledad'?", "Literatura", "Gabriel García Márquez", "Pablo Neruda", "Jorge Luis Borges", "Mario Vargas Llosa", 1);
        Pregunta preguntaLiteratura2 = new Pregunta("¿Quién es el autor de 'Don Quijote de la Mancha'?", "Literatura", "Miguel de Cervantes", "Lope de Vega", "Garcilaso de la Vega", "Francisco de Quevedo", 1);
        Pregunta preguntaLiteratura3 = new Pregunta("¿Quién escribió 'Romeo y Julieta'?", "Literatura", "William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain", 1);
        Pregunta preguntaLiteratura4 = new Pregunta("¿Quién es el autor de 'La Odisea'?", "Literatura", "Homero", "Virgilio", "Dante Alighieri", "Sófocles", 1);

        // Preguntas de geografía
        Pregunta preguntaGeografia1 = new Pregunta("¿Cuál es el país más grande del mundo?", "Geografía", "China", "Canadá", "Rusia", "Estados Unidos", 3);
        Pregunta preguntaGeografia2 = new Pregunta("¿Cuál es el río más largo del mundo?", "Geografía", "Amazonas", "Nilo", "Yangtsé", "Mississippi", 2);
        Pregunta preguntaGeografia3 = new Pregunta("¿Cuál es la capital de Australia?", "Geografía", "Sídney", "Melbourne", "Canberra", "Brisbane", 3);
        Pregunta preguntaGeografia4 = new Pregunta("¿En qué continente se encuentra el desierto del Sahara?", "Geografía", "Asia", "África", "América", "Oceanía", 2);

        //---------------------------------------------------------------------------------------------------//
        //PRIMERA PREGUNTA
        juego.repartirPreguntas(preguntaHistoria1, preguntaHistoria2, preguntaHistoria3, preguntaHistoria4);

        // Simulación del juego
        Scanner scanner = new Scanner(System.in);

        Jugador jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la primera pregunta del jugador1
        System.out.print("Elige una opción [1-4]: ");
        int opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la primera pregunta del jugador2
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la primera pregunta del jugador3
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la primera pregunta del jugador4
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        // Mostrar los resultados
        juego.mostrarResultados();

        //---------------------------------------------------------------------------------------------------//
        //SEGUNDA PREGUNTA
        juego.repartirPreguntas(preguntaCiencia1, preguntaCiencia2, preguntaCiencia3, preguntaCiencia4);

        // Simulación del juego

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la segunda pregunta del jugador1
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la segunda pregunta del jugador2
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la segunda pregunta del jugador3
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la segunda pregunta del jugador4
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        // Mostrar los resultados
        juego.mostrarResultados();

        //---------------------------------------------------------------------------------------------------//
        //TERCERA PREGUNTA
        juego.repartirPreguntas(preguntaLiteratura1, preguntaLiteratura2, preguntaLiteratura3, preguntaLiteratura4);

        // Simulación del juego

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la tercera pregunta del jugador1
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la tercera pregunta del jugador2
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la tercera pregunta del jugador3
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la tercera pregunta del jugador4
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        // Mostrar los resultados
        juego.mostrarResultados();

        //---------------------------------------------------------------------------------------------------//
        //CUARTA PREGUNTA
        juego.repartirPreguntas(preguntaGeografia1, preguntaGeografia2, preguntaGeografia3, preguntaGeografia4);

        // Simulación del juego

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la cuarta pregunta del jugador1
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la cuarta pregunta del jugador2
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la cuarta pregunta del jugador3
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        jugador = juego.getJugadorTurnoActual();
        System.out.println("Turno de " + jugador.getNombre());
        jugador.mostrarPregunta();  // Mostrar la cuarta pregunta del jugador4
        System.out.print("Elige una opción [1-4]: ");
        opcion = scanner.nextInt();
        juego.jugarTurno(jugador, opcion);

        // Mostrar los resultados
        juego.mostrarResultados();

        //Mostrar quien es el ganador
        juego.comprobarOrdenJugadores();
    }
}
