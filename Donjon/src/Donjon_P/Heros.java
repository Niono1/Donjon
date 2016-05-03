package Donjon_P;

public class Heros extends Personnage {
	
	int pNiveau = 0;
	
	public Heros()
	{
		this.pVie = 0;
		this.pDegats = 0;
		int pNiveau = 1;
		System.out.println("Je suis un noob");
	}
	
	public Heros (int pVie, int pDegats)
	{
		this.pVie = pVie;
		this.pDegats = pDegats;
		int pNiveau = 1;
		System.out.println("Je suis un heros de niveau "+pNiveau+" possédant "+pVie+" Points de Vie"
				+ " et "+pDegats+" Points de Degats");
	}

}
