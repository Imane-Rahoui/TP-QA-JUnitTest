package main;

public class Calculatrice {

    public Calculatrice() {
    }

    public int addition(int a, int b) {
        // il y a mieux
        if(Integer.MAX_VALUE-a<=b)
            throw new RuntimeException("C EST TROP");
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int sommeN(int a){
        int s=0;
        for(int i=0;i<=a;i++)
            s+=i;
        return s;
    }

    public int factN(int a){
        int p=1;
        for(int i=1;i<=a;i++)
            p*=i;
        return p;
    }

}
