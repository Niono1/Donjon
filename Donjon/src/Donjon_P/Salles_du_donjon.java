package Donjon_P;

public class Salles_du_donjon {



	public static int SalleOk(int a, int b)
	{
		int tab[][] = {{ 0,1,0},{2,1,1},{ 0,3,1},{1,1,1},{1,2,3},{1,0,1},{4,0,2}};

		//Actions.Deplacement("avancer");
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

