package com.ikasgela;

public class Main {

    public static void main(String[] args) {
        int[] base = new int[10];
        System.out.print("Array base: ");
        visualizarArray(generar(base));
        System.out.print("\nArray ordenado: ");
        visualizarArray(ordenar(base));
        System.out.print("\nConfirmacion de no mutacion del Array base: ");
        visualizarArray(base);

    }

    private static int[] ordenar(int[] base) {
        int[] ordenado = base.clone();

        for (int i = 0; i <= base.length - 2; i++) {
            for (int j = 0; j <= base.length - i - 2; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }

        return ordenado;
    }

    private static int[] generar(int[] array_base) {
        for (int i = 0; i < array_base.length; i++) {
            array_base[i] = (int) (Math.random() * 20 - 10);
        }
        return array_base;
    }

    private static void visualizarArray(int[] arreglo) {
        System.out.print("[");
        for (double obj : arreglo) {
            System.out.format(" %3.0f", obj);
        }
        System.out.print(" ]\n");
    }
}


