/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gustavotesterelacional;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Gustavotesterelacional {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        int valor;
        int pdesconto;
        int vdesconto;
        int pjuros;
        int vjuros;

         System.out.println("****WINKS!!****");
         System.out.println("Digite o valor da compra:");
         valor =leia.nextInt();
         System.out.println("Digite a porcentagem de desconto:");
         pdesconto = leia.nextInt();
         System.out.println("Digite a porcentagem de juros:");
         pjuros =leia.nextInt();
        
         vdesconto = valor * pdesconto;
          vjuros = valor * pjuros;
         
        System
        System.out.println("Compra com" + pdesconto);
        System.out.println("Compra co 10% de juros " +vjuros);
    }  
}
