/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolistasenlazadas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProyectoListasEnlazadas {
    public static Scanner sc = new Scanner(System.in);
public static ListaEnLazada miLista = new ListaEnLazada();

public static void main(String[] args) {

int op = 0;

do {
System.out.println("menu de opciones");
System.out.println("[1] Ingresar elementos a las lista");
System.out.println("[2] Mostrar lista");
System.out.println("[3] Ingrese Elemento Al final");
System.out.println("[4] Borrar numero del inicio");
System.out.println("[5] Mayor numero");
System.out.println("[6] Menor numero");
System.out.println("[7] Promedio");
System.out.println("[8] Ordenar Acendente ");
System.out.println("[9] Eliminar por posicion");
System.out.println("[10] Salir");
System.out.println("Ingrese opcion[1-10]");
op = sc.nextInt();
switch (op) {

case 1:

double x = 0;
System.out.println("numero de elementos de la lista");
int n = sc.nextInt();
for (int j = 0; j < n; j++) {
System.out.println("Ingrese numero:" + j);
x = sc.nextDouble();
miLista.insertarAlinicio(x);
}
break;
case 2:
System.out.println("Los numeros ingresados son::");
miLista.mostrar();
break;
case 3:
double e;
System.out.println("numero de elementos de la lista");
int r = sc.nextInt();
for (int i = 0; i < r; i++) {
System.out.println("Ingrese numer::" + i);
e = sc.nextDouble();
miLista.insertarAlFinal(e);
}
break;
case 4:
System.out.println("Borrando numero del inicio");
miLista.borrarPrimero();
break;
case 5:

miLista.mayor();
break;
case 6:
miLista.menor();break;

case 7:
System.out.println("Promedio ");
miLista.promedio();
break;
case 8:
System.out.println("ORDENAMIENTO ACENDENTE");
miLista.ordenarAcendente();
miLista.mostrar();
break;
case 9:
System.out.println("Ingrese Numero a eliminar ");
double numero=sc.nextDouble();

if(miLista.buscarPosicion(numero)!=-1){
int p=miLista.buscarPosicion(numero);
miLista.borrar(p);
System.out.println("numero eliminado");
}else{
System.out.println("Nuemro no encontrado ");
}
break;

default:
System.out.println("Saliendo del programa ");
}
} while (op != 10);
}
}

