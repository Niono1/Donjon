package Donjon_P;

import java.util.Scanner;

public class LancerLeJeu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ligneDonjon = 0, colonneDonjon = 1;
		String deplacement = " ";
		int deplace = 0;

		char reponse = 'O';

		do
		{
			System.out.println("ligne Donjon = "+ligneDonjon+"\ncolonne Donjon = "+colonneDonjon);
			System.out.println("Où dois-je aller ?\nChoix :\n-avant\n-droite\n-gauche");

			deplacement = sc.nextLine();

			deplace = Actions.avancer(deplacement, ligneDonjon, colonneDonjon);		

			switch(deplace)
			{
			case 1:
				ligneDonjon++;
				break;
			case 2:
				colonneDonjon++;
				break;
			case 3:
				colonneDonjon--;
				break;
			default :
				System.out.println("Je n'ai pas bougé :"+deplace);	
			}
			
		}while(reponse == 'O');

	}

}




//String déplacement = " ";
//int degats = 0,degats2 = 0;
//Boss arhimeas = new Boss(150,15);
//Heros niono = new Heros(100,10);
//do
//{
//degats = Actions.taper(arhimeas.pDegats);
//degats2 = Actions.taper(niono.pDegats);
//
//arhimeas.pVie = arhimeas.pVie-degats;
//niono.pVie = niono.pVie-degats2;
//
//System.out.println("\nVie de Arhimeas : "+arhimeas.pVie);
//System.out.println("Vie de Niono : "+niono.pVie+"\n");
//
//}while((arhimeas.pVie >= 0) && (niono.pVie >=0));
//
//if (arhimeas.pVie <= 0)
//	System.out.println("Arhimeas est mort");
//if (niono.pVie <= 0)
//	System.out.println("Niono est mort");