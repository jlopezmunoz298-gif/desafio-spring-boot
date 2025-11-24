# Guía de Configuración y Ejecución de la API

Este documento describe los pasos necesarios para ejecutar el proyecto, tanto desde un IDE como desde la terminal, y explica cómo probar los endpoints utilizando H2, Postman y Swagger.

---

## 🚀 Ejecución del Proyecto

### ▶️ Ejecución desde un IDE

1. **Clonar el repositorio**
    - Usa tu cliente Git favorito para descargar el código del proyecto.

2. **Importar como proyecto Maven**
    - Abre tu IDE (IntelliJ IDEA, Eclipse, etc.) e importa el proyecto seleccionando la opción para proyectos Maven.

3. **Actualizar dependencias**
    - Ejecuta una actualización de Maven para descargar correctamente todas las dependencias.

4. **Iniciar la aplicación**
    - Ejecuta la clase principal (`main`) directamente desde el IDE.

---

### 💻 Ejecución desde la Terminal

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/jlopezmunoz298-gif/desafio-spring-boot
   ```

2. **Compilar y construir**
   ```bash
   mvn clean compile install
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```

---

## 🗄️ Acceso y Uso de la Base de Datos H2

1. **Abrir la consola H2**
    - Navega a:  
      👉 http://localhost:8082/h2

2. **Credenciales**
    - **Usuario:** `sa`
    - **Contraseña:** `pass`

3. **Scripts de inicialización**
    - Ubicados en:
      ```
      src/main/resources
      ```

4. **Configuración de la base de datos**
    - Disponible en:
      ```
      src/main/resources/application.yaml
      ```

---

## 🧪 Probando la API REST

### 🧰 Uso con Postman

1. **Importar la colección**
    - Importa el archivo:
      ```
      Desafio-java.postman_collection.json
      ```
    - Esto cargará automáticamente los endpoints y variables necesarias.

2. **Autenticación**
    - Antes de utilizar cualquier endpoint, genera un token con:
      ```
      POST /api/login
      ```

    - Cuerpo del request:
      ```json
      {
        "username": "user1",
        "password": "1234"
      }
      ```
---

### 📘 Uso con Swagger

1. **Abrir la interfaz Swagger**
    - Accede a:  
      👉 http://localhost:8082/actuator/swagger-ui/index.html#/

2. **Autenticación previa**
    - Igual que con Postman, primero solicita un token en:
      ```
      POST /api/login
      ```

    - Cuerpo del request:
      ```json
      {
        "username": "user1",
        "password": "1234"
      }
      ```

---

## ✅ Notas Finales

- Asegúrate de mantener el proyecto actualizado ejecutando `mvn clean install` al realizar cambios importantes.
- Si necesitas ayuda adicional con la configuración o deseas mejorar este README, ¡puedo ayudarte!
