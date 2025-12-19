# API Character Sheet

A **RESTful API** developed in Java for managing Dungeons & Dragons 5th Edition (D&D 5e) character sheets.

---

## Project Status

* **Current Phase:** Phase 3 - Spring Boot & JPA Integration (CRUD Complete).
* **Architecture:** Layered Structure (Controller, Service, Repository, Model).
* **Stack:** Migrated from Jersey/Grizzly to **Spring Boot 3.2** with **Hibernate** for ORM and **MySQL** for persistence.
* **Java Version:** Optimized for **Java 21 (LTS)** using Vanilla Java (no Lombok) for maximum compatibility and clean compilation.

---

### System Requirements

* **Java Development Kit (JDK):** Version 21 (LTS).
* **Apache Maven:** Version 3.9 or higher.
* **Database:** **MySQL 8.0** or higher.
* **Framework:** **Spring Boot 3.2.0** (Embedded Tomcat).
* **ORM:** Hibernate 6.x.

## Architecture and Model Structure

The application follows a standard **layered architecture** to ensure separation of concerns and maintainability:


## 1. Data Model (/model)

TData Model (`/model`)
The `PlayerCharacter` entity is implemented using the **Composition principle**, grouping attributes into clean sub-classes using JPA `@Embedded` annotations. This allows for a clean database schema while maintaining an object-oriented structure:

- PlayerCharacter.java: The main composition entity.
- BasicInfo.java: Name, Class, Level, Race.
- Stats.java: Ability Scores (STR, DEX, CON, INT, WIS, CHA) and Experience Points (XP).
- CombatStats.java: Armor Class (AC), proficiencyBonus, Initiative, Speed and Hit Points.

## 2. Endpoints (Placeholder)
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/v1/characters` | Retrieve all characters from the database. |
| **GET** | `/api/v1/characters/{id}` | Retrieve details of a specific character by ID. |
| **POST** | `/api/v1/characters` | Create and persist a new character sheet. |
| **PUT** | `/api/v1/characters/{id}` | Update an existing character's information. |
| **DELETE** | `/api/v1/characters/{id}` | Permanently remove a character from the system. |

### Sample JSON Payload (POST/PUT)

```json
{
  "basicInfo": {
    "characterName": "Therival",
    "characterClass": "Wizard",
    "level": 5,
    "race": "Elf"
  },
  "stats": {
    "experiencePoints": 6500,
    "strength": 10,
    "dexterity": 15,
    "constitution": 12,
    "intelligence": 20,
    "wisdom": 14,
    "charisma": 10
  },
  "combatStats": {
    "armorClass": 12,
    "initiative": 2,
    "speed": 30,
    "hitPoints": 45,
    "proficiencyBonus": 3
  }
}
```

### Installation and Build

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/michaelec19/api-character-sheet](https://github.com/michaelec19/api-character-sheet)
    cd api-character-sheet
    ```
2.  **Clean and install dependencies:**
    ```bash
    mvn clean install
    ```

###  Running the API

Start the embedded Tomcat server using the Spring Boot Maven Plugin:
```bash
mvn spring-boot:run
```
The API will be available at: http://localhost:8080/api/v1/characters

## 3. Additional Information

### Unit Testing
To execute the unit tests

```bash
mvn test
```

### Configuration

The persistence layer is managed by Spring Data JPA. Database connection strings, credentials, and Hibernate properties are located in: src/main/resources/application.properties

### Author
Michaelec19 - com.michaelec19