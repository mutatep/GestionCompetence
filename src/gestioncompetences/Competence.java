package gestioncompetences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fatimaAttmane
 */
public class Competence implements Comparable{

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
    private static Map<String, Competence> mapCompetences = new HashMap<String, Competence>();
    
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
    
    public static ArrayList<Competence> getCompetenceList(){
       
        ArrayList<Competence> l = (ArrayList<Competence>) Competence.mapCompetences.values();
        /*for(String s : Competence.mapCompetences.keySet()){
            l.add(Competence.mapCompetences.get(s));
        }*/
        Collections.sort(l);
        return l;
    }
    
    @Override
    public int compareTo(Object t) {
        Competence c = (Competence) t;
        int result = 0;
            if(this.libelleFr.compareToIgnoreCase(c.libelleFr)!=0){
               result = this.libelleFr.compareToIgnoreCase(c.libelleFr);
            }else if(this.libelleEn.compareToIgnoreCase(c.libelleEn)!=0){
                result = this.libelleEn.compareToIgnoreCase(c.libelleEn);
            }
        return result;
    }
    
    public static Map<String, Competence> getMapCompetences(){
        return Competence.mapCompetences;
    }
}
