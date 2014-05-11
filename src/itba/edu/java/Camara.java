package itba.edu.java;

public class Camara {

	public void tomarFoto(Memoria SD){
		if(SD.cantFotos == SD.capMax)
			System.out.println("No hay más lugar");
		else{
			Foto newFoto = new Foto();
			int n = SD.fotos.indexOf(newFoto);
			System.out.println("Tomando foto " + n);
			SD.fotos.add(newFoto);
			SD.cantFotos++;
			System.out.println("Foto " + SD.cantFotos + " de " + SD.capMax + " guardada Exitosamente.");
			
		}
	}
	
	public void eliminarFoto(Foto foto, Memoria SD){
		if( SD.fotos.contains(foto) == false )
			System.out.println("No existe ese elemento.");
		else{
			int n = SD.fotos.indexOf(foto);
			System.out.println("Eliminando foto " + n + ".");
			SD.fotos.remove(n);
			SD.cantFotos--;
			System.out.println(SD.cantFotos + " de " + SD.capMax + " en Memoria.");
			
		}
	}
	
	public void eliminarFoto(int index, Memoria SD){
		
		if( index > SD.cantFotos )
			System.out.println("No existe ese elemento.");
		else{
			int n = index;
			System.out.println("Eliminando foto " + n + ".");
			SD.fotos.remove(n);
			SD.cantFotos--;
			System.out.println(SD.cantFotos + " de " + SD.capMax + " en Memoria.");
			
		}
	}
	
}
