package ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> comandos = new ArrayList<String>();
		comandos.add("sh");
		comandos.add("script.sh");
		String argumento;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce argumento");
		argumento = sc.next();
		sc.close();
		comandos.add(argumento);
		
		
		ProcessBuilder processBuilder = new ProcessBuilder(comandos);
		try {
			Process proceso = processBuilder.start();
			Scanner sc2 = new Scanner(proceso.getInputStream());
			while(sc2.hasNext()) {
				System.out.println(sc2.next());
			}
			sc2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	}

}
