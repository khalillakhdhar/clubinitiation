package clubinitiation;

public class Laptop extends Ordinateur{
	
	private int autonomie;

	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public Laptop(String marque, double prix, String fournisseur, String cpu, int ram, String carteGraphique,
			int autonomie) {
		super(marque, prix, fournisseur, cpu, ram, carteGraphique);
		this.autonomie = autonomie;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculeTaxe()
	{
		return super.getPrix()*0.15;
	}

	@Override
	public String toString() {
		return "Laptop [autonomie=" + autonomie + ", toString()=" + super.toString() + "]";
	}
	

}
