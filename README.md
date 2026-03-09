# 🛡️ Misión Avengers

Sistema desarrollado en **Java** para gestionar héroes y asignar misiones según sus habilidades.
El proyecto utiliza **Programación Orientada a Objetos (POO)** e incluye una **interfaz gráfica en Java Swing**.

---

# 📌 Descripción del Proyecto

**Misión Avengers** es una aplicación que permite administrar un grupo de héroes y asignarles misiones dependiendo de las habilidades que posean.

El sistema evalúa automáticamente si un héroe puede realizar una misión según los requisitos de habilidad establecidos.

El proyecto demuestra el uso de conceptos fundamentales de **Java y POO**, como:

* Herencia
* Polimorfismo
* Interfaces
* Enumeraciones
* Manejo de excepciones
* Interfaz gráfica con Swing

---

# ⚙️ Tecnologías Utilizadas

* Java
* Java Swing
* NetBeans IDE
* Git / GitHub

---

# 🧠 Conceptos de Programación Aplicados

El proyecto implementa varios conceptos clave de programación orientada a objetos.

### Herencia

La clase abstracta `Heroe` permite crear diferentes tipos de héroes con comportamientos específicos.

### Polimorfismo

Se utilizan métodos que permiten que distintos héroes respondan de forma diferente a una misma acción.

### Interfaces

Las habilidades necesarias para cumplir misiones se gestionan mediante interfaces.

### Enumeraciones

Se usa `TipoHabilidad` para definir las habilidades disponibles en el sistema.

### Manejo de excepciones

Se implementan excepciones personalizadas para controlar errores durante la asignación de misiones.

---

# 🗂️ Estructura del Proyecto

```
ProyectoAvengers
│
├── src
│   ├── heroes
│   ├── misiones
│   ├── interfaz
│   ├── notificaciones
│   └── org.mateo
│       └── Main.java
│
├── imagenes
├── music
├── README.md
└── .gitignore
```

---

# 🚀 Cómo Ejecutar el Proyecto

### 1️⃣ Clonar el repositorio

```
git clone https://github.com/Teoqm/TallerCorrecionAvergens.git
```

### 2️⃣ Abrir el proyecto

Abrir el proyecto usando **NetBeans** o cualquier IDE compatible con Java.

### 3️⃣ Ejecutar el programa

Ejecutar la clase principal:

```
org.mateo.Main
```

Esto abrirá la **pantalla inicial del sistema**.

---

# 🎮 Uso del Sistema

1. Iniciar el programa.
2. Presionar **COMENZAR** en la pantalla inicial.
3. Crear héroes desde la interfaz principal.
4. Asignar misiones según las habilidades disponibles.
5. El sistema verificará automáticamente si el héroe puede realizar la misión.

---

# 🔐 Seguridad y Configuración

El proyecto puede utilizar **variables sensibles** para integraciones externas como notificaciones.

Estas variables deben almacenarse en un archivo

---

# 📄 Documentación

El código está documentado utilizando **Javadoc**, lo que permite generar documentación automática del proyecto.

En NetBeans:

Run → Generate Javadoc

---

# 👨‍💻 Autor

Mateo Quintero y Juan José Morales

Proyecto académico desarrollado para practicar **Programación Orientada a Objetos en Java**.

---

# 📜 Licencia

Este proyecto es de uso educativo.
