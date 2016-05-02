package Donjon_P;
import java.util.Scanner;

public class Actions {


	public static int avancer (String str, int a, int b) {

		// Initialisation
		Scanner sc = new Scanner(System.in);
		String reponse = " ";
		int test = 0,resultat = 0;

		// Programme
		switch (str)
		{
		case "avant":
			System.out.println("En avant toute !");
			test = Salles_du_donjon.SalleOk(a+1,b);
			if (test == 1)
			{
				System.out.println("Cool une nouvelle salle");
				resultat = 1;
			}
			else
				System.out.println("Oh non une impasse !");
			break;
		case "droite":
			System.out.println("A droite !");
			test = Salles_du_donjon.SalleOk(a,b+1);
			if (test == 1)
			{
				System.out.println("Cool une nouvelle salle");
				resultat = 2;
			}
			else
				System.out.println("Oh non une impasse !");
			break;
		case "gauche":
			System.out.println("A gauche !");
			test = Salles_du_donjon.SalleOk(a+1,b-1);
			if (test == 1)
			{
				System.out.println("Cool une nouvelle salle");
				resultat = 3;
			}
			else
				System.out.println("Oh non une impasse !");
			break;
		default:
			System.out.println("Veuillez répéter, je ne comprends pas : "+str);
			reponse = sc.nextLine();
			avancer(reponse,a , b);

		}
		return resultat;
	}

	public static int taper(int degats) {
		// Initialisation
		int nb = 0;

		// Programme
		nb = 10 + (int)(Math.random() * 20);
		System.out.println(nb);

		if (nb >= 27)
		{
		System.out.println("Vous avez effectué un coup critique");
		nb = nb*2;
		}
		
		return nb;
	}
}