package ejercicio3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) {
		
		String enviarAlServ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los que quieres enviar");
		enviarAlServ = sc.next();
		sc.close();
		
		try {
			Socket sockerCli = new Socket("localhost", 4077);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(sockerCli.getOutputStream());
			objectOutputStream.writeObject(enviarAlServ);
			objectOutputStream.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
