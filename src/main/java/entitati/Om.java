package entitati;

import lombok.Data;

@Data

public class Om {

    private int varsta;
    private String numeOm;
    private String prenumeOm;

    public void afisareVarsta (Om omulet){
        System.out.println(omulet.getNumeOm() + " are varsta de: " + omulet.getVarsta()+ " ani.");
    }

}
