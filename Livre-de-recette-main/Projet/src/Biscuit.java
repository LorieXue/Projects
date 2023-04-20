import java.util.ArrayList;

public class Biscuit extends Dessert {
	public ArrayList<Ingredient> composants; // liste d'ingredient
	public final String description; // etape a suivre de la recette

	// Constructeur
	public Biscuit(String nom, String description) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
	}

	// Constructeur avec une liste d'ingredient predefini
	public Biscuit(String nom, String description, ArrayList<Ingredient> compo) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
		for (Ingredient i : compo) {
			composants.add(i.clone());
		}
	}

	// Clone du Biscuit
	public Biscuit clone() {
		return new Biscuit(nom, description, composants);
	}

	// Affichage complet de la recette
	@Override
	public String toString() {
		String s = "\t" + nom + "\n\nIngredients : \n";

		for (Ingredient i : composants) {
			s += i.toString() + "\n";
		}
		s += "\n" + description + "\n";
		return s;
	}

	// Ajout d'un ingredient
	public void add(Ingredient i) {
		composants.add(i);
	}

	// Envoie le nom de la sous-catégorie ("Biscuit")
	@Override
	public String getCategorie() {
		return "Biscuit";
	}

}
