
public abstract class Dessert implements Cloneable{

	// Nom pour ces héritiers
	protected String nom;

	// Cosntructeur
	public Dessert(String nom) {
		this.nom = nom;
	}

	// Affichage complet de la recette
	public abstract String toString();

	// clone
	public abstract Dessert clone();

	// avoir le nom de sa sous categorie
	public abstract String getCategorie();

}
