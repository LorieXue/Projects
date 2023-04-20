import java.util.ArrayList;

public class Yaourt extends Dessert {
	public ArrayList<Ingredient> composants;
	public final String description;

	public Yaourt(String nom, String description) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
	}

	public Yaourt(String nom, String description, ArrayList<Ingredient> compo) {
		super(nom);
		this.description = description;
		composants = new ArrayList<Ingredient>();
		for (Ingredient i : compo) {
			composants.add(i.clone());
		}
	}

	public Yaourt clone() {
		return new Yaourt(nom, description, composants);
	}

	@Override
	public String toString() {
		String s = "\t" + nom + "\n\nIngredients : \n";

		for (Ingredient i : composants) {
			s += i.toString() + "\n";
		}
		s += "\n" + description + "\n";
		return s;
	}

	public void add(Ingredient i) {
		composants.add(i);
	}

	@Override
	public String getCategorie() {
		return "Yaourt";
	}
}
