/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;
import java.util.Scanner;
/**
 *
 * @author Igor Nathan
 */
public class Conta{
    
    //propriedade Saldo
        double saldoConta = 2000;
        double deposito = 0;
        double saque = 0;
        
    //Métodos
    //a) construtor (deve possuir entrada de valores)
        public void Conta(){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Você deseja fazer um Saque ou um deposito? \n Tecle 1 -> Saque\n tecle 2 -> Deposito.");// manda uma mensagem ao usuario para imputar o peso
            int servico = scanner.nextInt();
            
                
            switch (servico) {
                case 1 -> {
                    System.out.println("Escolha o valor para sacar");
                    int valor = scanner.nextInt();
                    saque = valor;
                    double atualizaSaldo = saldoConta - saque;
                    System.out.println("O seu saldo atual agora é de: "+atualizaSaldo);
                }
                case 2 -> {
                    if(saque>saldoConta){
                        System.out.println("Você não tem um valor maior do que o saldo.");
                    }else{
                        System.out.println("Escolha o valor para depositar");
                        int valor = scanner.nextInt();
                        deposito = valor;
                        double atualizaSaldo = saldoConta + deposito;
                        System.out.println("O seu saldo atual agora é de: "+atualizaSaldo);
                    }
                }
                default -> System.out.println("Este serviço não está disponível.");
            }
                
            
            
}

}
