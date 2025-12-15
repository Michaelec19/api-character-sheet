# API Character Sheet

A **RESTful API** developed in Java for managing Dungeons & Dragons 5th Edition (D&D 5e) character sheets.

---

## Project Status

* **Current Phase:** **Phase 2 - Database Connection (JDBC)**
* **Architecture:** Layered Structure (Model, Service, Repository, Resources).
* **Test Coverage:** The **Model Layer** is fully covered by passing unit tests.

---

## Quick Start

### System Requirements

* **Java Development Kit (JDK):** Version 21 or higher (Verified: 21.0.2 LTS).
* **Apache Maven:** Version 3.6 or higher (Verified: 3.8.7).
* **Database:** A running instance of **MySQL** is required (for Phase 2 onwards).
* **API Stack:** Built using **Jersey 3.1.5** (JAX-RS) running on the **Grizzly** embedded web server.

### Installation and Build

1.  Clone the repository:
    ```bash
    git clone [https://github.com/michaelec19/api-character-sheet](https://github.com/michaelec19/api-character-sheet)
    cd api-character-sheet
    ```
2.  Build the project, download dependencies, and generate the executable JAR file:
    ```bash
    mvn clean package
    ```

###  Running the API

The project is configured with the `exec-maven-plugin`. Run the command below to start the embedded Grizzly web server:

```bash
mvn exec:java
```
### Architecture and Model Structure

The application follows a standard layered architecture. Phase 1 focused on establishing and verifying the data model:

## 1. Data Model (/model)
The main Character entity is implemented using the Composition principle (Módulo 2), grouping attributes into clean sub-classes:

- PlayerCharacter.java: The main composition entity.
- BasicInfo.java: Name, Class, Level, Race.
- Stats.java: Ability Scores (STR, DEX, CON, INT, WIS, CHA) and Experience Points (XP).
- CombatStats.java: Armor Class (AC), proficiencyBonus, Initiative, Speed and Hit Points.

## 2. Endpoints (Placeholder)
GET /api/v1/characters (Implementation pending in later phases)

## Unit Testing
To execute the unit tests for the model (CharacterTest.java):

```bash
mvn test
```

### Author
Michaelec19 - com.michaelec19