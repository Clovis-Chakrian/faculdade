/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.clovischakrian.funcaoeprocedimento;

import java.util.Scanner;

/**
 *
 * @author clovischakrian
 */
public class FuncaoEProcedimento {
    public static void main(String[] args) {
        int opcao;
        double r, lcubo, v, altura, largura, comprimento;
        
        do {
            Menu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escolha uma opção: ");
        
            opcao = scanner.nextInt();
            System.out.println(opcao);
        
            switch(opcao) {
                case 1:
                    System.out.print("Digite o lado do cubo: ");
                    lcubo = scanner.nextDouble();
                    v = VolumeCubo(lcubo);
                    System.out.printf("\nO volume do cubo de lado %f %s %f %s", lcubo, " é: ", v, "\n");
                    break;
                case 2: 
                    System.out.println("\nDigite as dimensões do paralelepípedo (altura, largura e comprimento):");
                    System.out.println("Altura: ");
                    altura = scanner.nextDouble();
                    System.out.println("Largura: ");
                    largura = scanner.nextDouble();
                    System.out.println("Comprimento: ");
                    comprimento = scanner.nextDouble();
                    v = VolumeParalelepipedo(altura, largura, comprimento);
                    System.out.printf("\nO volume do paralelepípedo com altura %f %s %f %s %f %s %f %s", altura, ", largura ", largura, ", e comprimento ", comprimento, " é: ", v, "\n");
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            };
        
        } while (opcao != 0);
        
    };
    
    private static double VolumeCubo(double lado) {
        return (lado*lado*lado);
    };
    
    private static double VolumeParalelepipedo(double altura, double largura, double comprimento) {
        return (altura*largura*comprimento);
    };
    
    private static void Menu() {
        System.out.println("(1) Calcular o volume do cubo.");
        System.out.println("(2) Calcular o volume do paralelepipedo.");
        System.out.println("(0) Sair");
    };
}
