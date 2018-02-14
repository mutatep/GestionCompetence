/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

/**
 * Interface Fichier
 * @author mutatep
 */
public interface Fichier {
    
    /**
     * Permet de récupérer les données dans le fichier passé en paramètre
     * @param File : Le fichier à lire
     */
    void chargerDonnees(String File);
    
}
