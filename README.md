# -SPRING-_Service_locator_pattern

Implémentation du modèle de localisation de service à travers une petite application
qui permet d'ingérer des données à partir de différentes sources

But de l'application -> Convertir différents types de contenu tels que  CSV, JSON etc...

1-> Déclaration d'une énumeration "CONTENT-TYPE" chargée de lister tous les type de formats


2-> Définition d'ue interface "Parser" avec une signature "parse" qui récupère un fichier en entrée
et retourne une liste d'enregistrement


3-> Création d'implémentation de l'interface "Parser" pour chaque format de fichier


4-> Création du service(client) qui fait appel aux différentes implémentations via l'interface



--------------------------DESCRIPTION DU MODELE------------------------------------------------------
Modèle localisateur de service:

-Le but est d'avoir un objet qui sait comment retourner tous les services 
dont une application à besoin
-Retirer la dépendance qu'un client a sur une implémentation spécifique

COMPOSNT DE CONCEPTION:

Client: Consommateur qui exige le service au lancement


Localisateur de service/Service locator: Il est responsable de retourner un service au client selon sa demande


Context initial/Initial context: Il crée, enregistre et mémorise le service. c'est le point de recherche et de création


Fabrique de service/Service Factory: Il fournit le cycle de vie de gestion du service avec un support pour creer, rechercher
, et supprimer un service


Service: Implémentation conrète du service voulu par le client
