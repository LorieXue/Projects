
public class TestLivreDeCuisine {

	public static void main(String[] args) {
		Outils.clearScreen();

		// Gateau au chocolat
		Gateau GateauAuChocolat = new Gateau("Gateau au chocolat", "\n    �tape 1\r\n"
				+ "    Pr�chauffez votre four � 180�C (thermostat 6). Dans une casserole, faites fondre le chocolat et le beurre coup� en morceaux � feu tr�s doux.\r\n"
				+ "    �tape 2\r\n" + "    Dans un saladier, ajoutez le sucre, les oeufs, la farine. M�langez.\r\n"
				+ "\r\n" + "    �tape 3\r\n" + "    Ajoutez le m�lange chocolat/beurre. M�langez bien.\r\n" + "\r\n"
				+ "    �tape 4\r\n"
				+ "    Beurrez � l'aide d'une feuille de papier essuie-tout et farinez votre moule puis y versez la p�te � g�teau.\r\n"
				+ "\r\n" + "    �tape 5\r\n" + "    Faites cuire au four environ 20 minutes.\r\n" + "\r\n"
				+ "    �tape 6\r\n"
				+ "    A la sortie du four le g�teau ne para�t pas assez cuit. C'est normal, laissez-le refroidir puis d�moulez- le."
				+ "\r\n");
		GateauAuChocolat.add(new Ingredient("Chocolat", 200));
		GateauAuChocolat.add(new Ingredient("Farine", 50));
		GateauAuChocolat.add(new Ingredient("Sucre en poudre", 100));
		GateauAuChocolat.add(new Ingredient("Beurre", 100));
		GateauAuChocolat.add(new Ingredient("Oeuf", 3));
		LivreDeCuisine.livre.addDessert(GateauAuChocolat);

		// Yaourt a la vanille
		Yaourt yaourtVanille = new Yaourt("Yaourt a la vanille", "\n    �tape 1\r\n"
				+ "    Porter � �bullition le lait avec la gousse de vanille pr�alablement d�coup�e dans le sens de la longeur (ouvrir la gousse), faire cuire � feu tr�s doux pendant 5 minutes et laisser ti�dir.\r\n"
				+ "\r\n" + "    �tape 2\r\n"
				+ "    M�langer dans un r�cipient le yaourt avec le sucre et le lait en poudre.\r\n" + "\r\n"
				+ "    �tape 3\r\n"
				+ "    Verser le lait vanill� apr�s avoir enlev� la gousse dans la pr�paration en fouettant.\r\n"
				+ "\r\n" + "    �tape 4\r\n"
				+ "    R�partir dans les pots et laisser cuire 8 � 10 heures ou une nuit.\r\n" + "\r\n"
				+ "    �tape 5\r\n" + "    Mettre les couvercles et au frigo pendant minimum 2 heures.\r\n" + "\r\n"
				+ "    �tape 6\r\n" + "    Servir avec des sp�culos �miett�s c'est d�licieux !!!!" + "\r\n");
		yaourtVanille.add(new Ingredient("Lait", 2000));
		yaourtVanille.add(new Ingredient("Gousse de vanille", 5));
		yaourtVanille.add(new Ingredient("Sucre en poudre", 15 * 2));
		yaourtVanille.add(new Ingredient("Lait en poudre", 15 * 3));
		yaourtVanille.add(new Ingredient("Yaourt nature bifidus", 125));
		LivreDeCuisine.livre.addDessert(yaourtVanille);

		// Cookies aux p�pites de chocolat super moelleux
		Biscuit cookies = new Biscuit("Cookies aux p�pites de chocolat super moelleux", "\n    �tape 1\r\n"
				+ "    Travaillez le beurre mou avec les deux sucres jusqu'� obtention d'un m�lange homog�ne.\r\n"
				+ "\r\n" + "    �tape 2\r\n" + "    Ajoutez les �ufs et m�langez bien.\r\n" + "\r\n" + "    �tape 3\r\n"
				+ "    Joignez la farine tamis�e, le sel et la levure en poudre.\r\n" + "\r\n" + "    �tape 4\r\n"
				+ "    M�langez � nouveau.\r\n" + "\r\n" + "    �tape 5\r\n"
				+ "    Rajoutez les p�pites de chocolat et m�langez.\r\n" + "\r\n" + "    �tape 6\r\n"
				+ "    Recouvrez le plateau du four de papier cuisson ou sulfuris�, et � l'aide de 2 cuill�res � caf�, disposez-y des petits tas de p�te de la valeur d'une noix."
				+ "\r\n" + "    �tape 7\r\n" + "    Veillez � bien les espacer car la p�te s'�tale assez fort.\r\n"
				+ "\r\n" + "    �tape 8\r\n"
				+ "    Enfournez et comptez une dizaine de minutes de cuisson (four pr�chauff� � 180�C).\r\n" + "\r\n"
				+ "    �tape 9\r\n" + "    Laissez les cookies cuits sur une grille pour les laisser refroidir.\r\n"
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

		// La salade pi�montaise de Jean-Pierre
		Entree salade = new Entree("La salade pi�montaise de Jean-Pierre", "\n    �tape 1\r\n"
				+ "    Faire cuire les pommes de terre � l'eau et les �plucher. \r\n" + "\r\n" + "    �tape 2\r\n"
				+ "    AFaire cuire dans le m�me temps les oeufs pour qu'ils deviennent durs soit 10 min. Les mettre dans l'eau froide pour qu'ils s'�calent plus facilement.\r\n"
				+ "\r\n" + "    �tape 3\r\n"
				+ "    Couper les tomates, le jambon et les pommes de terre en d�s. Les mettre dans un saladier et ajouter les oeufs durs ainsi que les cornichons coup�s en rondelles.\r\n"
				+ "\r\n" + "    �tape 4\r\n" + "    Pour la sauce :\r\n" + "\r\n" + "    �tape 5\r\n"
				+ "    Faire une vinaigrette bien relev�e et d�layer avec au moins 2 grosses cuill�res � soupe de mayonnaise. Arroser votre salade de cette sauce. \r\n"
				+ "\r\n" + "    �tape 6\r\n"
				+ "    M�langer et laisser au r�frig�rateur pour que les pommes de terre s'impr�gnent de sauce."
				+ "\r\n");
		salade.add(new Ingredient("Huile", 0));
		salade.add(new Ingredient("Vinaigre", 0));
		salade.add(new Ingredient("Poivre", 0));
		salade.add(new Ingredient("Sel", 0));
		salade.add(new Ingredient("Moutarde", 0));
		salade.add(new Ingredient("Mayonnaise", 0));
		LivreDeCuisine.livre.addEntree(salade);

		// P�tes � la carbonara � la fran�aise
		Plat pates = new Plat("P�tes � la \"carbonara\" � la fran�aise\r\n" + "", "\n    �tape 1\r\n"
				+ "    Cuire les p�tes dans un grand volume d'eau bouillante sal�e. \r\n" + "\r\n" + "    �tape 2\r\n"
				+ "    Emincer les oignons et les faire revenir � la po�le. D�s qu'ils ont bien dor�s, y ajouter les lardons.\r\n"
				+ "\r\n" + "    �tape 3\r\n"
				+ "    Pr�parer dans un saladier la cr�me fra�che, les oeufs, le sel, le poivre et m�langer.\r\n"
				+ "\r\n" + "    �tape 4\r\n"
				+ "    Retirer les lardons du feu d�s qu'ils sont dor�s et les ajouter � la cr�me.\r\n" + "\r\n"
				+ "    �tape 5\r\n"
				+ "    Une fois les p�tes cuite al dente, les �goutter et y incorporer la cr�me. Remettre sur le feu si le plat a refroidi.\r\n"
				+ "\r\n" + "    �tape 6\r\n"
				+ "    Servir et bon app�tit ! Vous pouvez �galement agr�menter votre plat avec des champignons."
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
