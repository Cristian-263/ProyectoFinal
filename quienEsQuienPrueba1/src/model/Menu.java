package model;

import java.util.Scanner;

public class Menu {
	
		
	
	public static int menuGeneral(){
		int eleccion=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Eligue que quieres hacer \n jugar \n instrucciones \n salir del juego ");
	eleccion= sc.nextInt();
	while (eleccion < 1 || eleccion > 3){
		System.out.println("Respuesta incorrecta introduce un numero del 1 al 3");
		System.out.println("Eligue que quieres hacer \n jugar \n instrucciones \n salir del juego ");
		eleccion= sc.nextInt();
	}
	return eleccion;
	}
	public static void instrucciones() {
		    System.out.println("==============================================");
		    System.out.println("            🎭 QUIÉN ES QUIÉN 🎭             ");
		    System.out.println("==============================================");
		    System.out.println();
		    
		    System.out.println("🎯 OBJETIVO:");
		    System.out.println("Cada jugador debe adivinar el personaje secreto del oponente");
		    System.out.println("haciendo preguntas sobre sus características físicas.");
		    System.out.println();
		    
		    System.out.println("🛠 MATERIALES NECESARIOS:");
		    System.out.println("- Tablero con personajes.");
		    System.out.println("- Fichas abatibles.");
		    System.out.println("- Lista de características.");
		    System.out.println();
		    
		    System.out.println("🏁 PREPARACIÓN:");
		    System.out.println("1. Cada jugador elige un personaje en secreto.");
		    System.out.println("2. Todos los personajes comienzan en posición visible.");
		    System.out.println();
		    
		    System.out.println("🔍 CÓMO JUGAR:");
		    System.out.println("▶ Se juega por turnos.");
		    System.out.println("▶ Un jugador hace una pregunta de 'Sí' o 'No'. Ejemplo:");
		    System.out.println("   - ¿Tiene gafas?");
		    System.out.println("   - ¿Es rubio?");
		    System.out.println("   - ¿Tiene bigote?");
		    System.out.println("▶ Se descartan personajes según las respuestas.");
		    System.out.println();
		    
		    System.out.println("🏆 FINAL DEL JUEGO:");
		    System.out.println("- Cuando un jugador crea saber el personaje, puede hacer");
		    System.out.println("  una única suposición.");
		    System.out.println("- Si acierta, gana. Si falla, pierde.");
		    System.out.println();
		    System.out.println("==============================================");

	}

	public static int preguntasRasgos() {
		int eleccion=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sobre que quieres preguntar: ");
		System.out.println("1.Genero ");
		System.out.println("2.Color del pelo ");
		System.out.println("3.Ojos ");
		System.out.println("4.Tipo de pelo ");
		System.out.println("5. Adivinar personaje ");
		eleccion= sc.nextInt();
		while (eleccion < 1 || eleccion > 5){
			System.out.println("Respuesta incorrecta introduce un numero del 1 al 5");
			System.out.println("Sobre que quieres preguntar: ");
			System.out.println("1.Genero ");
			System.out.println("2.Color del pelo ");
			System.out.println("3.Ojos ");
			System.out.println("4.Tipo de pelo ");
			System.out.println("5. Adivinar personaje ");
			eleccion= sc.nextInt();
			
		}
		return eleccion;
	}
	
	
}


