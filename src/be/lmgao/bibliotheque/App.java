package be.lmgao.bibliotheque;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		int selectMenu = 1;
		
		while(selectMenu !=0) {
			System.out.println("1. Ajouter un membre");
			System.out.println("2. Ajouter un livre");
			System.out.println("3. Emprunter un livre");
			System.out.println("4. Afficher les statistiques");
			System.out.println("0. Quitter");
				
		
		Scanner in = new Scanner (System.in);
	

		switch(in.nextInt()) {
       
        case 1:
        	System.out.println("\"AJOUTER UN MEMBRE\"");
        	System.out.println("Quel est son nom ?\n");
        	
        	break;
        case 2:
        	System.out.println("\"AJOUTER UN LIVRE\"");
        	System.out.println("Quel est le nom du livre à ajouter?\n");
        	break;
        case 3:
        	System.out.println("\"EMPRUNTER UN LIVRE\"");
        	System.out.println("Quel est le nom du livre à emprunter?\n");
        	break;
        case 4:
        	System.out.println("AFFICHER LES STATISTIQUES");
        	break;
        case 0:
        	System.out.println("");
            break;
        default:
            System.out.println("");
}
}
}
}
	
	
	
