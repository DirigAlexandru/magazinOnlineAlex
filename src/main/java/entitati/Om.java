package entitati;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Om {

    private int varsta;
    private String numeOm;
    private String prenumeOm;

    public Om(int v, String n, String p){
        this.numeOm = n;
        this.prenumeOm =p;
        this.varsta=v;
    }
    public Om(int v){
        this.varsta = v;
    }

    public void afisareVarsta(Om omulet) {
        System.out.println(omulet.getNumeOm() + " are varsta de: " + omulet.getVarsta() + " ani.");
    }

}
