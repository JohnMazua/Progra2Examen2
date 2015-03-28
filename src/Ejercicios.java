import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int cont=0;
		for(int i=0;i<mi_lista.size();i++){
		if(mi_lista.get(i)%2==0) cont=cont+1;
		if(cont==mi_lista.size()) return true;		
		}
		return false;
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try{
			PrintWriter num = new PrintWriter(nombre_archivo);
			num.println(n1+" "+n2+" "+n3);
			num.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			}
	}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{
		String palabra="", palabra2="";
		try{
		Scanner lector = new Scanner(new File(nombre_archivo));
		while(lector.hasNext())
		{
		palabra = lector.next();
		while(lector.hasNext())
		{
		palabra2 = lector.next();	
		if(palabra.equals(palabra2)) return true; 
		}
		}
		lector.close();
		}catch (FileNotFoundException e){
		e.printStackTrace();
		}
		return false;
	}
}
