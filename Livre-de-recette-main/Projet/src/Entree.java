import java.util.ArrayList;

public class Entree implements Cloneable{
	public final String nom; //nom de l'entree
	public ArrayList<Ingredient> composants; // liste d'ingredients de la recette
	public final String description; // etape a suivre de la recette
	
	//Constructeur
	public Entree(String nom, String description) {
		this.nom = nom;
		this.description = description;
		composants = new ArrayList<Ingredient>();
	}
	
	//constructeur avec liste dingredient predefini
	public Entree(String nom, String description, ArrayList<Ingredient> compo) {
		this(nom, description);
		for (Ingredient i : compo) {
			composants.add(i.clone());
		}
	}
	
	// clone de entree
	@Override
	public Entree clone() {
		return new Entree(nom, description, composants);
	}
	
	//Affichage complet de la recette
	public String toString() {
		String s = "\t" + nom + "\n\nIngredients : \n";

		for (Ingredient i : composants) {
			s += i.toString() + "\n";
		}
		s += "\n" + description + "\n";
		return s;
	}
	
	// Ajout d'un ingrédient
	public void add(Ingredient i) {
		composants.add(i.clone());
	}

}
