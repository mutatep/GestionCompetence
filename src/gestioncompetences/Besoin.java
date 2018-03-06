/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mutatep
 */
public class Besoin implements SuppressionCompetence{
    private Map<Competence, Integer> mapCompetencePersonnes;
    private int nbPersTotal;
    
    public Besoin(int nbPers){
        this.mapCompetencePersonnes = new HashMap<>();
        this.nbPersTotal = nbPers;
    }
    
    public void ajouterCompetencePersonnes(Competence c, int nbPers) throws IllegalArgumentException{
        if(c == null)
            throw new IllegalArgumentException("La valeur de compétence est null");
        if(nbPers == 0)
            throw new IllegalArgumentException("Le nombre de personne doit être supérieur à 0");
        this.mapCompetencePersonnes.put(c, nbPers);
    }

    @Override
    public void SupprimerCompetence(Competence c) throws IllegalArgumentException{
        if(c == null)
            throw new IllegalArgumentException("La valeur de compétence est null");
        this.mapCompetencePersonnes.remove(c);
    }

    
}
