package clubinitiation;

public class Ordinateur {
	private	String marque;
	private	double prix;
	private String fournisseur;
	private String cpu;
	private int ram; // 32 bits memoire
	private String carteGraphique;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getCarteGraphique() {
		return carteGraphique;
	}
	public void setCarteGraphique(String carteGraphique) {
		this.carteGraphique = carteGraphique;
	}
	public double promo()
	{
		return this.getPrix()*0.1;
	}
	// surcharge (overloading)
	public double promo(int pourcentage)
	{
		return (this.getPrix()*pourcentage)/100;
	}
	public Ordinateur(String marque, double prix, String fournisseur, String cpu, int ram, String carteGraphique) {
		super();
		this.marque = marque;
		this.prix = prix;
		this.fournisseur = fournisseur;
		this.cpu = cpu;
		this.ram = ram;
		this.carteGraphique = carteGraphique;
	}
	public Ordinateur() {
		super();
	}
	
	public double calculeTaxe()
	{
		return this.prix*0.12;
	}
	@Override
	public String toString() {
		return "Ordinateur [marque=" + marque + ", prix=" + prix + ", fournisseur=" + fournisseur + ", cpu=" + cpu
				+ ", ram=" + ram + ", carteGraphique=" + carteGraphique + ", promo()=" + promo() + ", calculeTaxe()="
				+ calculeTaxe() + "]";
	}
	
	

}
