import java.util.InputMismatchException;
import java.util.Scanner;

public class Outils {

	// Methode static qui permet � l'utilisateur de choisir une valeur
	public static int choisir(int min, int max) throws ExceptionChoix {
		Scanner scanner = new Scanner(System.in);
		int i;
		try {
			// choix d'un entier uniquement
			i = scanner.nextInt();
		}
		// si ce n'est pas un entier envoie un exception personnalis�
		catch (InputMismatchException e) {
			throw new ExceptionChoix("\n\tChoix non existant, la page s'est raffraichit\n");
		}
		// si l'entier n'est pas compris entre min et max (inclus) envoie un exception
		// personnalis�
		if (i > max || i < min) {
			throw new ExceptionChoix("\n\tChoix non existant, la page s'est raffraichit\n");
		} else {
			// sinon renvoie l'entier choisi
			return i;
		}
	}

	// Methode static pour vider l'�cran du terminal
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
