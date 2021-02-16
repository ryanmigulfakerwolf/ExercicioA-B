/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author ryanc
 */
public class AppMedia {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        
        media md = new media();
        
        System.out.println("Digite o 1° valor: ");
        md.v1 = input.nextFloat();
        System.out.println("Digite o 2° valor: ");
        md.v2 = input.nextFloat();
        
        
        md.calcMedia(md.v1, md.v2);
        System.out.println(md.media);
        
        
        
    }
}
