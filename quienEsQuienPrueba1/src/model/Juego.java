package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	// VARIABLES//
	Scanner sc = new Scanner(System.in);
	private boolean salirMenu = false;
	private boolean salirJuego = false;
	private Personaje personajeSecreto;
	
	
	public Juego() {
    }
	
	// BUCLE PRINCIPAL DEL MENÚ //
	
	public void menuGeneral(ArrayList<Personaje> listaPersonajes) {
		this.personajeSecreto = Personaje.obtenerPersonajeAleatorio(listaPersonajes);
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
	       
	}
	
public void jugar() {
	
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
    		int eleccionRasgo= sc.nextInt();
    		break;
    	case 2:	
    		ArrayList<String> colorPelo = listaPreguntas.getPreguntasPorCategoria("ColorPelo");
    		for (String pregunta : colorPelo) {
				System.out.println(pregunta);
			}
    		eleccionRasgo= sc.nextInt();
    		break;
    	case 3:	
    		ArrayList<String> ojos = listaPreguntas.getPreguntasPorCategoria("Ojos");
    		for (String pregunta : ojos) {
				System.out.println(pregunta);
			}
    		eleccionRasgo= sc.nextInt();
    		break;
    	case 4:	
    		ArrayList<String> tipoPelo = listaPreguntas.getPreguntasPorCategoria("TipoPelo");
    		for (String pregunta : tipoPelo) {
				System.out.println(pregunta);
			}
    		eleccionRasgo= sc.nextInt();
    		break;
    	case 5:	
    		ArrayList<String> nombres = listaPreguntas.getPreguntasPorCategoria("Nombres");
    		for (String pregunta : nombres) {
				System.out.println(pregunta);
			}
    		eleccionRasgo= sc.nextInt();
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
