package testEntitati;

import entitati.Om;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

//import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.junit.Assert.assertEquals;

@Slf4j
public class TestOm {
    @Test
    public void testNume() {
        Om x = new Om();
        x.setNumeOm("Cata");
        String nume = x.getNumeOm();
        log.info("mesaj1");
        assertEquals("Cata", nume); //metoda pe care o apelam pentru a verifica daca cele doua valori sunt egale
    }

    @Test
    public void testVarsta() {
        Om x = new Om();
        x.setVarsta(20);
        int varsta = x.getVarsta();
        log.info("mesaj2");
        assertEquals(20, varsta);
    }

    @Test
    public void testNumePrenume() {
        Om x = new Om();
        x.setNumeOm("Popescu ");
        x.setPrenumeOm("Vasile");
        String nume = x.getNumeOm();
        nume = nume.concat(x.getPrenumeOm());
        log.info("mesaj3");
        assertEquals("Popescu Vasile", nume);
    }
}
