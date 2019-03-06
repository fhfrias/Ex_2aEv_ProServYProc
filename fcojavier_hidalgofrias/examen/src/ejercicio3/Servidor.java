package ejercicio3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	
	public static void main(String[] args) {
		boolean estado = true;
		String recibido;
		
		try {
			ServerSocket serverSocket = new ServerSocket(4077);
			Socket sockerServ;
			
			while(estado) {
				
				System.out.println("El servidor ha arrancado");
				sockerServ = serverSocket.accept();
				ObjectInputStream entrada = new ObjectInputStream(sockerServ.getInputStream());
				try {
					recibido = (String) entrada.readObject();
					if (recibido.toLowerCase().equals("fin")) {
						estado = false;
						sockerServ.close();
						entrada.close();
					} else {
						System.out.println("Recibido del cliente: " + recibido + ", Te muestro: " + recibido.toUpperCase());
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
