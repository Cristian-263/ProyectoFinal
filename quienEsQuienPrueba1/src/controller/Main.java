package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


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
		
		Juego juego = new Juego();
        juego.menuGeneral(listaPersonajes);
        juego.jugar();
 
		
       
	}



}
