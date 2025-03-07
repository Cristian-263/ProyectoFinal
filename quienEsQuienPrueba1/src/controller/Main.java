package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// VARIABLES//
		boolean salirMenu = false;
		boolean salirJuego = false;
		// ARRAYLIST PERSONAJES //
		ArrayList<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(new Personaje("Carlos", TipoPelo.CORTO, ColorPelo.CASTANYO, Ojos.MARRONES, Genero.HOMBRE,
				false, true, false, false, false));
		listaPersonajes.add(new Personaje("Ana", TipoPelo.LARGO, ColorPelo.RUBIO, Ojos.AZULES, Genero.MUJER, true,
				false, false, false, true));
		listaPersonajes.add(new Personaje("Pedro", TipoPelo.CORTO, ColorPelo.MORENO, Ojos.VERDES, Genero.HOMBRE, false,
				false, false, true, false));
		listaPersonajes.add(new Personaje("Lucía", TipoPelo.LARGO, ColorPelo.PELIRROJO, Ojos.MARRONES, Genero.MUJER,
				false, false, true, false, true));
		listaPersonajes.add(new Personaje("Javier", TipoPelo.CALVO, ColorPelo.BLANCO, Ojos.NEGROS, Genero.HOMBRE, true,
				true, false, false, false));
		listaPersonajes.add(new Personaje("María", TipoPelo.LARGO, ColorPelo.CASTANYO, Ojos.AZULES, Genero.MUJER, false,
				false, false, false, true));
		listaPersonajes.add(new Personaje("Andrés", TipoPelo.CORTO, ColorPelo.RUBIO, Ojos.VERDES, Genero.HOMBRE, true,
				false, true, false, false));
		listaPersonajes.add(new Personaje("Beatriz", TipoPelo.LARGO, ColorPelo.MORENO, Ojos.MARRONES, Genero.MUJER,
				false, false, false, false, true));
		listaPersonajes.add(new Personaje("Raúl", TipoPelo.CORTO, ColorPelo.PELIRROJO, Ojos.AZULES, Genero.HOMBRE, true,
				true, false, true, false));
		listaPersonajes.add(new Personaje("Sofía", TipoPelo.LARGO, ColorPelo.BLANCO, Ojos.NEGROS, Genero.MUJER, false,
				false, true, false, true));

		Personaje aleatorio = Personaje.obtenerPersonajeAleatorio(listaPersonajes);
	    // aleatorio.imprimirPersonaje(); //
		



 
		// BUCLE PRINCIPAL DEL MENÚ //
		do {
			// MENÚ INICIAL//
			int elegido = Menu.menuGeneral();

			if (elegido == 1) {// JUGAR PARTIDA //
				for (Personaje personaje : listaPersonajes) {

	                // MUESTRA LOS PERSONAJES //
	                System.out.println("Personajes disponibles:");
					personaje.imprimirPersonaje();
					salirMenu = true;
				}
		 }else if(elegido==2) {
			 Menu.instrucciones();		 
		 }else {
			  System.out.println("has salido del juego");
			 salirJuego=true;
		 }
        }while(salirMenu==false && salirJuego==false);
        
        // MENÚ SELECCIÓN DE PREGUNTAS //
        Preguntas listaPreguntas = new Preguntas();
        if(salirMenu==true) {
        	int preguntaElegida= Menu.preguntasRasgos();
			switch(preguntaElegida) {
        	case 1:
        		ArrayList<String> genero = listaPreguntas.getPreguntasPorCategoria("Genero");
        		for (String pregunta : genero) {
					System.out.println(pregunta);
				}
        		break;
        	case 2:	
        		ArrayList<String> colorPelo = listaPreguntas.getPreguntasPorCategoria("ColorPelo");
        		for (String pregunta : colorPelo) {
					System.out.println(pregunta);
				}
        		break;
        	case 3:	
        		ArrayList<String> ojos = listaPreguntas.getPreguntasPorCategoria("Ojos");
        		for (String pregunta : ojos) {
					System.out.println(pregunta);
				}
        		break;
        	case 4:	
        		ArrayList<String> tipoPelo = listaPreguntas.getPreguntasPorCategoria("TipoPelo");
        		for (String pregunta : tipoPelo) {
					System.out.println(pregunta);
				}
        		break;
        	case 5:	
        		ArrayList<String> nombres = listaPreguntas.getPreguntasPorCategoria("Nombres");
        		for (String pregunta : nombres) {
					System.out.println(pregunta);
				}
        		break;
        	default:
        		System.out.println("Respuesta incorrecta introduce un numero del 1 al 5");
        		
        	}
        	
        	// OPCIÓN SI ELIGUE SALIR DEL JUEGO // 
        }else if(salirJuego==true) {
        	System.out.println("Has decidido salir del juego ");
        	System.out.println("Hasta la próxima");
        	
        } 
       
	}

}
