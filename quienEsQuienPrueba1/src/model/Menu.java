package model;

import java.util.Scanner;

public class Menu {
	
		
	
	public static int menuGeneral(){
		int eleccion=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("╔════════════════════════════════════╗");
    System.out.println("║        🎲 QUIÉN ES QUIÉN 🎲        ║");
    System.out.println("╠════════════════════════════════════╣");
    System.out.println("║  1️ Jugar                           ║");
    System.out.println("║  2️ Instrucciones                   ║");
    System.out.println("║  3️ Salir del juego                 ║");
    System.out.println("╚════════════════════════════════════╝");
    System.out.print("👉 Elige una opción (1-3): ");
	eleccion= sc.nextInt();
	while (eleccion < 1 || eleccion > 3){
		System.out.println("⚠️ Respuesta incorrecta, introduce un número del 1 al 3");
		System.out.println("╔════════════════════════════════════╗");
	    System.out.println("║        🎲 QUIÉN ES QUIÉN 🎲        ║");
	    System.out.println("╠════════════════════════════════════╣");
	    System.out.println("║  1️ Jugar                           ║");
	    System.out.println("║  2️ Instrucciones                   ║");
	    System.out.println("║  3️ Salir del juego                 ║");
	    System.out.println("╚════════════════════════════════════╝");
	    System.out.print("👉 Elige una opción (1-3): ");
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
		    System.out.println("¡Adivina quién es el personaje secreto antes de que se acaben tus opciones!");
		    System.out.println("haciendo preguntas sobre sus características físicas.");
		    System.out.println();
		    
		    System.out.println("🛠 MATERIALES NECESARIOS:");
		    System.out.println("- Tablero con personajes.");
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
		System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      ❓ ELIGE TU PREGUNTA ❓       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║  1️ Género                          ║");
        System.out.println("║  2️ Color del pelo                  ║");
        System.out.println("║  3️ Ojos                            ║");
        System.out.println("║  4️ Tipo de pelo                    ║");
        System.out.println("║  5️ Accesorios                      ║");
        System.out.println("║  6️ Adivinar personaje              ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("👉 Selecciona una categoría (1-6): ");
        eleccion = sc.nextInt();

        while (eleccion < 1 || eleccion > 6) {
            System.out.println("⚠️ Respuesta incorrecta, introduce un número del 1 al 6");
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║      ❓ ELIGE TU PREGUNTA ❓       ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println("║  1️ Género                          ║");
            System.out.println("║  2️ Color del pelo                  ║");
            System.out.println("║  3️ Ojos                            ║");
            System.out.println("║  4️ Tipo de pelo                    ║");
            System.out.println("║  5️ Accesorios                      ║");
            System.out.println("║  6️ Adivinar personaje              ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.print("👉 Selecciona una categoría (1-6): ");
			eleccion= sc.nextInt();
			
		}
		return eleccion;
	}
	
	
}


