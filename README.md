# Conversor de Monedas

Conversor de monedas en consola que obtiene tasas de cambio en tiempo real desde [Exchangerate-API](https://v6.exchangerate-api.com). Permite convertir entre Dólar, Peso Argentino, Real Brasileño y Peso Colombiano.

## 🛠️ Tecnologías

- Java 16+
- Gson 2.10.1 (deserialización JSON)
- HttpClient (Java 11+)

## 📋 Requisitos

- Java 16 o superior
- Conexión a Internet
- Gson JAR en classpath

## 🚀 Cómo ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/challenge-conversor-de-monedas.git
cd challenge-conversor-de-monedas

# Compilar
javac -cp "E:/gson 2.10.1/gson-2.10.1.jar" src/Principal.java src/calculos/*.java src/conversiones/*.java

# Ejecutar
java -cp "src;E:/gson 2.10.1/gson-2.10.1.jar" Principal
```

> **Nota**: Actualiza la ruta del JAR de Gson según tu configuración.

## 📁 Estructura del proyecto

```
src/
├── Principal.java              # Punto de entrada, menú y loop principal
├── calculos/
│   └── LasMonedas.java         # Lógica de conversión y formatos de display
└── conversiones/
    ├── Conversiones.java       # Record para deserializar respuesta JSON
    └── ConsultaConversion.java # Cliente HTTP para consumir la API
```

## 🎯 Sobre el challenge

Challenge del programa **Oracle Next Education (ONE)** - G7. Consiste en construir un conversor de monedas que consuma tasas de cambio en tiempo real desde una API externa, utilizando Java y el paradigma de programación orientada a objetos.

### Conversiones disponibles

| Opción | Conversión              |
|--------|-------------------------|
| 1      | Dólar → Peso Argentino |
| 2      | Peso Argentino → Dólar  |
| 3      | Dólar → Real Brasileño  |
| 4      | Real Brasileño → Dólar  |
| 5      | Dólar → Peso Colombiano |
| 6      | Peso Colombiano → Dólar |

## 👤 Autor

Walter Valverde
