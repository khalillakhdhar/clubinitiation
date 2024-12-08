package abstraction;

public abstract class Animal {
private String nom;
private String race;
private int age;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getRace() {
	return race;
}
public void setRace(String race) {
	this.race = race;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Animal(String nom, String race, int age) {
	super();
	this.nom = nom;
	this.race = race;
	this.age = age;
}
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}

public void deplacer(int x, int y)
{
System.out.println("déplacement vers"+ x+" "+ y);	
}
public abstract void faireBruit();

}
