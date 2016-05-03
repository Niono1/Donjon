package Donjon_P;

public class Boss extends Personnage {

	public Boss()
	{
		this.pVie = 0;
		this.pDegats = 0;
		System.out.println("Je suis un noob");
	}
	
	public Boss (int pVie, int pDegats)
	{
		this.pVie = pVie;
		this.pDegats = pDegats;
		System.out.println("Je suis un personnage possédant "+pVie+" Points de Vie"
				+ " et "+pDegats+" Points de Degats");
	}
}
