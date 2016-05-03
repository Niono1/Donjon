package Donjon_P;

public class Salles_du_donjon {



	public static int SalleOk(int a, int b)
	{
		int tab[][] = {{ 0,1,0},{2,1,1},{ 0,3,1},{1,1,1},{1,2,3},{1,0,1},{4,0,2}};

		switch(tab[a][b])
		{
		case 1:
			System.out.println("Cool une salle valide !");
			break;
		case 2:
			System.out.println("Oh non une salle piégée !");
			break;
		case 3:
			System.out.println("Oh non un petit monstre !");
			break;
		case 4:
			System.out.println("Oh non un vilain boss qui s'appelle Arhimeas !");
			break;
		default :
			System.out.println("Oh non une impasse !");
		}


		return tab[a][b];

		/* 4 0 2 *  0 = impasse
		 * 1 0 1 *  1 = salle valide
		 * 1 2 3 *  2 = salle piégée
		 * 1 1 1 *  3 = petit monstre        
		 * 0 3 1 *  4 = Arhimeas             
		 * 2 1 1 *
		 * 0 1 0 */ 
	}
}

