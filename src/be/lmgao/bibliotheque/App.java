package be.lmgao.bibliotheque;

import java.util.Scanner;


public class App {
	
	public static void main(String[] args) {
		int selectMenu = 5;
		MyLibrary myLibrary = new MyLibrary("Biblio");							// je crée une bibliothèque myLibrary
		
		
		while(selectMenu !=0) {
			System.out.println("M E N U   P R I N C I P A L \n");
			System.out.println("1. Ajouter un membre");
			System.out.println("2. Ajouter un livre");
			System.out.println("3. Emprunter un livre");
			System.out.println("4. Afficher les statistiques");
			System.out.println("0. Quitter \n");
				
			Scanner sc = new Scanner (System.in);								//lecture entrée au clavier
			
			  	try {															//je modifie l'entrée en byte car max 127 poss en positif
	            	selectMenu = Byte.parseByte(sc.nextLine());
	            } catch (NumberFormatException e) {								//si pas int alors erreur
	            	System.out.println("Veuillez entrer une valeur valide !");
	            }
		
		
		switch(selectMenu) {
       
        case 1:
        	System.out.println("\"AJOUTER UN MEMBRE\"");
        	Person nvMembre = new Person();												//Je crée une nouvelle Person / nvMembre
        	System.out.println("Quel est son nom ?\n");
			nvMembre.setName(sc.nextLine());											//Grâce à la méthode set je modifie son nom
            System.out.println("Combien de livres le membre peut-il emprunter ?");
            
	            try {																	// je modifie l'entrée en byte 
	            	nvMembre.setMaxBooks(Byte.parseByte(sc.nextLine()));
	            } catch (NumberFormatException e) {
	            	System.out.println("Veuillez entrer une valeur valide !");
	            }
	            
	        
	        myLibrary.addPerson(nvMembre);							// J'ajoute les données récoltées pour nvMembre comme Person à myLibrary
            
	        System.out.println("Le nouveau membre " + nvMembre.getName() + " est créé. Le nombre de livre qu'il peut emprunter est de " + nvMembre.getMaxBooks());
        	break;
        	
  
        case 2:
        	System.out.println("\"AJOUTER UN LIVRE\"");
        	Book nvBook = new Book();
        	
        	System.out.println("Quel le type de livre à ajouter ?\n 1. Classique \n 2. OnLine \n 3. BD");
        	
        	int choixTypeLivre = 0;
        	
        	try {																	// je modifie l'entrée en byte 
            	choixTypeLivre = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
            	System.out.println("Veuillez entrer une valeur valide !");
            }
        			
	        if(choixTypeLivre == 3) { 
	        	
	        	System.out.println("Quel est le nom du dessinateur ?\n");
	        	nvBook.setCartoonist(sc.nextLine());
	        	
	        	System.out.println("Le livre est-il en couleur ?\n Oui / Non ");
	        	nvBook.setColor(sc.hasNext());  									// #### A VERIFIER ####
	        	
	        }else if (choixTypeLivre == 2) {
	        	
	        	System.out.println("Quel est le résumé du livre ?\n");
	        	nvBook.setContent(sc.nextLine());
	        	
	        	System.out.println("Quel est le nombre maximum d'emprunteurs ? ");
	        	
	        	try {																	// je modifie l'entrée en byte 
	            	nvBook.setMaxPeople(Integer.parseInt(sc.nextLine()));
	            } catch (NumberFormatException e) {
	            	System.out.println("Veuillez entrer une valeur valide !");
	            }
	        	
	        }
	        	
	        	System.out.println("Quel est le nom du livre à ajouter?\n");
	        	nvBook.setTitle(sc.nextLine());
	        	
	        	System.out.println("Quel est l'auteur du livre?\n");
	        	nvBook.setAuthor(sc.nextLine());
	        	
	        	System.out.println("Quel est le nombre de pages du livre\n");
		        	try {																	// je modifie l'entrée en int
		            	nvBook.setTotalPages(Integer.parseInt(sc.nextLine()));
		            } catch (NumberFormatException e) {
		            	System.out.println("Veuillez entrer une valeur valide !");
		            }
	        	
	        	System.out.println("Quel est l'auteur du livre?\n");
	        	nvBook.setAuthor(sc.nextLine());
	        	
	        	System.out.println("Quel est le prix de location du livre\n");
	        	try {																	// je modifie l'entrée en int
	            	nvBook.setRentalPeriod(Byte.parseByte(sc.nextLine()));
	            } catch (NumberFormatException e) {
	            	System.out.println("Veuillez entrer une valeur valide !");
	            }
	        	
	        	System.out.println("Quel est la langue du livre?\n");
	        	nvBook.setLanguage(sc.nextLine());
	        	
	        	 System.out.println("Quel est la durée d'un emprunt de ce livre ?");
                 try {
                     nvBook.setLoanPeriod(Integer.parseInt(sc.nextLine()));
                 } catch (NumberFormatException e) {
                     System.out.println("Veuillez entrer une valeur valide !");
                 }
                 
        	
	        
        	break;
        case 3:
        	System.out.println("\"EMPRUNTER UN LIVRE\"");
        	System.out.println("Quel est le nom du livre à emprunter?\n");
        	break;
        case 4:
        	System.out.println("AFFICHER LES STATISTIQUES");
        	break;
        case 0:
        	System.out.println("Vous avez quitté le programme !");
            break;
        default:
            System.out.println("Veuillez entrer un chiffre entre 0 et 4 !");
}
}
}
}
	
	
	
