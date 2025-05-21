## 📄 Descripció - Enunciat de l'exercici

Aquest exercici és una primera presa de contacte amb Spring Boot i Maven. L'objectiu és crear una aplicació API REST bàsica que contingui dos endpoints:

- El primer endpoint respon a una petició GET a `/HelloWorld`, i rep un paràmetre `nom` via `@RequestParam`. El valor per defecte és `"UNKNOWN"`.
- El segon endpoint respon a una petició GET a `/HelloWorld2/{nom}` via `@PathVariable`, i aquest paràmetre és opcional.

## 💻 Tecnologies Utilitzades

- Java 21
- Spring Boot 3.4.5
- Spring Web
- Spring Boot DevTools
- Maven (gestor de dependències)
- Visual Studio Code (IDE)
- Java Virtual Machine (JVM)

## 📋 Requisits

- JDK 17 o superior (recomanat: Java 21)
- Maven instal·lat i configurat en el sistema
- Port lliure: **9000**

## 🛠️ Instal·lació

1. Clona o descarrega el repositori del projecte
2. Obre el projecte amb Visual Studio Code
3. Assegura't que Maven estigui funcionant:

```bash
mvn -v
