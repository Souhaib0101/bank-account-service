# Activite Pratique N 1 - Implementation d un micro-service avec Spring Boot

Ce projet represente la premiere activite pratique visant a concevoir et a implementer un micro-service de gestion de comptes bancaires a l aide de **Spring Boot**, **Spring Data JPA**, **H2**, **REST**, **Spring Data REST**, et **GraphQL**.

---

## Table des matieres
1. [Description du projet et Objectifs](#description-du-projet-et-objectifs)
2. [Technologies Utilisees](#technologies-utilisees)
3. [Architecture et Etapes de Realisation](#architecture-et-etapes-de-realisation)
4. [Base de donnees H2 et Couche DAO](#base-de-donnees-h2-et-couche-dao)
5. [Tests des Web Services REST](#tests-des-web-services-rest)
6. [Documentation Swagger / OpenAPI](#documentation-swagger--openapi)
7. [Tests via GraphiQL (GraphQL)](#tests-via-graphiql-graphql)
8. [Auteur](#auteur)

---

## Description du projet et Objectifs

L objectif de ce projet est de manipuler l ecosysteme Spring pour construire un micro-service robuste de gestion de comptes bancaires. Les etapes suivies couvrent :
1. La creation d un projet Spring Boot avec les dependances necessaires (*Web, Spring Data JPA, H2, Lombok*).
2. La creation de l entite JPA `Compte` et de l interface `CompteRepository`.
3. Le test de la couche DAO et la mise en place d un Web service RESTful.
4. L exposition et la documentation des API via **Swagger**.
5. L utilisation de **Spring Data REST** et des projections.
6. L implementation de la couche Service, des DTOs, des mappers et d un Web service **GraphQL**.

---

## Technologies Utilisees

Le projet repose sur la stack technique suivante (extrait du fichier `pom.xml`) :

* **Langage & Framework Base :** Java 17, Spring Boot 4.1.2
* **Web & API REST :** Spring Web MVC (`spring-boot-starter-webmvc`), Spring Data REST (`spring-boot-starter-data-rest`)
* **GraphQL :** Spring GraphQL (`spring-boot-starter-graphql`)
* **Persistence & Base de Donnees :** Spring Data JPA (`spring-boot-starter-data-jpa`), Base de donnees H2 (`h2`, `spring-boot-h2console`)
* **Documentation API :** Springdoc OpenAPI UI (`springdoc-openapi-starter-webmvc-ui` v3.2.0)
* **Productivite & Outils :** Lombok (`lombok`), Maven Compiler Plugin
* **Tests Unitaires & Integration :** Spring Boot Starter Test (Data JPA, GraphQL, WebMVC)

---

## Architecture et Etapes de Realisation

* **Etape 1 :** Initialisation du projet Spring Boot (Web, JPA, H2, Lombok).
* **Etape 2 et 3 :** Creation de l entite JPA et de l interface repository correspondante.
* **Etape 4 a 6 :** Developpement des controleurs REST et validation via Postman.
* **Etape 7 :** Generation de la documentation interactive des API[cite: 10].
* **Etape 8 a 10 :** Structuration de la logique metier, des DTOs, des mappers et de l architecture service.
* **Etape 11 :** Integration de GraphQL pour offrir des requetes et mutations flexibles[cite: 1, 2, 3, 4, 5, 6, 7, 8].

---

## Base de donnees H2 et Couche DAO

La base de donnees en memoire H2 permet de persister et de tester rapidement les donnees des comptes bancaires.

* **Console H2 - Visualisation de la table `BANK_ACCOUNT` :**
  ![Table Bank Account H2](TP%201.png)[cite: 10]

---

## Tests des Web Services REST

L endpoint REST permet d acceder directement aux listes de comptes bancaires sous format JSON avec leurs details et relations clients.

* **Reponse JSON de l API REST (`/api/bankAccounts`) :**
  ![API Bank Accounts JSON](1.12.png)[cite: 11, 12]

---

## Documentation Swagger / OpenAPI

La documentation de l API REST permet d explorer l ensemble des endpoints disponibles (`/bankAccounts`) ainsi que les controleurs de recherche[cite: 10].

* **Interface Swagger UI :**
  ![Swagger OpenAPI Definition](TP%201.2.png)[cite: 10]

---

## Tests via GraphiQL (GraphQL)

L API GraphQL permet d interroger et de manipuler les donnees avec precision grace a des requetes et des mutations personnalisees.

### 1. Interface GraphiQL (Accueil et Documentation)
![GraphiQL Welcome](TP%201.3.png)[cite: 9]

### 2. Requetes (Queries)
* **Recherche d un compte par son identifiant :**
  ![Bank Account By ID](1.5.png)[cite: 8]
* **Gestion des erreurs (Compte non trouve) :**
  ![Bank Account Error](1.6.png)[cite: 7]
* **Affichage de la liste des clients et de leurs soldes :**
  ![Customers List](1.10.png)[cite: 3]
* **Affichage de la liste des comptes avec details clients :**
  ![Accounts List](1.11.png)[cite: 1]

### 3. Mutations (Ajout, Modification, Suppression)
* **Ajout d un nouveau compte (`addAccount`) :**
  ![Add Account Mutation](1.7.png)[cite: 6]
* **Mise a jour d un compte (`updateAccount`) :**
  ![Update Account Mutation](1.8.png)[cite: 4]
* **Suppression d un compte (`deleteAccount`) :**
  ![Delete Account Mutation](1.9.png)[cite: 5]

---
