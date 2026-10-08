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
   ´´´bash
   git clone <https://github.com/mfsl010906-hash/pilas-estaticas-y-dinamicas-en-java.git>
   cd <pilas_estaticas_y_dinamicas_en_java>
   ´´´

2. Compilar los archivos fuente:
   ´´´bash
   javac *.java
   ´´´

3. Ejecutar las clases de prueba:
   - Para probar la **Pila Estática:**
     ´´´bash
     java LanzadorPilaSimple
     ´´´
   - Para probar la **Pila Dinámica:**
     ´´´bash
     java Main
     ´´´

---

## 🖥️ Ejemplo de Salida por Consola

### Prueba 1: Pila Estática (LanzadorPilaSimple)

´´´text
¿esta vacia la pila estatica?: true
Metiste: 10
Metiste: 20
Metiste: 30
pila actual: 
10 20 30 
elemento en el tope (peek): 30
¿esta llena la pila estatica?: false
sacaste: 30
pila actual: 
10 20 
nuevo elemento en el tope (peek): 20

Process finished with exit code 0
´´´

### Prueba 2: Pila Dinámica (Main)

´´´text

¿esta vacia la pila dinamica?: true
*** INSERTANDO ELEMENTOS (PUSH) ***
metiste a la pila dinamica: 10
metiste a la pila dinamica: 20
metiste a la pila dinamica: 30
pila dinamica (cima -> fondo): 
30 20 10 
elemento en la sima (pekk): 30

*** SACANDO UN ELEMENTO (POP) ***
sacaste de la pila: 30
pila dinamica (cima -> fondo): 
20 10 
nuevo elemnto en la cima (peek): 20

Process finished with exit code 0
´´´
