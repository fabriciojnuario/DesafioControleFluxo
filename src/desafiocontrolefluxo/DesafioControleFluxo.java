/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocontrolefluxo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author spike80
 */
public class DesafioControleFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Insira o primeiro número:\n ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo número:\n ");
        int parametroDois = terminal.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro\n");
        }
        
        
    }
    
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1<num2){
            int num_contagem = num2-num1;
            for(int i=0; i<=num_contagem; i++){
                System.out.println("Imprimindo o nº: ".concat(String.valueOf(i)));
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
    
}
