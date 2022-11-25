package test;

import main.Calculatrice;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @org.junit.jupiter.api.Test // ça s appelle un cas de test
    void addition() {
        Calculatrice cal = new Calculatrice();
        int a=1;
        int b=2;
        assertEquals(3,cal.addition(a,b));
        //fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void sommeN() {
        fail("Not yet implemented");
    }

    @org.junit.jupiter.api.Test
    void factN() {
        fail("Not yet implemented");
    }
}