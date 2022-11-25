package main;

public class CalculatriceApp {

    // Méthode classique : test personnalisé avec main // c pas reproductible
    public static void main(String[] args) {
        Calculatrice cal = new Calculatrice();
        int a = Integer.MAX_VALUE;
        int b = 1;
        int attendu = Integer.MAX_VALUE+1;
        int calcule=cal.addition(a,b);
        if(attendu==calcule)
            System.out.println("réussi");
        else
            System.out.println("échoué");
        System.out.println("Resultat : "+calcule);
    }


    // junit test case
}


