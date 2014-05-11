package itba.edu.java;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memoria SD = new Memoria(5);
		Camara cam = new Camara();
		
		cam.tomarFoto(SD);
		
		cam.eliminarFoto(2, SD);

	}

}
