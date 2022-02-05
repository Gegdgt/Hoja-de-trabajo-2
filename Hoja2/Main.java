import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
	
	private static ArrayList<String> readFile(){
		try {
			NombreArchivo = "datos.txt";
			File archivo = new File(NombreArchivo);
			ArrayList<String> data = new ArrayList<String>();
			Scanner scan = new Scanner(archivo);
			while (scan.hasNextLine()) {
				data.add(scan.nextLine());
			}
			scan.close();
			return data;
		}
		catch(Exception e) {
			System.err.println("No se encontro la ruta");
			return null;
		}
	}
	
	public static void main(String[] args) {
		PosfixCalc posfix = new PosfixCalc();
		for(int i = 0; i < readFile().size(); i++) {
			if (posfix.Evaluate(readFile().get(i)) == 999) {
				System.out.println("Error");
			}
			else {
				System.out.println("La respuesta es: " + posfix.Evaluate(readFile().get(i)));
			}
			
		}

	}
}
