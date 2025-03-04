package controller;

import java.util.ArrayList;
import model.*;
public class Main {

	public static void main(String[] args) {
		boolean salirMenu = false;
		boolean salirJuego = false;
		ArrayList<Personaje> listaPersonajes = new ArrayList <Personaje>();
		listaPersonajes.add(new Personaje("Carlos",TipoPelo.CORTO, ColorPelo.CASTANYO,Ojos.MARRONES,Genero.HOMBRE,false,true,false,false,false));
		listaPersonajes.add(new Personaje("Ana", TipoPelo.LARGO, ColorPelo.RUBIO, Ojos.AZULES, Genero.MUJER, true, false, false, false, true));
        listaPersonajes.add(new Personaje("Pedro", TipoPelo.CORTO, ColorPelo.MORENO, Ojos.VERDES, Genero.HOMBRE, false, false, false, true, false));
        listaPersonajes.add(new Personaje("Lucía", TipoPelo.LARGO, ColorPelo.PELIRROJO, Ojos.MARRONES, Genero.MUJER, false, false, true, false, true));
        listaPersonajes.add(new Personaje("Javier", TipoPelo.CALVO, ColorPelo.BLANCO, Ojos.NEGROS, Genero.HOMBRE, true, true, false, false, false));
        listaPersonajes.add(new Personaje("María", TipoPelo.LARGO, ColorPelo.CASTANYO, Ojos.AZULES, Genero.MUJER, false, false, false, false, true));
        listaPersonajes.add(new Personaje("Andrés", TipoPelo.CORTO, ColorPelo.RUBIO, Ojos.VERDES, Genero.HOMBRE, true, false, true, false, false));
        listaPersonajes.add(new Personaje("Beatriz", TipoPelo.LARGO, ColorPelo.MORENO, Ojos.MARRONES, Genero.MUJER, false, false, false, false, true));
        listaPersonajes.add(new Personaje("Raúl", TipoPelo.CORTO, ColorPelo.PELIRROJO, Ojos.AZULES, Genero.HOMBRE, true, true, false, true, false));
        listaPersonajes.add(new Personaje("Sofía", TipoPelo.LARGO, ColorPelo.BLANCO, Ojos.NEGROS, Genero.MUJER, false, false, true, false, true));
		
        ArrayList<String>listaPreguntas = new ArrayList <String>();
        listaPreguntas.add("¿Tú personaje tiene el pelo Rubio?");
        listaPreguntas.add("¿Tú personaje tiene el pelo Moreno?");
        listaPreguntas.add("¿Tú personaje tiene el pelo Castaño?");
        listaPreguntas.add("¿Tú personaje tiene el pelo Blanco?");
        listaPreguntas.add("¿Tú personaje tiene el pelo Pelirrojo?");
        listaPreguntas.add("¿Tú personaje es hombre?");
        listaPreguntas.add("¿Tú personaje es mujer?");
        listaPreguntas.add("¿Tú personaje tiene los ojos marrones?");
        listaPreguntas.add("¿Tú personaje tiene los ojos negros?");
        listaPreguntas.add("¿Tú personaje tiene los ojos azules?");
        listaPreguntas.add("¿Tú personaje tiene los ojos verdes?");
        listaPreguntas.add("¿Tú personaje tiene el pelo rizado?");
        listaPreguntas.add("¿Tú personaje tiene el pelo corto?");
        listaPreguntas.add("¿Tú personaje tiene el pelo largo?");
        listaPreguntas.add("¿Tú personaje tiene pelo?");
        listaPreguntas.add("¿Tú personaje tiene una cresta?");
        listaPreguntas.add("¿El personaje que has elegido es Carlos?");
        listaPreguntas.add("¿El personaje que has elegido es Ana?");
        listaPreguntas.add("¿El personaje que has elegido es Pedro?");
        listaPreguntas.add("¿El personaje que has elegido es Lucia?");
        listaPreguntas.add("¿El personaje que has elegido es Javier?");
        listaPreguntas.add("¿El personaje que has elegido es María?");
        listaPreguntas.add("¿El personaje que has elegido es Andrés?");
        listaPreguntas.add("¿El personaje que has elegido es Beatríz?");
        listaPreguntas.add("¿El personaje que has elegido es Raúl?");
        listaPreguntas.add("¿El personaje que has elegido es Sofía?");
        











        
        
        do {
        int elegido= Menu.menu();
		 
		 if (elegido==1) {
		     for(Personaje personaje: listaPersonajes) {
					personaje.imprimirPersonaje();
					salirMenu=true;
				}
		 }else if(elegido==2) {
			 Menu.instrucciones();
			 
		 }else {
			  System.out.println("has salido del juego");
			 salirJuego=true;
		 }
        }while(salirMenu==false && salirJuego==false);
        
      
      
	}

}
