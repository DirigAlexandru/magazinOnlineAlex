package testEntitati;

import entitati.Om;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOm {
    @Test
    public void testNume(){
        Om x = new Om();
        x.setNumeOm("Cata");
        String nume = x.getNumeOm();
        assertEquals("Cata",nume); //metoda pe care o apelam pentru a verifica daca cele doua valori sunt egale
    }
}
