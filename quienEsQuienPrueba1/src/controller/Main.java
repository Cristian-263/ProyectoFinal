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
        listaPreguntas.add("1. ¿Tú personaje es hombre?");
        listaPreguntas.add("2. ¿Tú personaje es mujer?");
        listaPreguntas.add("1.¿Tú personaje tiene el pelo Rubio?");
        listaPreguntas.add("2. ¿Tú personaje tiene el pelo Moreno?");
        listaPreguntas.add("3. ¿Tú personaje tiene el pelo Castaño?");
        listaPreguntas.add("4. ¿Tú personaje tiene el pelo Blanco?");
        listaPreguntas.add("5. ¿Tú personaje tiene el pelo Pelirrojo?");
        listaPreguntas.add("1. ¿Tú personaje tiene los ojos marrones?");
        listaPreguntas.add("2. ¿Tú personaje tiene los ojos negros?");
        listaPreguntas.add("3. ¿Tú personaje tiene los ojos azules?");
        listaPreguntas.add("4. ¿Tú personaje tiene los ojos verdes?");
        listaPreguntas.add("1. ¿Tú personaje tiene el pelo rizado?");
        listaPreguntas.add("2. ¿Tú personaje tiene el pelo corto?");
        listaPreguntas.add("3. ¿Tú personaje tiene el pelo largo?");
        listaPreguntas.add("4. ¿Tú personaje tiene pelo?");
        listaPreguntas.add("5. ¿Tú personaje tiene una cresta?");
        listaPreguntas.add("1. ¿El personaje que has elegido es Carlos?");
        listaPreguntas.add("2. ¿El personaje que has elegido es Ana?");
        listaPreguntas.add("3. ¿El personaje que has elegido es Pedro?");
        listaPreguntas.add("4. ¿El personaje que has elegido es Lucia?");
        listaPreguntas.add("5. ¿El personaje que has elegido es Javier?");
        listaPreguntas.add("6. ¿El personaje que has elegido es María?");
        listaPreguntas.add("7. ¿El personaje que has elegido es Andrés?");
        listaPreguntas.add("8. ¿El personaje que has elegido es Beatríz?");
        listaPreguntas.add("9. ¿El personaje que has elegido es Raúl?");
        listaPreguntas.add("10. ¿El personaje que has elegido es Sofía?");     
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
			 salirJuego=true;
		 }
        }while(salirMenu==false && salirJuego==false);
        
        if(salirMenu==true) {
        	int preguntaElegida= Menu.preguntas();
        	if(preguntaElegida==1) {
        		for(int i=0; i<=1; i++) {
        			System.out.println(listaPreguntas.get(i));
        		}
        	}else if(preguntaElegida==2) {
        		for(int i=2; i<=6; i++) {
        			System.out.println(listaPreguntas.get(i));
        		}
            }else if(preguntaElegida==3) {
                for(int i=7; i<=10; i++) {
                System.out.println(listaPreguntas.get(i));	
                }
            }else if(preguntaElegida==4) {
        		for(int i=11; i<=15; i++) {
        			System.out.println(listaPreguntas.get(i));
        		}
            }else if(preguntaElegida==5) {
        		for(int i=16; i<listaPreguntas.size(); i++) {
        			System.out.println(listaPreguntas.get(i));
        		}
            }
        }else if(salirJuego==true) {
        	System.out.println("Has decidido salir del juego ");
        	System.out.println("Hasta la próxima");
        }
        
      
      
	}

}
