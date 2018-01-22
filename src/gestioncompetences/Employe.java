/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mutatep
 */
public class Employe {
    
    private String identifiant;
    private String prenom;
    private String nom;
    private Date dateEntree;
    private Map<String, Employe> mapEmployes = new HashMap<String, Employe>();
    
    /**
     *
     * @param id : Identifiant de l'employé
     * @param prenom : Prénom de l'employé
     * @param nom : Nom d'un employé
     * @param dateE : Date d'entrée d'un employé
     */
    public Employe(String id, String prenom, String nom, Date dateE){
        this.identifiant = id;
        this.prenom = prenom;
        this.nom = nom;
        this.dateEntree = dateE;
        
        this.mapEmployes.put(this.identifiant, this);
    }
    
    /**
     *
     * @param e : Un employé à ajouter
     * @throws IllegalArgumentException
     */
    public void ajouterEmploye(Employe e) throws IllegalArgumentException{
        if (e != null)
            throw new IllegalArgumentException("Le paramètre en entré est null");
       
        this.mapEmployes.remove(e.getIdentifiant());
    }
    
    /**
     *
     * @return l'indentifiant d'un employé
     */
    public String getIdentifiant(){
        return this.identifiant;
    }
    
    
}
