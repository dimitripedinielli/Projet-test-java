import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Entrer le nombre de héros");
        Scanner A = new Scanner(System.in);
        int nbHero = A.nextInt();
        System.out.println("Vous avez choisit "+nbHero+" héros");

        for(int i=0; i<nbHero;i++) {
        System.out.println("Choisir la classe de votre héros numéro "+(i+1));
        Scanner ScClassHero = new Scanner(System.in);
        String ClassHero = ScClassHero.nextLine();

        }


    }
}
