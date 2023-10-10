package comunicacion;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return Alfabeto.getLetras().length;
	}
	
	public String interpretacion() {
		return this.getInterpretacion();
	}
	
	public String toString() {
		String texto = "";
		for (int i = 0; i < Alfabeto.letras.length; i++) {
			texto += Alfabeto.letras[i];
			if (i != Alfabeto.letras.length) {
				texto += ", ";
			}
		}
		return texto;
	}
	
	public static String[] getLetras() {
		return Alfabeto.letras;
	}
	
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
