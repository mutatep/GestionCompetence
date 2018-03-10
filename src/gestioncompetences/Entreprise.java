/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Instance d'une entreprise
 * @author mutatep
 */
public class Entreprise{
    
    private String libelle;
    private static Map<Integer, Employe> mapEmployes;
    private static Map<Integer, Mission> mapMissions;
    private static Map<Mission, Set<Employe>> mapMissionEmployes;
    
    /**
     * Constructeur de la classe Entreprise
     * @param libelle : le nom de l'entreprise
     */
    public Entreprise(String libelle){
        this.libelle = libelle;
        this.mapEmployes = new HashMap<Integer, Employe>();
        this.mapMissions = Mission.getMapMissions();
        this.mapMissionEmployes = new HashMap<>();
    }
    
    /**
     * Permet de charger les données des fichiers csv qui sont fournis
     */
    public void recupererDonnees(){
        FichierCsv csv = new FichierCsv();
        csv.chargerDonnees("fichiers/liste_personnel.csv");
        csv.chargerDonnees("fichiers/liste_competences.csv");
        csv.chargerDonnees("fichiers/competences_personnel.csv");
    }
    
    /**
     *
     * @param e : L'employé à supprimer
     * @throws IllegalArgumentException si le paramètre en entrée e est null
     */
    public void supprimerEmploye(Employe e)throws IllegalArgumentException{
        if (e == null)
            throw new IllegalArgumentException("La valeur de l'employé à supprimer est null");
        Entreprise.mapEmployes.remove(e.getIdentifiant());
    }
    
    /**
     * Permet de supprimer une mission
     * @param m : Mission à supprimer
     * @throws IllegalArgumentException
     */
    public void supprimerMission(Mission m)throws IllegalArgumentException{
        if (m == null)
            throw new IllegalArgumentException("La valeur de l'employé à supprimer est null");
        Mission.setMapMissions(m.getIdentifiant());
    }
    
    
    public static Map<Integer, Employe> getMapEmployes(){
        return Entreprise.mapEmployes;
    }
    
    public static void setMapEmployes(int identifiant, Employe e) throws IllegalArgumentException{
        if(identifiant==0)
            throw new IllegalArgumentException("L'idenfiant est égal à 0");
        if (e == null)
            throw new IllegalArgumentException("La valeur de l'employé à insérer est null");
        Entreprise.mapEmployes.put(identifiant, e);
    }
    
}
