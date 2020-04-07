package calificaciones;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calificacion(0);
	}
	
	public static int calificacion(int numero) {
		
		// Calificaciones con respecto a 100 como maximo
		// Minima aprobatoria 70
		
		String texto = "";
		
		if (numero >= 70) {
			texto = "Calificacion Aprobatoria";
		} else {
			texto = "No aprobado";	
		}
		return numero;
			
	}

}
