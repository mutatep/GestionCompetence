package gestioncompetences;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatimaAttmane
 */
public class Competence {

    /**
     * L'identifiant de la compétence
     */
    public String identifiant;

    /**
     * Le libellé en Français de la compétence
     */
    public String libelleFr;

    /**
     * Le libellé en Anglais de la compétence
     */
    public String libelleEn;

    /**
     * Une map qui stock toutes les compétences 
     */
    protected static Map<String, Competence> mapCompetences = new HashMap<String, Competence>();
    
     /**
     * Constructeur avec paramétres de Compétence
     * @param id L'identifiant de la compétence
     * @param libFr Le libellé en Français de la compétence
     * @param libEn Le libellé en Anglais de la compétence
     */
    public Competence(String id,String libFr,String libEn){
        this.identifiant=id;
        this.libelleFr=libFr;
        this.libelleEn=libEn;
        Competence.mapCompetences.put(this.identifiant, this);
    }

    /**
     *
     * @return L'identifaint de la compétence
     */
    public String getIdentifiant() {
        return this.identifiant;
    }
    
    /**
     *
     * @return Le libellé de la compétence en Français
     */
    public String getLibelleFr() {
        return this.libelleFr;
    }
}
