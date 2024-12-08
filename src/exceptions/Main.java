package exceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String convert="123a";
		int x=Integer.parseInt(convert);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("donner une valeur numérique");
		}
		System.out.println("je suis ici");
	}

}
