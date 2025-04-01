package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Preguntas {
	private HashMap<String, ArrayList<String>> listaPreguntas;
	

	public Preguntas() {
        // Inicializar el HashMap
        listaPreguntas = new HashMap<>();

        // Crear los ArrayList
        ArrayList<String> genero = new ArrayList<>();
        ArrayList<String> colorPelo = new ArrayList<>();
        ArrayList<String> ojos = new ArrayList<>();
        ArrayList<String> tipoPelo = new ArrayList<>();
        ArrayList<String> accesorios = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();

        // Llenar los ArrayList con preguntas
        genero.add("1. ¿Tu personaje es hombre?");
        genero.add("2. ¿Tu personaje es mujer?");

        colorPelo.add("1. ¿Tu personaje tiene el pelo Rubio?");
        colorPelo.add("2. ¿Tu personaje tiene el pelo Moreno?");
        colorPelo.add("3. ¿Tu personaje tiene el pelo Castaño?");
        colorPelo.add("4. ¿Tu personaje tiene el pelo Blanco?");
        colorPelo.add("5. ¿Tu personaje tiene el pelo Pelirrojo?");

        ojos.add("1. ¿Tu personaje tiene los ojos marrones?");
        ojos.add("2. ¿Tu personaje tiene los ojos negros?");
        ojos.add("3. ¿Tu personaje tiene los ojos azules?");
        ojos.add("4. ¿Tu personaje tiene los ojos verdes?");

        tipoPelo.add("1. ¿Tu personaje tiene el pelo rizado?");
        tipoPelo.add("2. ¿Tu personaje tiene el pelo corto?");
        tipoPelo.add("3. ¿Tu personaje tiene el pelo largo?");
        tipoPelo.add("4. ¿Tu personaje tiene pelo?");
        tipoPelo.add("5. ¿Tu personaje tiene una cresta?");
        
        accesorios.add("1. ¿Tu personaje tiene gafas?");
        accesorios.add("2. ¿Tu personaje tiene barba?");
        accesorios.add("3. ¿Tu personaje tiene sombrero?");
        accesorios.add("4. ¿Tu personaje tiene bigotes?");
        accesorios.add("5. ¿Tu personaje tiene pendientes?");

        nombres.add("1. ¿El personaje que has elegido es Carlos?");
        nombres.add("2. ¿El personaje que has elegido es Ana?");
        nombres.add("3. ¿El personaje que has elegido es Pedro?");
        nombres.add("4. ¿El personaje que has elegido es Lucía?");
        nombres.add("5. ¿El personaje que has elegido es Javier?");
        nombres.add("6. ¿El personaje que has elegido es María?");
        nombres.add("7. ¿El personaje que has elegido es Andrés?");
        nombres.add("8. ¿El personaje que has elegido es Beatriz?");
        nombres.add("9. ¿El personaje que has elegido es Raúl?");
        nombres.add("10. ¿El personaje que has elegido es Sofía?");

        // Añadir los ArrayList al HashMap
        listaPreguntas.put("Genero", genero);
        listaPreguntas.put("ColorPelo", colorPelo);
        listaPreguntas.put("Ojos", ojos);
        listaPreguntas.put("TipoPelo", tipoPelo);
        listaPreguntas.put("Accesorios", accesorios);
        listaPreguntas.put("Nombres", nombres);
        
    }
	//Getters and Setters //
	public HashMap<String, ArrayList<String>> getListaPreguntas() {
        return listaPreguntas;
    }
	public void setListaPreguntas(HashMap<String, ArrayList<String>> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}

    // Método para obtener las preguntas de una categoría específica
    public ArrayList<String> getPreguntasPorCategoria(String categoria) {
        return listaPreguntas.get(categoria);
    }

}

