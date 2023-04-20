import java.util.ArrayList;

//Singleton
public class LivreDeCuisine {

	public static final LivreDeCuisine livre = new LivreDeCuisine("Marmiton"); // 1 instance
	public ArrayList<Dessert> desserts; // liste des desserts dans le livre
	public ArrayList<Plat> plats; // liste des plats dans le livre
	public ArrayList<Entree> entrees; // liste des entrees dans le livre
	public final String nom; // nom unique du livre

	// Constructeur privé
	private LivreDeCuisine(String nom) {
		this.nom = nom;
		desserts = new ArrayList<Dessert>();
		entrees = new ArrayList<Entree>();
		plats = new ArrayList<Plat>();
	}

	// Ajout d'un dessert dans la liste des desserts
	public void addDessert(Dessert d) {
		desserts.add(d.clone());
	}

	// Ajout d'une entree dans la liste des desserts
	public void addEntree(Entree b) {
		entrees.add(b.clone());
	}

	// Ajout d'un plat dans la liste des desserts
	public void addPlat(Plat g) {
		plats.add(g.clone());
	}

	// rejet d'un dessert dans la liste des desserts
	public void removeDessert(Dessert d) {
		desserts.add(d);
	}

	// rejet d'un plat dans la liste des plats
	public void removePlat(Plat b) {
		plats.remove(b);
	}

	// Ajout d'une entree dans la liste des entrees
	public void removeEntree(Entree g) {
		entrees.remove(g);
	}

	// Affichage de l'accueil et des fonctionnalités (scanner)
	public void accueil() {

		// affiche les 3 catégories du livre
		System.out.println("\t" + nom + "\n");
		System.out.println("\n1. Entree\t2.Plat\t3.Dessert\n");
		System.out.println("0. Quitter");

		// choisir entre 0 et 3 (inclus)
		int choix;
		try {
			choix = Outils.choisir(0, 3);
		}
		// si on entre une fausse valeur, reste à l'accueil (relance la fonction a
		// nouveau)
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			accueil();
			return;
		}
		Outils.clearScreen();

		// Choix correspondant à l'entree, on entre dans la fonction de l'entree
		if (choix == 1) {
			categorieChoixEntree();
		}

		// Choix correspondant au plat, on entre dans la fonction du plat
		if (choix == 2) {
			categorieChoixPlat();
		}

