# Distributed_Radar_System



* [1. Introduction](#1)   
* [2. Architecture de projet](#2)
* [3. Le Test des services](#3)    
* [4. Front-End ](#4) 

## Introduction :

Ce projet vise à développer un système distribué basé sur les micro-services pour automatiser la gestion des infractions liées aux dépassements de vitesse détectés par des radars automatiques. L'objectif principal de ce système est de fournir une solution efficace pour traiter les infractions de vitesse, en enregistrant les données pertinentes, en calculant les amendes et en permettant aux propriétaires de consulter leurs infractions.

Le système est composé de trois micro-services interconnectés : le micro-service de gestion des radars, le micro-service de gestion des immatriculations et le micro-service de gestion des infractions. Chaque micro-service se concentre sur un aspect spécifique du processus global.

Le micro-service de gestion des radars permet de gérer les informations relatives aux radars, tels que leur emplacement géographique, leur vitesse maximale autorisée et leur identifiant unique. Il joue un rôle essentiel dans la détection des dépassements de vitesse en enregistrant les informations nécessaires pour générer des infractions.

Le micro-service de gestion des immatriculations gère les propriétaires de véhicules et leurs véhicules respectifs. Il stocke les détails personnels des propriétaires, tels que leur nom, leur date de naissance et leur adresse e-mail, ainsi que les informations spécifiques aux véhicules, telles que le numéro d'immatriculation, la marque, la puissance fiscale et le modèle.

Le micro-service de gestion des infractions est responsable de l'enregistrement et de la gestion des infractions de vitesse. Lorsqu'un dépassement de vitesse est détecté par un radar, une nouvelle infraction est générée, comprenant des informations telles que la date de l'infraction, le radar concerné, le véhicule impliqué, la vitesse du véhicule et le montant de l'amende.

Le système offre plusieurs fonctionnalités, notamment la consultation et la modification des données des radars, des propriétaires, des véhicules et des infractions. Il permet également aux utilisateurs de signaler un dépassement de vitesse, ce qui déclenche automatiquement l'enregistrement d'une nouvelle infraction. De plus, les propriétaires peuvent consulter leurs infractions pour suivre et vérifier les infractions enregistrées pour leurs véhicules.

En utilisant une architecture basée sur les micro-services, ce projet offre une flexibilité et une évolutivité accrues. Chaque micro-service peut être développé, déployé et mis à l'échelle indépendamment, facilitant ainsi la maintenance et l'ajout de nouvelles fonctionnalités au système.

Dans la suite de ce projet, nous mettrons en œuvre les micro-services, en utilisant les technologies appropriées, afin de fournir une solution complète et efficace pour la gestion des infractions de vitesse.

## Architecture de projet : 

* ![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/8ba1c542-4e2e-4d93-ad1f-f092ef6c0285)
* 
### Diagramme de classe:
* Diagramme de Classe du Micro-service de Gestion des Radars

![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/be9d9b1a-7e1b-4184-879a-de30bdfcb7ff)

* Diagramme de Classe du Micro-service de Gestion des Immatriculations

![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/1d394eb2-6539-43ab-8fa6-2a42be9c73a7)

![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/accddd35-7498-4545-85f9-0927219f4ce4)

*Diagramme de Classe du Micro-service de Gestion des Infractions

![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/3aa7fc5b-260d-488b-8764-3a469a927adf)

## Le test des web services : 
* Rest
* * GET
![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/1acca6e7-026d-4850-a8c9-8d9284a43672)
* * POST
![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/d378b28a-511d-43e9-8f99-b50aa686cb6f)
* * PUT
![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/3e874ba1-fd8f-42bf-9c61-0c289ff7a56d)

* GRPC :
* * Afficher les proprietaires
 ![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/b0f975af-5937-467c-992f-35089f4e2912)
* * Afficher un proprietaire par son ID
 ![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/95b6d40f-0704-4f4b-a173-d73336315679)
* * Creer un nouveau proprietaire
 ![image](https://github.com/Yassine-Karimi/Distributed_Radar_System/assets/66490404/0d626315-647b-4cc8-8b77-1296bf92f62f)





