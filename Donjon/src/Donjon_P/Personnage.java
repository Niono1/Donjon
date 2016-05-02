package Donjon_P;

public class Personnage {

	int pVie = 0;
	int pDegats = 0;
	
	public Personnage()
	{
		this.pVie = 0;
		this.pDegats = 0;
		System.out.println("Je suis un noob");
	}
	
	public Personnage (int pVie, int pDegats)
	{
		this.pVie = pVie;
		this.pDegats = pDegats;
		System.out.println("Je suis un personnage possédant "+pVie+" Points de Vie"
				+ " et "+pDegats+" Points de Degats");
	}

}
