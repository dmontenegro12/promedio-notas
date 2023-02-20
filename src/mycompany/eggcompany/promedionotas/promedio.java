package mycompany.eggcompany.promedionotas;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
	Scanner nota = new Scanner(System.in);
	int nota1;
	
	
		System.out.println("Ingrese la nota a validar");
		do {
		nota1 = nota.nextInt();
			if(nota1<=0 || nota1 >= 10) { 
			}
			System.out.println("La nota es incorrecta");
						
		}while(nota1<0 || nota1>10);
		System.out.println("La nota es correcta");
		}	
	}

// revisar como arreglar el problema