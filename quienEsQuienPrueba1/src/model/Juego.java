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

			// Mostrar menú y manejar opciones
			do {
				int elegido = Menu.menuGeneral();
				if (elegido == 1) {
					System.out.println("\n¡Comienza el juego! Haz preguntas para adivinar.\n");

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
		this.personajeSecreto = Personaje.obtenerPersonajeAleatorio(listaPersonajes);

		while (!finPartida && !salirJuego) {
			// Mostrar personajes restantes
			System.out.println("Personajes restantes (" + personajesRestantes.size() + "):");
			for (Personaje personaje : personajesRestantes) {
				personaje.imprimirPersonaje();
			}

			// Preguntar al jugador
			int preguntaElegida = Menu.preguntasRasgos();
			Preguntas listaPreguntas = new Preguntas();

			if (preguntaElegida == 6) { // Adivinar personaje
				ArrayList<String> nombres = listaPreguntas.getPreguntasPorCategoria("Nombres");
				for (String pregunta : nombres) {
					System.out.println(pregunta);
				}
				int eleccion = sc.nextInt();
				String nombreElegido = obtenerNombre(eleccion);
				if (nombreElegido.equals(personajeSecreto.getNombre())) {
					System.out.println("¡Ganaste! El personaje era " + personajeSecreto.getNombre());
					personajeSecreto.imprimirPersonaje();

					finPartida = true;
				} else {
					System.out.println("Perdiste. El personaje era " + personajeSecreto.getNombre());
					personajeSecreto.imprimirPersonaje();

					finPartida = true;
				}
			} else {
				// Mostrar preguntas según categoría
				String categoria = "";
				if (preguntaElegida == 1) {
					categoria = "Genero";
				} else if (preguntaElegida == 2) {
					categoria = "ColorPelo";
				} else if (preguntaElegida == 3) {
					categoria = "Ojos";
				} else if (preguntaElegida == 4) {
					categoria = "TipoPelo";
				} else if (preguntaElegida == 5) {
					categoria = "Accesorios";
				}

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
					personajeSecreto.imprimirPersonaje();
					finPartida = true;
				}
			}
		}
	}

	private void descartarPersonajes(ArrayList<Personaje> lista, String categoria, int eleccion) {
		boolean coincidePersonajeSecreto = false;
		int contadorGenero = 0;
		int contadorColorPelo = 0;
		int contadorOjos = 0;
		int contadorTipoPelo = 0;
		int contadorGafas = 0;
		int contadorSombrero = 0;
		int contadorBigote = 0;
		int contadorBarba = 0;
		int contadorPendientes = 0;

		for (int i = lista.size() - 1; i >= 0; i--) {
			Personaje personaje = lista.get(i);
			if (categoria.equals("Genero")) {
				if (eleccion == 1 && personaje.getGenero() != Genero.HOMBRE && coincidePersonajeSecreto) {
					if (contadorGenero == 0) {
						System.out.println("El personaje secreto es hombre\n");
						contadorGenero++;
					}
					lista.remove(i);
				} else if (eleccion == 2 && personaje.getGenero() != Genero.MUJER && coincidePersonajeSecreto) {
					if (contadorGenero == 0) {
						System.out.println("El personaje secreto es Mujer\n");
						contadorGenero++;
					}
					lista.remove(i);
				} else if (eleccion == 1 && personaje.getGenero() == Genero.HOMBRE && !coincidePersonajeSecreto) {
					if (contadorGenero == 0) {
						System.out.println("El personaje secreto no es hombre\n");
						contadorGenero++;
					}

					lista.remove(i);
				} else if (eleccion == 2 && personaje.getGenero() == Genero.MUJER && !coincidePersonajeSecreto) {
					if (contadorGenero == 0) {
						System.out.println("El personaje secreto no es Mujer\n");
						contadorGenero++;
					}
					lista.remove(i);
				}
			} else if (categoria.equals("ColorPelo")) {
				ColorPelo[] colores = { ColorPelo.RUBIO, ColorPelo.MORENO, ColorPelo.CASTANYO, ColorPelo.BLANCO,
						ColorPelo.PELIRROJO };
				if (personaje.getColorPelo() != colores[eleccion - 1] && coincidePersonajeSecreto) {
					if (contadorColorPelo == 0) {
						System.out.println("El personaje secreto es " + colores[eleccion - 1] + "\n");
						contadorColorPelo++;
					}
					lista.remove(i);
				} else if (personaje.getColorPelo() == colores[eleccion - 1] && !coincidePersonajeSecreto) {
					if (contadorColorPelo == 0) {
						System.out.println("El personaje secreto no es " + colores[eleccion - 1] + "\n");
						contadorColorPelo++;
					}
					lista.remove(i);
				}
			} else if (categoria.equals("Ojos")) {
				Ojos[] ojos = { Ojos.MARRONES, Ojos.NEGROS, Ojos.AZULES, Ojos.VERDES };
				if (personaje.getOjos() != ojos[eleccion - 1] && coincidePersonajeSecreto) {
					if (contadorOjos == 0) {
						System.out.println("Los ojos del personaje secreto son " + ojos[eleccion - 1] + "\n");
						contadorOjos++;
					}
					lista.remove(i);
				} else if (personaje.getOjos() == ojos[eleccion - 1] && !coincidePersonajeSecreto) {
					if (contadorOjos == 0) {
						System.out.println("Los ojos del personaje secreto no son " + ojos[eleccion - 1] + "\n");
						contadorOjos++;
					}
					lista.remove(i);
				}
			} else if (categoria.equals("TipoPelo")) {
				TipoPelo[] tipos = { TipoPelo.RIZADO, TipoPelo.CORTO, TipoPelo.LARGO, TipoPelo.CALVO, TipoPelo.CRESTA };
				if (personaje.getPelo() != tipos[eleccion - 1] && coincidePersonajeSecreto) {
					if (contadorTipoPelo == 0) {
						System.out.println("El pelo del personaje secreto es " + tipos[eleccion - 1] + "\n");
						contadorTipoPelo++;
					}
					lista.remove(i);
				} else if (personaje.getPelo() == tipos[eleccion - 1] && !coincidePersonajeSecreto) {
					if (contadorTipoPelo == 0) {
						System.out.println("El pelo del personaje secreto no es " + tipos[eleccion - 1] + "\n");
						contadorTipoPelo++;
					}
					lista.remove(i);
				}
			} else if (categoria.equals("Accesorios")) {
				switch (eleccion) {
				case 1:
					if (!personaje.isTieneGafas() && coincidePersonajeSecreto) {
						if (contadorGafas == 0) {
							System.out.println("El personaje secreto tiene gafas \n");
							contadorGafas++;
						}
						lista.remove(i);
					} else if (personaje.isTieneGafas() && !coincidePersonajeSecreto) {
						if (contadorGafas == 0) {
							System.out.println("El personaje secreto no tiene gafas \n");
							contadorGafas++;
						}
						lista.remove(i);
					}

					break;
				case 2:
					if (!personaje.isTieneBarba() && coincidePersonajeSecreto) {
						if (contadorBarba == 0) {
							System.out.println("El personaje secreto tiene barba \n");
							contadorBarba++;
						}
						lista.remove(i);
					} else if (personaje.isTieneBarba() && !coincidePersonajeSecreto) {
						if (contadorBarba == 0) {
							System.out.println("El personaje secreto no tiene barba \n");
							contadorBarba++;
						}
						lista.remove(i);
					}
					break;
				case 3:
					if (!personaje.isTieneSombrero() && coincidePersonajeSecreto) {
						if (contadorSombrero == 0) {
							System.out.println("El personaje secreto tiene sombrero \n");
							contadorSombrero++;
						}
						lista.remove(i);
					} else if (personaje.isTieneSombrero() && !coincidePersonajeSecreto) {
						if (contadorSombrero == 0) {
							System.out.println("El personaje secreto no tiene sombrero \n");
							contadorSombrero++;
						}
						lista.remove(i);
					}
					break;
				case 4:
					if (!personaje.isTieneBigote() && coincidePersonajeSecreto) {
						if (contadorBigote == 0) {
							System.out.println("El personaje secreto tiene bigote \n");
							contadorBigote++;
						}
						lista.remove(i);
					} else if (personaje.isTieneBigote() && !coincidePersonajeSecreto) {
						if (contadorBigote == 0) {
							System.out.println("El personaje secreto no tiene bigote \n");
							contadorBigote++;
						}
						lista.remove(i);
					}
					break;
				case 5:
					if (!personaje.isUsaPendientes() && coincidePersonajeSecreto) {
						if (contadorPendientes == 0) {
							System.out.println("El personaje secreto tiene pendientes \n");
							contadorPendientes++;
						}
						lista.remove(i);
					} else if (personaje.isUsaPendientes() && !coincidePersonajeSecreto) {
						if (contadorPendientes == 0) {
							System.out.println("El personaje secreto tiene pendientes \n");
							contadorPendientes++;
						}
						lista.remove(i);
						break;
					}

				}
			}
		}
	}

	private String obtenerNombre(int eleccion) {
		String[] nombres = { "Carlos", "Ana", "Pedro", "Lucía", "Javier", "María", "Andrés", "Beatriz", "Raúl",
				"Sofía" };
		return nombres[eleccion - 1];
	}
}