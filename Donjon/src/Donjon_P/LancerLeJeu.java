package Donjon_P;

import java.util.Scanner;

public class LancerLeJeu {

	public static void main(String[] args) {

		String déplacement = " ";
		int degats = 0,degats2 = 0;
//		Personnage niono = new Personnage();
		Heros arhimeas = new Heros(200,10);
		Heros niono = new Heros(200,10);
		do
		{
		degats = Actions.taper(arhimeas.pDegats);
		degats2 = Actions.taper(niono.pDegats);
		
		arhimeas.pVie = arhimeas.pVie-degats;
		niono.pVie = niono.pVie-degats2;
		
		System.out.println("\nVie de Arhimeas : "+arhimeas.pVie);
		System.out.println("Vie de Niono : "+niono.pVie+"\n");
		
		}while((arhimeas.pVie >= 0) && (niono.pVie >=0));
		
		if (arhimeas.pVie <= 0)
			System.out.println("Arhimeas est mort");
		if (niono.pVie <= 0)
			System.out.println("Niono est mort");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Où dois-je aller ?\nChoix :\nA gauche\nA droite\nAvancer");
//		déplacement = sc.nextLine();
	
		
		
	}

}
