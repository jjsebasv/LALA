package itba.edu.java;

import java.util.ArrayList;

public class Memoria {

	int capMax;
	int cantFotos;
	ArrayList<Foto> fotos;
	
	public Memoria(int capMax){
		System.out.println("Creando Memoria con capacidad " + capMax);
		this.capMax = capMax;
		this.cantFotos = 0;
		this.fotos = new ArrayList<>();
	}
	
}
