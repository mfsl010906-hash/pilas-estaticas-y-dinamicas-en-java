# pilas-estaticas-y-dinamicas-en-java

**tarea 1 unidad 3** 
**asignatura:** estructura de datos  
**alumna:** maria fatima sanchez landa
**docente:** victor hugo vasquez herrera
**institucion:** instituto tecnologico superior de xalapa

---
#  📌 diferencias conceptuales: Almacenamiento Estatico VS. Almacenamiento Dinamico

-**Pila Estatica (`PilaSimple.java`):**
-**almacenamiento:** utiliza un bloque contiguo reservado en Heap/Stack y un tamaño fijo desde su inicialización
-**capacidad:** Tiene un limite finito definido (`datos.length`) y cuando el tope llega a su limite ocurre un desbordamiento (riesgo de Overflow)
-**Uso de memoria:** La memoria se aparta en su totalidad de manera contigua al instanciar el arreglo (ej. 5 enteros de 4 bytes = 20 bytes fijos), sin importar si la pila tiene 0 o 5 elementos. 

-**Pila Dinámica (PilaDinamica.java):**
-**Almacenamiento:** Nodos dispersos en Heap enlazados por referencias (`siguente`)
-**Capacidad:** Dinamico (limitada únicamente por memoria Ram)
-**Uso de memoria:** ofrece máxima flexibilidad para aplicaciones donde el flujo de datos es impredecible y no se desea limitar artificialmente el tamaño de la estructura.

---

## 🛠️ Instrucciones para Compilar y Ejecutar

### Desde la Terminal/Consola

1. Clonar el repositorio y acceder a la carpeta del proyecto:
   bash
   git clone <URL_DE_TU_REPOSITTORIO>
   cd <NOMBRE_DE_LA_CARPETA>
   

2. Compilar los archivos fuente:
   bash
   javac *.java
   

3. Ejecutar las clases de prueba:
   - Para probar la *Pila Estática*:
     bash
     java LanzadorPilaSimple
     
   - Para probar la *Pila Dinámica*:
     bash
     java Main
     

---

## 🖥️ Ejemplo de Salida por Consola

### Prueba 1: Pila Estática (LanzadorPilaSimple)

text
¿Está vacía la pila estática?: true
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30 
Elemento en el tope (peek): 30
¿Está llena la pila estática?: false
Sacaste: 30
Pila actual: 10 20 
Nuevo elemento en el tope (peek): 20


### Prueba 2: Pila Dinámica (Main)

text
¿Está vacía la pila dinámica?: true

*** INSERTANDO ELEMENTOS (PUSH) ***
Metiste a la pila dinámica: 10
Metiste a la pila dinámica: 20
Metiste a la pila dinámica: 30
Pila dinámica (cima -> fondo): 30 20 10 
Elemento en la cima (peek): 30

*** SACANDO UN ELEMENTO (POP) ***
Sacaste de la pila dinámica: 30
Pila dinámica (cima -> fondo): 20 10 
Nuevo elemento en la cima (peek): 20

