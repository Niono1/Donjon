package Donjon_P;

public class Heros extends Personnage {
	
	public Heros()
	{
		this.pVie = 0;
		this.pDegats = 0;
		System.out.println("Je suis un noob");
	}
	
	public Heros (int pVie, int pDegats)
	{
		this.pVie = pVie;
		this.pDegats = pDegats;
		System.out.println("Je suis un personnage poss�dant "+pVie+" Points de Vie"
				+ " et "+pDegats+" Points de Degats");
	}

}
