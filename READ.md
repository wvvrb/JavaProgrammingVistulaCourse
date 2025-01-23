# First Project Java Spring

## Application Overview

This is a basic Spring Boot application designed as an introduction to building web applications in Java. It demonstrates the use of controllers, Thymeleaf templates, and handling HTTP request parameters.

### Features
1. **Home Page (`/`)**:
    - Displays a simple welcome message.
    - Can return a REST or HTML response depending on the controller implementation.

2. **Greeting Page (`/greeting`)**:
    - Accepts an optional `name` parameter to display a personalized greeting.
    - Defaults to "World" if no parameter is provided.

3. **Static Image**:
    - Displays an image located in the `static/images` folder on the greeting page.

## Case Study

### Example Usage

1. **Start the Application**
    - Launch the application via `FirstProjectJavaSpringApplication`.
    - The server runs on default port `8080` (e.g., `http://localhost:8080`).

2. **Endpoint Examples**:

    - **Home Page (`/`)**
        - Request: `GET http://localhost:8080/`
        - Response: `Hello Vistula, in my first Spring controller.` (text or HTML response).

    - **Greeting Page (`/greeting` without parameter)**
        - Request: `GET http://localhost:8080/greeting`
        - Response:
          ```html
          <p>Hello, World!</p>
          <img src="/images/vistula.png" width="600" height="600">
          ```

    - **Greeting Page (`/greeting` with parameter)**
        - Request: `GET http://localhost:8080/greeting?name=John`
        - Response:
          ```html
          <p>Hello, John!</p>
          <img src="/images/vistula.png" width="600" height="600">
          ```

## Project Structure

- `src/main/java/pl/edu/vistula/first_project_java_spring`
    - `FirstProjectJavaSpringApplication`: Main application class.
    - `controller/HelloController`: Handles HTTP requests.

- `src/main/resources/templates`
    - `greeting.html`: Thymeleaf HTML template.

- `src/main/resources/static/images`
    - `vistula.png`: Static image used on the greeting page.

## Requirements

- **Java 11+**
- **Maven**
- Web browser (e.g., Chrome, Firefox)

## How to Run
1. Clone the repository or copy the project files.
2. Run the Maven command:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Open a browser and navigate to `http://localhost:8080`.

## Troubleshooting
If the application encounters errors (e.g., template issues), ensure templates and static files are in the correct directories (`resources/templates`, `resources/static`).
