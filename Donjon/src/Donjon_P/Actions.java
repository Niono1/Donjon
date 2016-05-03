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
			if (a==6)
			{
				System.out.println("Vous avez atteint le bord du donjon !");
			}
			else
			{
			System.out.println("En avant toute !");
			test = Salles_du_donjon.SalleOk(a+1,b);
			if (test > 0)
				resultat = 1;
			}
			break;

		case "droite":
			if (b==2)
			{
				System.out.println("Vous avez atteint le bord du donjon !");
			}
			else
			{
			System.out.println("A droite !");
			test = Salles_du_donjon.SalleOk(a,b+1);
			if (test > 0)
				resultat = 2;
			}
			break;

		case "gauche":
			if (b==0)
			{
				System.out.println("Vous avez atteint le bord du donjon !");
			}
			else
			{
			System.out.println("A gauche !");
			test = Salles_du_donjon.SalleOk(a,b-1);
			if (test > 0)
				resultat = 3;
			}
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
		nb = degats + (int)(Math.random() * 20);
		System.out.println(nb);

		if (nb >= 27)
		{
			System.out.println("Vous avez effectué un coup critique");
			nb = nb*2;
		}

		return nb;
	}
}