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
    private int identifiant;
    private static int cpt;

    /**
     * L'intitulé de la mission
     */
    private String intitule;

    /**
     * La date de debut de la mission
     */
    private Date dateDebut;

    /**
     * La date de fin de la mission
     */
    private Date dateFin;
    
    private Besoin besoin;
    
    /**
     *
     */
    private static Map<Integer, Mission> mapMissions = new HashMap<Integer, Mission>();
    
    private Stade_Mission stadeMission;

    /**
     * Constructeur avec paramètres de Mission
     * @param nom L'intitulé de la mission
     * @param dateDeb La date de debut de la mission
     * @param dateFin La date de fin de la mission
     */
    public Mission(String nom,Date dateDeb,Date dateFin) throws IllegalArgumentException{
        if(dateDeb.compareTo(new Date()) < 0)
            throw new IllegalArgumentException("La date de la début de la mission est inférieure à la date du jour");
        if(dateDeb.compareTo(dateFin) < 0)
            throw new IllegalArgumentException("La date de la fin du projet est avant la date de début");
        this.identifiant= ++Mission.cpt;
        this.intitule=nom;
        this.dateDebut=dateDeb;
        this.dateFin=dateFin;
        this.stadeMission = Stade_Mission.MISSION_EN_PREPARATION;
        Mission.mapMissions.put(this.identifiant, this);
    }
    
    public void changementStade(){
        if(this.dateDebut.compareTo(new Date()) <= 0)
            this.stadeMission = Stade_Mission.MISSION_EN_COURS;
        
        //faire les conditions sur les dates, plannification, etc.
    }
    /**
     *
     * @return Identifiant de la mission
     */
    public int getIdentifiant(){
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
    
    public static Map<Integer, Mission> getMapMissions(){
        return Mission.mapMissions;
    }
    
    public static void setMapMissions(int identifiant) {
       Mission.mapMissions.remove(identifiant);
    }
    
    
}
