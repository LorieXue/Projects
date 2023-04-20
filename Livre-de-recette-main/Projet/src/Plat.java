import java.util.ArrayList;

public class Plat implements Cloneable {
	public final String nom; // Nom du plat
	public ArrayList<Ingredient> composants; // Ingredient du plat
	public final String description; // les etape de la recette

	// Constructeur
	public Plat(String nom, String description) {
		this.nom = nom;
		this.description = description;
		composants = new ArrayList<Ingredient>();
	}

	// Constructeur avec une liste d' ingrédients prédéfini
	public Plat(String nom, String description, ArrayList<Ingredient> compo) {
		this(nom, description);
		for (Ingredient i : compo) {
			composants.add(i.clone());
		}
	}

	// Clone du plat
	@Override
	public Plat clone() {
		return new Plat(nom, description, composants);
	}

	// Affichage complet de la recette du plat
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
