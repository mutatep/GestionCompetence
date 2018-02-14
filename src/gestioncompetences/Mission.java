package gestioncompetences;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fatimaAttmane
 */
public class Mission {

    /**
     * L'identifiant de la mission
     */
    public String identifiant;

    /**
     * L'intitulé de la mission
     */
    public String intitule;

    /**
     * La date de debut de la mission
     */
    public Date dateDebut;

    /**
     * La date de fin de la mission
     */
    public Date dateFin;

    /**
     *
     */
    public static Map<String, Mission> mapMissions = new HashMap<String, Mission>();

    /**
     * Constructeur avec paramétres de Mission
     * @param id L'identifiant de la mission
     * @param nom L'intitulé de la mission
     * @param dateDeb La date de debut de la mission
     * @param dateFin La date de fin de la mission
     */
    public Mission(String id,String nom,Date dateDeb,Date dateFin){
        this.identifiant=id;
        this.intitule=nom;
        this.dateDebut=dateDeb;
        this.dateFin=dateFin;
        Mission.mapMissions.put(this.identifiant, this);
        System.out.println("La mission " + this.intitule + "est crée");
    }
    /**
     *
     * @return Identifiant de la mission
     */
    public String getIdentifiant(){
        return this.identifiant;
    }
    
    public String getIntitule(){
        return this.intitule;
    }
    public Date getDateDeb(){
        return this.dateDebut;
    }
    public Date getDateFin(){
        return this.dateFin;
    }
    
}
