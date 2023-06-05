/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Sobremesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Bombom="1";
        String Pudim="2";
        String Café="3";
        
            System.out.println("Qual sobremesa deseja \n 1-Bombom?\n 2-Pudim? \n 3-Café?");
            Scanner scanner = new Scanner(System.in);
            String comida = scanner.next();
            
            if(comida.equals(Bombom)){
                System.out.print("Voce escolheu Bombom");
            }else if(comida.equals(Pudim)){
                System.out.println("Voce escolheu Pudim");
            }else if(comida.equals(Café)){
                System.out.println("Voce escolheu Café");
        }            
    }      
}    
