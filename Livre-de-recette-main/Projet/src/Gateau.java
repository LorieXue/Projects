import java.util.ArrayList;

public class Gateau extends Dessert {
	public final String description; // les etape de la recette de gateau
	public ArrayList<Ingredient> composants; // les ingredients pour le gateau

	// constructeur
	public Gateau(String nom, String description) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
	}

	// constructeur avec une liste d'ingredient predefini
	public Gateau(String nom, String description, ArrayList<Ingredient> compo) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
		for (Ingredient i : compo) {
			composants.add(i.clone());
		}
	}

	// affichage complet de la recette
	@Override
	public String toString() {
		String s = "\t" + nom + "\n\nIngredients : \n";

		for (Ingredient i : composants) {
			s += i.toString() + "\n";
		}
		s += "\n" + description + "\n";
		return s;
	}

	// Clone du gateau
	public Gateau clone() {
		return new Gateau(nom, description, composants);
	}

	// Ajout d'un ingrédient
	public void add(Ingredient i) {
		composants.add(i.clone());
	}

	// Affiche sa sous catégorie
	@Override
	public String getCategorie() {
		return "Gateau";
	}
}
