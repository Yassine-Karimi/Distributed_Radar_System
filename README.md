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
*+------------------------+
|       Radar            |
+------------------------+
| - id: String           |
| - vitesseMaximale: int |
| - longitude: double    |
| - latitude: double     |
+------------------------+
| + getId(): String      |
| + getVitesseMaximale(): int |
| + getLongitude(): double |
| + getLatitude(): double |
| + setId(id: String): void |
| + setVitesseMaximale(vitesse: int): void |
| + setLongitude(longitude: double): void |
| + setLatitude(latitude: double): void |
+------------------------+
* Diagramme de Classe du Micro-service de Gestion des Immatriculations
+------------------------+
|       Proprietaire     |
+------------------------+
| - id: String           |
| - nom: String          |
| - dateNaissance: Date  |
| - email: String        |
+------------------------+
| + getId(): String      |
| + getNom(): String     |
| + getDateNaissance(): Date |
| + getEmail(): String   |
| + setId(id: String): void |
| + setNom(nom: String): void |
| + setDateNaissance(date: Date): void |
| + setEmail(email: String): void |
+------------------------+

+------------------------+
|       Vehicule          |
+------------------------+
| - id: String           |
| - numeroMatricule: String |
| - marque: String       |
| - puissanceFiscale: int |
| - modele: String       |
+------------------------+
| + getId(): String      |
| + getNumeroMatricule(): String |
| + getMarque(): String  |
| + getPuissanceFiscale(): int |
| + getModele(): String  |
| + setId(id: String): void |
| + setNumeroMatricule(numero: String): void |
| + setMarque(marque: String): void |
| + setPuissanceFiscale(puissance: int): void |
| + setModele(modele: String): void |
+------------------------+

