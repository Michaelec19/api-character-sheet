# api-character-sheet
A dedicated RESTful API providing CRUD operations for Dungeons &amp; Dragons 5th Edition character sheets
 
# API Character Sheet 

A **RESTful API** developed in Java for managing character sheets, suitable for role-playing games (TTRPGs) or general inventory systems.

---

## Quick Start

### System Requirements

* **Java Development Kit (JDK):** Version 21 or higher (Verified: 21.0.2 LTS).
* **Apache Maven:** Version 3.6 or higher (Verified: 3.8.7).
* **API Stack:** Built using **Jersey 3.1.5** (JAX-RS implementation) running on the **Grizzly** embedded web server.

### Installation and Build

1.  Clone the repository:
    ```bash
    git clone [Your Repository URL, e.g., [https://github.com/michaelec19/api-character-sheet](https://github.com/michaelec19/api-character-sheet)]
    cd api-character-sheet
    ```
2.  Build the project, download all dependencies (Jersey, Grizzly, Jackson), and generate the executable JAR file:
    ```bash
    mvn clean package
    ```

### ▶Running the API

The project is configured with the `exec-maven-plugin`. Run the command below to start the embedded Grizzly web server:

```bash
mvn exec:java