package view;

import controller.Controller;
import model.logic.Cinema;

public class View 
{
		private Controller cont;
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Seleccione la opcion a su gusto.");
			System.out.println("Opcion1. Ver informaci�n b�sica de la primer y �ltima pel�cula de los archivos ademas de, el total de pel�culas encontradas en las fuentes");
			System.out.println("Opcion2. Encontrar buenas peliculas de un director");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Cinema modelo)
		{
			// TODO implementar
		}
		
}
