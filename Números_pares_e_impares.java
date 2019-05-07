package números_pares_e_impares;

import java.util.Scanner;

public class Números_pares_e_impares {

    public static void main(String[] args) {
        //Objeto scanner que servirá para leer los datos
        Scanner lectura = new Scanner(System.in);
        //Arreglo de caracteres para mostrar los # pares
        String msgp = new String();
        //Arreglo de caracteres para mostrar los # impares
        String msgi = new String();
        //Arreglo de enteros con capacidad de 10
        int[] a = new int[10];
        //Contador que cuenta cuántas veces se repite un número
        int repetido = 0;
        System.out.println("Digite 10 números: ");
        /*Iniciamos un for. No lo necesitamos para leer 10 veces,
        pero sí para que compare cada valor respecto al resto
        y agregue 10 veces un mensaje a los arreglos.*/
        for (int i = 0; i < 10; i++) {
            /*Lectura que se guarda en el arreglo, realiza una o varias 
            lectura, pero puede guardar hasta 10 en una sola pasada, por 
            lo que, cuando vuelve a iterar el primer for, simplemente 
            rescata el siguiente valor que halla.*/
            a[i] = lectura.nextInt();
            if (a[i] % 2 == 0) { //Guardado para pares
                for (int f = 0; f <= i; f++) { //Compara el valor actual con
                    if (a[i] == a[f]) {        //Compara el valor actual con
                        repetido++;            //alcanzado del arreglo
                    }
                }
                /*Solo se debe de repetir una vez, pues se compara
                con sí mismo, así que repetido debería de ser = 1*/
                if (repetido == 1) { 
                    msgp += "" + a[i] + ", ";
                }
                repetido = 0; /*Seteamos el valor de repetido a 0 para
                darle paso a la siguiente variable que se vaya a analizar*/
            }else{ //Guardado para impares
                for (int f = 0; f <= i; f++) {//Compara el valor actual con
                    if (a[i] == a[f]) {       //Compara el valor actual con
                        repetido++;           //alcanzado del arreglo
                    }
                }
                /*Solo se debe de repetir una vez, pues se compara
                con sí mismo, así que repetido debería de ser = 1*/
                if (repetido == 1) {
                    msgi += "" + a[i] + ", ";
                }
                repetido = 0; /*Seteamos el valor de repetido a 0 para
                darle paso a la siguiente variable que se vaya a analizar*/
            }
        }
        System.out.println("Los pares son: "+msgp);
        System.out.println("Los impares son: "+msgi);
    }
}
