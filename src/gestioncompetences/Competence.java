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
     * Constructeur sans paramétres de Compétence
     */
    public Competence(){
        try {
            String csvFile = "fichiers/liste_competences.csv";
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] description = line.split(";");
                Competence competence = new Competence(description[0], description[2], description[1]);
            }
            br.close();
        }catch (IOException ex) {
            Logger.getLogger(Competence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Méthode qui permet d'ajouter une Compétence
     * @param c La compétence à ajouter
     * @throws IllegalArgumentException
     */
    public void ajouterCompetence(Competence c) throws IllegalArgumentException{
        if (c != null)
            throw new IllegalArgumentException("La valeur de la competence à ajouter est null");
        Competence.mapCompetences.put(c.getIdentifiant(), c);
    }
    
    /**
     * Méthode qui permet de supprimer une Compétence
     * @param c La compétence à supprimer
     * @throws IllegalArgumentException
     */
    public void supprimerCompetence(Competence c)throws IllegalArgumentException{
        if (c != null)
            throw new IllegalArgumentException("La valeur de la competence à supprimer est null");
        Competence.mapCompetences.remove(c.getIdentifiant());
    }

    private String getIdentifiant() {
        return this.identifiant;
    }

    /**
     * Méthode qui permet d'afficher l'ensemble de toutes les compétences
     */
    public static void afficherMapCompetences(){
        for(String s : Competence.mapCompetences.keySet()){
            System.out.print (s +  " : ");
            System.out.println(Competence.mapCompetences.get(s).identifiant + " -- " 
                    + Competence.mapCompetences.get(s).libelleEn + " -- " 
                    + Competence.mapCompetences.get(s).libelleFr);
             
        }
    }
    
}
