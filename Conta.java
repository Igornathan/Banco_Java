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
        Scanner scanner = new Scanner(System.in);
        
    //Métodos
    //a) construtor (deve possuir entrada de valores)
        public void Conta(){
        }
        public void MostraSaldo(){
            System.out.println("O seu saldo atual é de "+saldoConta+" reais");
}
        public void Deposito(){
            System.out.println("Escolha o valor para depositar");
            int valor = scanner.nextInt();
            deposito = valor;
            double atualizaSaldo = saldoConta + deposito;
            saldoConta = atualizaSaldo;
            System.out.println("O seu saldo atual agora é de: "+atualizaSaldo);
        }
        public void Saque(){
            if(saque>saldoConta){
                System.out.println("Você não tem um valor maior do que o saldo.");
            }else{
                System.out.println("Escolha o valor para sacar");
                int valor = scanner.nextInt();
                saque = valor;
                double atualizaSaldo = saldoConta - saque;
                System.out.println("O seu saldo atual agora é de: "+atualizaSaldo);
            }
        }
}
