/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import gestioncompetences.Competence;
import gestioncompetences.Employe;
import gestioncompetences.FichierCsv;
import gestioncompetences.Mission;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Instance d'une entreprise
 * @author mutatep
 */
public class Entreprise {
    
    private String libelle;
    private Map<String, Employe> mapEmployes;
    private Map<String, Mission> mapMissions;
    private Map<Mission, Set<Employe>> mapMissionEmployes;
    
    /**
     * Constructeur de la classe Entreprise
     * @param libelle : le nom de l'entreprise
     */
    public Entreprise(String libelle){
        this.libelle = libelle;
        this.mapEmployes = Employe.mapEmployes;
        this.mapMissions = Mission.mapMissions;
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
    public void supprimerEmployer(Employe e)throws IllegalArgumentException{
        if (e == null)
            throw new IllegalArgumentException("La valeur de l'employé à supprimer est null");
        Employe.mapEmployes.remove(e.getIdentifiant());
    }
    
    /**
     * Permet de supprimer une mission
     * @param m : Mission à supprimer
     * @throws IllegalArgumentException
     */
    public void supprimerMission(Mission m)throws IllegalArgumentException{
        if (m == null)
            throw new IllegalArgumentException("La valeur de l'employé à supprimer est null");
        Mission.mapMissions.remove(m.getIdentifiant());
    }
    
    /**
     * Affiahce de tous les employés avec leurs compétences
     */
    public void afficherEmployeCompetences(){
        for(String s : Employe.mapEmployes.keySet()){
            System.out.println(s + " : " );
            for(Competence c : Employe.mapEmployes.get(s).getCompetences())
                    System.out.println(c.getIdentifiant() + " : " + c.getLibelleFr());
            System.out.println ("---------------------------------------------------------");
        }
               
    }
    
    public Map<String, Employe> getMapEmploye(){
        return this.mapEmployes;
    }
    
}
