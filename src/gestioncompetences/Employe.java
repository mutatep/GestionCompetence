/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Instance d'un employé
 * @author mutatep
 */
public class Employe {
    
    private int identifiant;
    private String prenom;
    private String nom;
    private Date dateEntree;
    private Set<Competence> setCompetences;

    /**
     * Constructeur de la classe Employe
     * @param id : Identifiant de l'employé
     * @param prenom : Prénom de l'employé
     * @param nom : Nom d'un employé
     * @param dateE : Date d'entrée d'un employé
     */
    public Employe(int id, String prenom, String nom, Date dateE){
        this.identifiant = id;
        this.prenom = prenom;
        this.nom = nom;
        this.dateEntree = dateE;
        this.setCompetences = new HashSet<>();
        
        Entreprise.setMapEmployes(this.identifiant, this);
    }

    /**
     * Permet d'ajouter une compétence à l'employé
     * @param c : La compétence à ajouter à l'employé
     * @throws IllegalArgumentException  : si la compétence à ajouter est null
     */
    public void ajouterCompetence(Competence c) throws IllegalArgumentException{
        if(c == null)
            throw new IllegalArgumentException ("La valeur de la compétence à ajouter est null");
        this.setCompetences.add(c);
    }
    
    /**
     * Permet de supprimer la compétence d'un employé
     * @param c : La compétence à supprimer
     * @throws IllegalArgumentException  : si la compétence à supprimer est null
     */
    public void supprimerCompetence(Competence c) throws IllegalArgumentException{
        if(c == null)
            throw new IllegalArgumentException ("La valeur de la compétence à supprimer est null");
        this.setCompetences.remove(c);
    }
    
    /**
     * Permet d'obtenir l'identifiant de l'employé
     * @return l'identifiant d'un employé
     */
    public int getIdentifiant(){
        return this.identifiant;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public Date getDate(){
        return this.dateEntree;
    }
    
    
    /**
     * Permet d'obtenir la listes des compétences de l'employé
     * @return : set des compétences de l'employé
     */
    public Set<Competence> getCompetences(){
        return this.setCompetences;
    }
    
    public String toString(){
        return this.getIdentifiant() + " : " + this.getNom() + this.getPrenom();
    }
    
}
