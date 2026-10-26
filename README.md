# Programa Java: Arreglo de 23 números

Programa básico en Java para IntelliJ IDEA que almacena los números del 1 al 23 en un arreglo y los imprime en la consola, mostrando también la posición de cada elemento.

## Requisitos

- JDK 21 (también puede funcionar con versiones modernas de Java).
- IntelliJ IDEA.

## Estructura del proyecto

```text
Arreglo23Numeros/
└── src/
    └── Main.java
```

## Código completo: `Main.java`

```java
public class Main {

    public static void main(String[] args) {

        // Declarar un arreglo de 23 números enteros
        int[] numeros = new int[23];

        // Llenar el arreglo con números del 1 al 23
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Imprimir los 23 números del arreglo
        System.out.println("=== ARREGLO DE 23 NUMEROS ===");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(
                "Posicion " + i + ": " + numeros[i]
            );
        }

        System.out.println("Total de numeros: " + numeros.length);
    }
}
```

## ¿Cómo funciona?

1. `int[] numeros = new int[23];` crea un arreglo con espacio para 23 números enteros.
2. El primer ciclo `for` guarda los números del 1 al 23.
3. El segundo ciclo `for` recorre el arreglo e imprime la posición y el valor de cada elemento.
4. `numeros.length` devuelve la cantidad de elementos del arreglo: `23`.

## Salida esperada

```text
=== ARREGLO DE 23 NUMEROS ===
Posicion 0: 1
Posicion 1: 2
Posicion 2: 3
Posicion 3: 4
Posicion 4: 5
Posicion 5: 6
Posicion 6: 7
Posicion 7: 8
Posicion 8: 9
Posicion 9: 10
Posicion 10: 11
Posicion 11: 12
Posicion 12: 13
Posicion 13: 14
Posicion 14: 15
Posicion 15: 16
Posicion 16: 17
Posicion 17: 18
Posicion 18: 19
Posicion 19: 20
Posicion 20: 21
Posicion 21: 22
Posicion 22: 23
Total de numeros: 23
```

## Cómo ejecutarlo en IntelliJ IDEA

1. Abre IntelliJ IDEA y crea un proyecto Java.
2. Selecciona un JDK instalado.
3. En la carpeta `src`, crea una clase llamada `Main`.
4. Copia el código anterior en `Main.java`.
5. Haz clic en el botón **Run** junto al método `main`.

## Conceptos practicados

- Arreglos de números enteros (`int[]`).
- Ciclo `for`.
- Índices de arreglos, que comienzan en `0`.
- Uso de `length` para conocer el tamaño del arreglo.
- Impresión de información en consola.

---

**Autor:** Ejercicio básico de Java  
**IDE recomendado:** IntelliJ IDEA
