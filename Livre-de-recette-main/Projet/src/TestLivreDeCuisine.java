
public class TestLivreDeCuisine {

	public static void main(String[] args) {
		Outils.clearScreen();

		// Gateau au chocolat
		Gateau GateauAuChocolat = new Gateau("Gateau au chocolat", "\n    Étape 1\r\n"
				+ "    Préchauffez votre four à 180°C (thermostat 6). Dans une casserole, faites fondre le chocolat et le beurre coupé en morceaux à feu très doux.\r\n"
				+ "    Étape 2\r\n" + "    Dans un saladier, ajoutez le sucre, les oeufs, la farine. Mélangez.\r\n"
				+ "\r\n" + "    Étape 3\r\n" + "    Ajoutez le mélange chocolat/beurre. Mélangez bien.\r\n" + "\r\n"
				+ "    Étape 4\r\n"
				+ "    Beurrez à l'aide d'une feuille de papier essuie-tout et farinez votre moule puis y versez la pâte à gâteau.\r\n"
				+ "\r\n" + "    Étape 5\r\n" + "    Faites cuire au four environ 20 minutes.\r\n" + "\r\n"
				+ "    Étape 6\r\n"
				+ "    A la sortie du four le gâteau ne paraît pas assez cuit. C'est normal, laissez-le refroidir puis démoulez- le."
				+ "\r\n");
		GateauAuChocolat.add(new Ingredient("Chocolat", 200));
		GateauAuChocolat.add(new Ingredient("Farine", 50));
		GateauAuChocolat.add(new Ingredient("Sucre en poudre", 100));
		GateauAuChocolat.add(new Ingredient("Beurre", 100));
		GateauAuChocolat.add(new Ingredient("Oeuf", 3));
		LivreDeCuisine.livre.addDessert(GateauAuChocolat);

		// Yaourt a la vanille
		Yaourt yaourtVanille = new Yaourt("Yaourt a la vanille", "\n    Étape 1\r\n"
				+ "    Porter à ébullition le lait avec la gousse de vanille préalablement découpée dans le sens de la longeur (ouvrir la gousse), faire cuire à feu très doux pendant 5 minutes et laisser tiédir.\r\n"
				+ "\r\n" + "    Étape 2\r\n"
				+ "    Mélanger dans un récipient le yaourt avec le sucre et le lait en poudre.\r\n" + "\r\n"
				+ "    Étape 3\r\n"
				+ "    Verser le lait vanillé après avoir enlevé la gousse dans la préparation en fouettant.\r\n"
				+ "\r\n" + "    Étape 4\r\n"
				+ "    Répartir dans les pots et laisser cuire 8 à 10 heures ou une nuit.\r\n" + "\r\n"
				+ "    Étape 5\r\n" + "    Mettre les couvercles et au frigo pendant minimum 2 heures.\r\n" + "\r\n"
				+ "    Étape 6\r\n" + "    Servir avec des spéculos émiettés c'est délicieux !!!!" + "\r\n");
		yaourtVanille.add(new Ingredient("Lait", 2000));
		yaourtVanille.add(new Ingredient("Gousse de vanille", 5));
		yaourtVanille.add(new Ingredient("Sucre en poudre", 15 * 2));
		yaourtVanille.add(new Ingredient("Lait en poudre", 15 * 3));
		yaourtVanille.add(new Ingredient("Yaourt nature bifidus", 125));
		LivreDeCuisine.livre.addDessert(yaourtVanille);

		// Cookies aux pépites de chocolat super moelleux
		Biscuit cookies = new Biscuit("Cookies aux pépites de chocolat super moelleux", "\n    Étape 1\r\n"
				+ "    Travaillez le beurre mou avec les deux sucres jusqu'à obtention d'un mélange homogène.\r\n"
				+ "\r\n" + "    Étape 2\r\n" + "    Ajoutez les œufs et mélangez bien.\r\n" + "\r\n" + "    Étape 3\r\n"
				+ "    Joignez la farine tamisée, le sel et la levure en poudre.\r\n" + "\r\n" + "    Étape 4\r\n"
				+ "    Mélangez à nouveau.\r\n" + "\r\n" + "    Étape 5\r\n"
				+ "    Rajoutez les pépites de chocolat et mélangez.\r\n" + "\r\n" + "    Étape 6\r\n"
				+ "    Recouvrez le plateau du four de papier cuisson ou sulfurisé, et à l'aide de 2 cuillères à café, disposez-y des petits tas de pâte de la valeur d'une noix."
				+ "\r\n" + "    Étape 7\r\n" + "    Veillez à bien les espacer car la pâte s'étale assez fort.\r\n"
				+ "\r\n" + "    Étape 8\r\n"
				+ "    Enfournez et comptez une dizaine de minutes de cuisson (four préchauffé à 180°C).\r\n" + "\r\n"
				+ "    Étape 9\r\n" + "    Laissez les cookies cuits sur une grille pour les laisser refroidir.\r\n"
				+ "\r\n");
		cookies.add(new Ingredient("Chocolat", 300));
		cookies.add(new Ingredient("Farine", 350));
		cookies.add(new Ingredient("Sucre semoule", 125));
		cookies.add(new Ingredient("Levure en poudre", 5));
		cookies.add(new Ingredient("Sel", (float) 0.4));
		cookies.add(new Ingredient("Beurre", 250));
		cookies.add(new Ingredient("Oeuf", 2));
		cookies.add(new Ingredient("Sucre brun", 125));
		LivreDeCuisine.livre.addDessert(cookies);

		// La salade piémontaise de Jean-Pierre
		Entree salade = new Entree("La salade piémontaise de Jean-Pierre", "\n    Étape 1\r\n"
				+ "    Faire cuire les pommes de terre à l'eau et les éplucher. \r\n" + "\r\n" + "    Étape 2\r\n"
				+ "    AFaire cuire dans le même temps les oeufs pour qu'ils deviennent durs soit 10 min. Les mettre dans l'eau froide pour qu'ils s'écalent plus facilement.\r\n"
				+ "\r\n" + "    Étape 3\r\n"
				+ "    Couper les tomates, le jambon et les pommes de terre en dés. Les mettre dans un saladier et ajouter les oeufs durs ainsi que les cornichons coupés en rondelles.\r\n"
				+ "\r\n" + "    Étape 4\r\n" + "    Pour la sauce :\r\n" + "\r\n" + "    Étape 5\r\n"
				+ "    Faire une vinaigrette bien relevée et délayer avec au moins 2 grosses cuillères à soupe de mayonnaise. Arroser votre salade de cette sauce. \r\n"
				+ "\r\n" + "    Étape 6\r\n"
				+ "    Mélanger et laisser au réfrigérateur pour que les pommes de terre s'imprègnent de sauce."
				+ "\r\n");
		salade.add(new Ingredient("Huile", 0));
		salade.add(new Ingredient("Vinaigre", 0));
		salade.add(new Ingredient("Poivre", 0));
		salade.add(new Ingredient("Sel", 0));
		salade.add(new Ingredient("Moutarde", 0));
		salade.add(new Ingredient("Mayonnaise", 0));
		LivreDeCuisine.livre.addEntree(salade);

		// Pâtes à la carbonara à la française
		Plat pates = new Plat("Pâtes à la \"carbonara\" à la française\r\n" + "", "\n    Étape 1\r\n"
				+ "    Cuire les pâtes dans un grand volume d'eau bouillante salée. \r\n" + "\r\n" + "    Étape 2\r\n"
				+ "    Emincer les oignons et les faire revenir à la poêle. Dès qu'ils ont bien dorés, y ajouter les lardons.\r\n"
				+ "\r\n" + "    Étape 3\r\n"
				+ "    Préparer dans un saladier la crème fraîche, les oeufs, le sel, le poivre et mélanger.\r\n"
				+ "\r\n" + "    Étape 4\r\n"
				+ "    Retirer les lardons du feu dès qu'ils sont dorés et les ajouter à la crème.\r\n" + "\r\n"
				+ "    Étape 5\r\n"
				+ "    Une fois les pâtes cuite al dente, les égoutter et y incorporer la crème. Remettre sur le feu si le plat a refroidi.\r\n"
				+ "\r\n" + "    Étape 6\r\n"
				+ "    Servir et bon appétit ! Vous pouvez également agrémenter votre plat avec des champignons."
				+ "\r\n");
		pates.add(new Ingredient("Pates", 500));
		pates.add(new Ingredient("Sel", (float) 0.4));
		pates.add(new Ingredient("Creme fraiche", 500));
		pates.add(new Ingredient("Poivre", 0));
		pates.add(new Ingredient("Jaune d'oeuf", 3));
		pates.add(new Ingredient("lardon", 250));
		pates.add(new Ingredient("Oignon", 1));
		LivreDeCuisine.livre.addPlat(pates);

		LivreDeCuisine.livre.accueil();

	}

}