		// Choix correspondant au dessert, on entre dans la fonction du dessert
		if (choix == 3) {
			categorieChoixDessert();
		}
		Outils.clearScreen();

	}

	// Affiche les desserts lorsqu'on a choisit la valeur 3 pour le Dessert dans
	// l'accueil
	public void categorieChoixDessert() {

		// Affichage des noms de tout les desserts présent dans le livre de Cuisine
		System.out.println("\t" + nom + "\n\n\tDesserts\n");
		for (int d = 0; d < desserts.size(); d++) {
			System.out.println((d + 1) + ". " + desserts.get(d).nom + " (" + desserts.get(d).getCategorie() + ")");
		}
		System.out.println("\n" + (desserts.size() + 1) + ". Quitter\t" + (desserts.size() + 2) + ". Precedent");

		// Choix d'un entier qui est suivie du nom de la recette
		int choix;
		try {
			choix = Outils.choisir(1, desserts.size() + 2);
		}
		// si on entre une valeur invalide, alors on reste sur la meme page (relance la
		// fonction à nouveau)
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			categorieChoixDessert();
			return;
		}

		Outils.clearScreen();

		// choisit de quitter, fin du programme
		if (choix == desserts.size() + 1)
			return;

		// choisit précédent, on retourne à l'accueil
		if (choix == desserts.size() + 2) {
			accueil();
			return;
		}

		// sinon on a entré l'entier suivie du nom de la recette
		// fonction qui nous affiche le dessert choisi
		choixDessert(choix);
	}

	// Affiche le dessert que l'on a choisi
	public void choixDessert(int choix) {
		Outils.clearScreen();

		// affichage du dessert choisi
		System.out.println("\t" + nom + "\n\n\tDesserts\n");
		System.out.println(desserts.get(choix - 1).toString());
		System.out.println("\n0. Quitter\t1. Precedent");

		// choix entre 0.quitter ou 1.précédent
		int choix2;
		try {
			choix2 = Outils.choisir(0, 1);
		}

		// si invalide, alors on reste sur la page en relancant a nouveau la fonction
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			choixDessert(choix);
			return;
		}
		Outils.clearScreen();

		// on quitte
		if (choix2 == 0)
			return;

		// on veut la page précédente (choix des différents desserts)
		if (choix2 == 1)
			categorieChoixDessert();
	}

	// Affiche la page de tous les plats après avoir validé la valeur 2 a l'accueil
	public void categorieChoixPlat() {

		// affichage de tous les noms des plats
		System.out.println("\t" + nom + "\n\n\tPlats\n");
		for (int d = 0; d < plats.size(); d++) {
			System.out.println((d + 1) + ". " + plats.get(d).nom);
		}
		System.out.println((plats.size() + 1) + ". Quitter\t" + (plats.size() + 2) + ". Precedent");

		// on choisit un entier qui est associé au nom d'une recette ou quitter ou
		// précédent
		int choix;
		try {
			choix = Outils.choisir(1, plats.size() + 2);
		}
		// si invalide alors on charge à nouveau la page
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			categorieChoixPlat();
			return;
		}
		Outils.clearScreen();

		// on quitte
		if (choix == plats.size() + 1)
			return;

		// on retourne à la page précédente
		if (choix == plats.size() + 2) {
			accueil();
			return;
		}

		// choix d'une recette de plat, on les affiche dans une nouvelle fonction
		ChoixPlat(choix);

	}

	// Affichage du plat choisi
	public void ChoixPlat(int choix) {

		// affichage de la recette choisie
		System.out.println("\t" + nom + "\n\n\tPlats\n");
		System.out.println(plats.get(choix - 1).toString());
		System.out.println("\n\n0. Quitter\t1. Precedent");

		// choix entre 0.quitter ou 1.précédent
		int choix2;
		try {
			choix2 = Outils.choisir(0, 1);
		}

		// si invalide, alors on reste sur la page en relancant a nouveau la fonction
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			ChoixPlat(choix);
			return;
		}
		Outils.clearScreen();

		// on quitte
		if (choix2 == 0)
			return;

		// on veut la page précédente (choix des différents plats)
		if (choix2 == 1)
			categorieChoixPlat();
	}

	// Affiche les entrées lorsqu'on a choisit la valeur 1 pour l'entree dans
	// l'accueil
	public void categorieChoixEntree() {

		// Affichage de tous les noms des entrés suivis d'un entier
		System.out.println("\t" + nom + "\n\n\tEntrees\n");
		for (int d = 0; d < entrees.size(); d++) {
			System.out.println((d + 1) + ". " + entrees.get(d).nom);
		}
		System.out.println("\n" + (entrees.size() + 1) + ". Quitter\t" + (entrees.size() + 2) + ". Precedent");

		// on choisit un entier qui est associé au nom d'une recette ou quitter ou
		// précédent
		int choix;
		try {
			choix = Outils.choisir(1, entrees.size() + 2);
		}
		// si invalide alors on charge à nouveau la page
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			categorieChoixEntree();
			return;
		}
		Outils.clearScreen();

		// si quitter
		if (choix == entrees.size() + 1)
			return;

		// si precedent, on retourne à l'accueil
		if (choix == entrees.size() + 2) {
			accueil();
			return;
		}

		// choix d'une recette de entree, on les affiche dans une nouvelle fonction
		choixEntree(choix);
	}

	// Affichage de l'entree choisi
	public void choixEntree(int choix) {
		// affiche la recette de l'entree choisi
		System.out.println("\t" + nom + "\n\n\tEntrees\n");
		System.out.println(entrees.get(choix - 1).toString());
		System.out.println("\n\n0. Quitter\t1. Precedent");

		int choix2;
		try {
			choix2 = Outils.choisir(0, 1);
		}
		// si invalide alors on charge à nouveau la page
		catch (ExceptionChoix e) {
			Outils.clearScreen();
			System.out.println(e.getMessage());
			choixEntree(choix);
			return;
		}

		Outils.clearScreen();
		// on quitte
		if (choix2 == 0)
			return;

		// on veut la page précédente (choix des différents entrees)
		if (choix2 == 1)
			categorieChoixEntree();
	}

}
