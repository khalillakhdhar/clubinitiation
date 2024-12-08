package clubinitiation;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordinateur o1=new Ordinateur();
		o1.setCarteGraphique("GTX");
		//o1.ram=32;
		//System.out.println(o1.ram);
		o1.setRam(32);
		o1.setPrix(3600);
		String message="hello";
		int x=4;
		float y=7;
		double z=22.4;
		// double => float =>int
		// affecter un float ou int à un double est possible 
		// affecter un  int à un float est possible 
		// l'inverse necessite un transtypage (entre les valeur numériques)
		/*y=x;
		y=(float) z;
		x=(int) z; // transtypage
		
		String Chaine = "1234";
		int conv= Integer.parseInt(Chaine);
		double cv=Double.parseDouble(Chaine);
		*/
		Ordinateur o2=new Ordinateur("toshiba",3800, "tunet", "i7", 32, "GTX");
		double soldeGen=o2.promo();
		double soldePar=o2.promo(20);
		System.out.println("le solde générale sera de "+soldeGen+" et le solde particulier "+soldePar);
		System.out.println(o2.toString());
		Ordinateur o3=new Laptop("msi",4200,"mytek","i7",32,"gtx 90",0); // bad practice
		Laptop l1=new Laptop("msi",4200,"mytek","i7",32,"gtx 90",3); // correcte
		//Laptop l1=new Ordinateur("msi",4200,"mytek","i7",32,"gtx 90"); incorrecte
		System.out.println(l1.toString());
	}

}
