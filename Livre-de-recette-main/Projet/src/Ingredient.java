
public class Ingredient {
	public final String nom;
	public float quantiteg; // quantite en gramme par defaut

	// Constructeur
	public Ingredient(String nom, float q) {
		this.nom = nom;
		quantiteg = q;
	}

	// clone de l'ingredient
	public Ingredient clone() {
		return new Ingredient(nom, quantiteg);
	}

	// Affiche l'ingredient avec son poids
	public String toString() {
		return quantiteg + "g : " + nom;
	}

}
