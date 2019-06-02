# -SPRING-_Service_locator_pattern

Implémentation du modèle de localisation de service à travers une petite application
qui permet d'ingérer des donnée à partir de différentes sources

But de l'application -> Convertir différents types de contenu tels que  CSV, JSON etc...

1-> Déclaration d'une énumeration "CONTENT-TYPE" chargée de lister tous les type de formats
2-> Définition d'ue interface "Parser" avec une signature "parse" qui récupère un fichier en entrée
et retourne une liste d'enregistrement
3-> Création d'implémentation de l'interface "Parser" pour chaque format de fichier
4-> Création du service(client) qui fait appel aux différentes implémentations via l'interface
