package model;

public class Personaje {
	// VARIABLES //
	private String nombre;
	private TipoPelo pelo;
	private ColorPelo colorPelo;
	private Ojos ojos;
	private Genero genero;
	private boolean tieneGafas;
    private boolean tieneBarba;
    private boolean tieneSombrero;
    private boolean tieneBigote;
	private boolean usaPendientes;
    
    // CONTROLADOR //
    public Personaje() {
    	
    }
    public Personaje( String nombre, TipoPelo pelo, ColorPelo colorPelo, Ojos ojos, Genero genero, boolean tieneGafas, boolean tieneBarba,
 			boolean tieneSombrero, boolean tieneBigote, boolean usaPendientes) {
    	this.nombre = nombre;
 		this.pelo = pelo;
 		this.colorPelo = colorPelo;
 		this.ojos = ojos;
 		this.genero = genero;
 		this.tieneGafas = tieneGafas;
 		this.tieneBarba = tieneBarba;
 		this.tieneSombrero = tieneSombrero;
 		this.tieneBigote = tieneBigote;
 		this.usaPendientes = usaPendientes;
 	}
    // GETTERS AND SETTERS //
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoPelo getPelo() {
		return pelo;
	}
	public void setPelo(TipoPelo pelo) {
		this.pelo = pelo;
	}
	public ColorPelo getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(ColorPelo colorPelo) {
		this.colorPelo = colorPelo;
	}
	public Ojos getOjos() {
		return ojos;
	}
	public void setOjos(Ojos ojos) {
		this.ojos = ojos;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public boolean isTieneGafas() {
		return tieneGafas;
	}
	public void setTieneGafas(boolean tieneGafas) {
		this.tieneGafas = tieneGafas;
	}
	public boolean isTieneBarba() {
		return tieneBarba;
	}
	public void setTieneBarba(boolean tieneBarba) {
		this.tieneBarba = tieneBarba;
	}
	public boolean isTieneSombrero() {
		return tieneSombrero;
	}
	public void setTieneSombrero(boolean tieneSombrero) {
		this.tieneSombrero = tieneSombrero;
	}
	public boolean isTieneBigote() {
		return tieneBigote;
	}
	public void setTieneBigote(boolean tieneBigote) {
		this.tieneBigote = tieneBigote;
	}
	public boolean isUsaPendientes() {
		return usaPendientes;
	}
	public void setUsaPendientes(boolean usaPendientes) {
		this.usaPendientes = usaPendientes;
	}

	public void imprimirPersonaje() {
		    System.out.println("╔══════════════════════════════╗");
		    System.out.println("║ 👤 Personaje: " + nombre );
		    System.out.println("╠══════════════════════════════╣");
		    System.out.println("║ 🏷 Tipo de Pelo: " + pelo );
		    System.out.println("║ 🎨 Color de Pelo: " + colorPelo);
		    System.out.println("║ 👁 Color de Ojos: " + ojos);
		    System.out.println("║ 🚻 Género: " + genero );
		    System.out.println("╠══════════════════════════════╣");
		    System.out.println("║ 👓 Gafas: " + (tieneGafas ? "Sí " : "No "));
		    System.out.println("║ 🧔 Barba: " + (tieneBarba ? "Sí " : "No "));
		    System.out.println("║ 🎩 Sombrero: " + (tieneSombrero ? "Sí " : "No "));
		    System.out.println("║ 👨‍🦰 Bigote: " + (tieneBigote ? "Sí " : "No "));
		    System.out.println("║ 💎 Pendientes: " + (usaPendientes ? "Sí " : "No "));
		    System.out.println("╚══════════════════════════════╝");
		}


		}

	
    
	//METODOS DE IMPRESIÓN //
	
	
    
    


