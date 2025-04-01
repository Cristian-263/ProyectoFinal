package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);
    private boolean salirMenu = false;
    private boolean salirJuego = false;
    private Personaje personajeSecreto;

    public void menuGeneral(ArrayList<Personaje> listaPersonajes) {
        // Bucle principal para permitir jugar varias veces
        while (!salirJuego) {
            // Reiniciar estado para nueva partida
            salirMenu = false;
            this.personajeSecreto = Personaje.obtenerPersonajeAleatorio(listaPersonajes);

            // Mostrar menú y manejar opciones
            do {
                int elegido = Menu.menuGeneral();
                if (elegido == 1) {

                    salirMenu = true;
                    jugar(listaPersonajes);
                } else if (elegido == 2) {
                    Menu.instrucciones();
                } else {
                    System.out.println("Has salido del juego");
                    salirJuego = true;
                }
            } while (!salirMenu && !salirJuego);
        }
    }

    public void jugar(ArrayList<Personaje> listaPersonajes) {
        ArrayList<Personaje> personajesRestantes = new ArrayList<>(listaPersonajes); // Copia de la lista original
        boolean finPartida = false;

        System.out.println("\n¡Comienza el juego! Haz preguntas para adivinar.\n");

        while (!finPartida && !salirJuego) {
            // Mostrar personajes restantes
            System.out.println("Personajes restantes (" + personajesRestantes.size() + "):");
            for (Personaje personaje : personajesRestantes) {
                personaje.imprimirPersonaje();
            }

            // Preguntar al jugador
            int preguntaElegida = Menu.preguntasRasgos();
            Preguntas listaPreguntas = new Preguntas();

            if (preguntaElegida == 5) { // Adivinar personaje
                ArrayList<String> nombres = listaPreguntas.getPreguntasPorCategoria("Nombres");
                for (String pregunta : nombres) {
                    System.out.println(pregunta);
                }
                int eleccion = sc.nextInt();
                String nombreElegido = obtenerNombre(eleccion);
                if (nombreElegido.equals(personajeSecreto.getNombre())) {
                    System.out.println("¡Ganaste! El personaje era " + personajeSecreto.getNombre());
                    finPartida = true;
                } else {
                    System.out.println("Perdiste. El personaje era " + personajeSecreto.getNombre());
                    finPartida = true;
                }
            } else {
                // Mostrar preguntas según categoría
                String categoria = "";
                if (preguntaElegida == 1) categoria = "Genero";
                else if (preguntaElegida == 2) categoria = "ColorPelo";
                else if (preguntaElegida == 3) categoria = "Ojos";
                else if (preguntaElegida == 4) categoria = "TipoPelo";

                ArrayList<String> preguntas = listaPreguntas.getPreguntasPorCategoria(categoria);
                for (String pregunta : preguntas) {
                    System.out.println(pregunta);
                }
                int eleccion = sc.nextInt();

                // Comparar con el personaje secreto y descartar
                descartarPersonajes(personajesRestantes, categoria, eleccion);

                // Verificar si queda solo uno
                if (personajesRestantes.size() == 1) {
                    System.out.println("¡Ganaste! El personaje es " + personajesRestantes.get(0).getNombre());
                    finPartida = true;
                }
            }
        }
    }

    private void descartarPersonajes(ArrayList<Personaje> lista, String categoria, int eleccion) {
        ArrayList<Personaje> personajesRestantes = new ArrayList<>();

        for (Personaje personaje : lista) {
            boolean coincidePersonajeSecreto = false;
            if (categoria.equals("Genero")) {
                coincidePersonajeSecreto = (eleccion == 1 && personajeSecreto.getGenero() == Genero.HOMBRE) ||
                                     (eleccion == 2 && personajeSecreto.getGenero() == Genero.MUJER);
                if (eleccion == 1 && personaje.getGenero() != Genero.HOMBRE && coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (eleccion == 2 && personaje.getGenero() != Genero.MUJER && coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (eleccion == 1 && personaje.getGenero() == Genero.HOMBRE && !coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (eleccion == 2 && personaje.getGenero() == Genero.MUJER && !coincidePersonajeSecreto) personajesRestantes.add(personaje);
            } else if (categoria.equals("ColorPelo")) {
                ColorPelo[] colores = {ColorPelo.RUBIO, ColorPelo.MORENO, ColorPelo.CASTANYO, ColorPelo.BLANCO, ColorPelo.PELIRROJO};
                coincidePersonajeSecreto = personajeSecreto.getColorPelo() == colores[eleccion - 1];
                if (personaje.getColorPelo() != colores[eleccion - 1] && coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (personaje.getColorPelo() == colores[eleccion - 1] && !coincidePersonajeSecreto) personajesRestantes.add(personaje);
            } else if (categoria.equals("Ojos")) {
                Ojos[] ojos = {Ojos.MARRONES, Ojos.NEGROS, Ojos.AZULES, Ojos.VERDES};
                coincidePersonajeSecreto = personajeSecreto.getOjos() == ojos[eleccion - 1];
                if (personaje.getOjos() != ojos[eleccion - 1] && coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (personaje.getOjos() == ojos[eleccion - 1] && !coincidePersonajeSecreto) personajesRestantes.add(personaje);
            } else if (categoria.equals("TipoPelo")) {
                TipoPelo[] tipos = {TipoPelo.RIZADO, TipoPelo.CORTO, TipoPelo.LARGO, TipoPelo.CALVO, TipoPelo.CRESTA};
                coincidePersonajeSecreto = personajeSecreto.getPelo() == tipos[eleccion - 1];
                if (personaje.getPelo() != tipos[eleccion - 1] && coincidePersonajeSecreto) personajesRestantes.add(personaje);
                else if (personaje.getPelo() == tipos[eleccion - 1] && !coincidePersonajeSecreto) personajesRestantes.add(personaje);
            }
        }

        lista.removeAll(personajesRestantes);
    }

    private String obtenerNombre(int eleccion) {
        String[] nombres = {"Carlos", "Ana", "Pedro", "Lucía", "Javier", "María", "Andrés", "Beatriz", "Raúl", "Sofía"};
        return nombres[eleccion - 1];
    }
}