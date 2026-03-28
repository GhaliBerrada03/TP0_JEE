# MyStockApp - Gestion d'Inventaire Simple

## Description
**MyStockApp** est une application web éducative conçue pour la gestion simplifiée d'un stock de produits et des utilisateurs associés. Elle utilise les technologies standards du développement Java Entreprise (JEE).

## Technologies utilisées
- **Backend :** Java 8, Java EE 8 (Servlets, Filters, Listeners)
- **Persistance :** Hibernate 5.6 (ORM), JPA
- **Frontend :** JSP (JavaServer Pages), JSTL, Bootstrap 4
- **Base de données :** MySQL
- **Build :** Maven

## Fonctionnalités
- **Gestion des Utilisateurs :** Ajout, modification, suppression et liste des profils.
- **Gestion du Stock :** Suivi des articles, prix unitaires et quantités disponibles.
- **Moteur de Recherche :** Recherche dynamique d'articles par libellé.
- **Indicateurs visuels :** Alertes automatiques dans l'interface pour les stocks faibles.

## Configuration et Lancement
1.  **Base de données :** Configurez vos accès MySQL dans le fichier `src/main/resources/hibernate.cfg.xml`.
2.  **Compilation :** Utilisez Maven pour nettoyer et compiler le projet :
    ```bash
    mvn clean install
    ```
3.  **Lancement : 
