# 🚀 **Práctica 09 - Patrones de Vibración en Android**

## 📝 Descripción

Esta práctica se centra en implementar patrones de vibración en una aplicación de Android utilizando imágenes como botones interactivos. Al tocar las imágenes, la aplicación genera diferentes tipos de vibración, con tiempos y amplitudes variables.

En este caso, la aplicación tiene dos imágenes: una para la vibración fija y otra para la vibración variable con intensidad ajustada. La vibración puede variar en duración e intensidad según el dispositivo y la versión de Android.

## ⚙️ Tecnologías usadas

- **Android SDK 34**  
- **Java (MainActivity)**  
- **Vibrator**  
- **VibrationEffect**  
- **ImageView**  
- **Edge-to-Edge API**  
- **ConstraintLayout**  
- **Gradle Kotlin DSL** (`build.gradle.kts`)

## 📐 Diseño UI

El layout principal (`activity_main.xml`) está diseñado con **ConstraintLayout** y contiene dos imágenes (interactivas como botones):

- **imageSinSonido**: Representa la vibración fija.
- **imageBee**: Representa la vibración con intensidad variable.

Ambas imágenes están distribuidas de manera flexible utilizando **Guidelines** para garantizar un buen ajuste en diferentes tamaños de pantalla. Al tocar cada imagen, se ejecutan los efectos de vibración correspondientes.

## 🚀 Ejecución

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. AsegúraR de dar permiso de vibración en el **AndroidManifest.xml**:
4. Tocar la imagen "Vibración fija" para generar una vibración de duración fija (500 ms).
5. Tocar la imagen "Vibración intensidad" para generar una vibración variable en intensidad y duración (usando un patrón).

## 📌 Versionado

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 Licencia

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 Expresiones de Gratitud  

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.  
