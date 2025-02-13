package test;
import models.incident;
import models.planAction;
import services.incidentService;
import services.planActionService;

import java.sql.SQLException;
import java.util.*;

public class main {
    public static void main(String[] args) {
        incidentService is = new incidentService();
        planActionService pas = new planActionService();

        incident inc = new incident("Panne réseau", "Le réseau interne est hors service", new Date(),"cat1","IT", "En attente");
        incident inc1 = new incident("Panne serveur", "Le serveur principal ne répond plus", new Date(), "IT", "Critique", "En cours d'analyse");
        incident inc2 = new incident("Problème de connexion", "Les employés ne peuvent pas se connecter au VPN", new Date(), "IT", "Majeur", "En attente de diagnostic");
        incident inc3 = new incident("Cyberattaque détectée", "Tentative d'intrusion sur le réseau", new Date(), "IT", "Critique", "Intervention en cours");
        incident inc4 = new incident("Livraison retardée", "Le transporteur a signalé un retard de livraison", new Date(), "Logistique", "Moyen", "Nouvelle date en attente");
        incident inc5 = new incident("Marchandise endommagée", "Des produits sont arrivés en mauvais état", new Date(), "Logistique", "Majeur", "Rapport d'inspection en cours");
        incident inc6 = new incident("Alarme déclenchée", "Une alarme incendie s'est déclenchée par erreur", new Date(), "Sécurité", "Mineur", "Vérification en cours");
        incident inc7 = new incident("Intrusion non autorisée", "Un individu non autorisé a été repéré dans la zone restreinte", new Date(), "Sécurité", "Critique", "Intervention en cours");
        incident inc8 = new incident("Conflit entre employés", "Un désaccord important a eu lieu dans une équipe", new Date(), "RH", "Moyen", "Médiation prévue");
        incident inc9 = new incident("Accident de travail", "Un employé s'est blessé sur son poste", new Date(), "RH", "Critique", "Déclaration en cours");




        try{

        //*****************************Ajout****************************************
            is.ajouter(inc6);
            // Afficher tous les incidents
            System.out.println("Liste de tous les incidents :");
            is.recuperer().forEach(System.out::println);


        //*****************************Suppression*********************************
            /*// Afficher les incidents avant suppression
            System.out.println("Liste des incidents avant suppression :");
            is.recuperer().forEach(System.out::println);

            // Supprimer un incident par son ID
            int idIncidentASupprimer = 14; // ID de l'incident à supprimer
            is.supprimer(idIncidentASupprimer);

            // Afficher les incidents après suppression
            System.out.println("Liste des incidents après suppression :");
            is.recuperer().forEach(System.out::println);*/
            //*************************Modification********************************
            /*// Afficher les incidents avant modification
            System.out.println("Liste des incidents avant modification :");
            is.recuperer().forEach(System.out::println);

            // Modifier un incident par son ID
            int idIncidentAModifier = 7; // ID de l'incident à modifier
            incident nouvellesValeurs = new incident("LOULOU", "Problème d'alimentation électrique", new Date(), "cat2", "Maintenance", "En cours");
            is.modifier(idIncidentAModifier, nouvellesValeurs);

            // Afficher les incidents après modification
            System.out.println("Liste des incidents après modification :");
            is.recuperer().forEach(System.out::println);*/

            //*****************************************************PLANACTION*****************************
            //*****************Ajout*************************
           /*// Récupérer l'ID de l'incident ajouté (dernière entrée par exemple)
            int incidentId = is.recuperer().get(is.recuperer().size() - 1).getIdIncident();

            // Ajouter un plan d'action pour cet incident
            planAction pa = new planAction( 9, "Étape 1: Analyse du problème", "2",null);
            pas.ajouter(pa);

            // Afficher tous les plans d'action
            System.out.println("Liste de tous les plans d'action :");
            pas.recuperer().forEach(System.out::println);*/
            //********************Modif***********************
            //Afficher la liste des plans d'action avant modification
            /*System.out.println("Liste des plans d'action AVANT modification :");
            List<planAction> plans = pas.recuperer();
            plans.forEach(System.out::println);

            //Modifier un plan d'action avec un ID spécifique
            int idPlanAction = 1; // Remplace ceci par l'ID du plan que tu veux modifier

            planAction nouveauPlan = new planAction(9, "Nouvelle étape", "4", null);

            pas.modifier(idPlanAction, nouveauPlan);
            //Afficher la liste des plans d'action après modification
            System.out.println("\nListe des plans d'action APRÈS modification :");
            pas.recuperer().forEach(System.out::println); */
            //************************Supp*********************
            /*//Afficher la liste des plans d'action avant suppression
            System.out.println("Liste des plans d'action AVANT suppression :");
            List<planAction> plans = pas.recuperer();
            plans.forEach(System.out::println);

            //Supprimer un plan d'action avec un ID spécifique
            int idPlanAction = 1; // Remplace ceci par l'ID du plan que tu veux supprimer
            pas.supprimer(idPlanAction);

            //Afficher la liste des plans d'action après suppression
            System.out.println("\nListe des plans d'action APRÈS suppression :");
            pas.recuperer().forEach(System.out::println);*/


        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
    }

}

//ajout plan action w modif khedmet ema bel maawej : lezem f responsables thot responsable id ema sous forme de chaine w resultat null wala "null" si non matekhdemch
