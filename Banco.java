/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author Igor Nathan da Silva Almeida
 */
public class Banco{

    public static void main(String[] args) {
        Conta contaBancaria = new Conta();
        contaBancaria.MostraSaldo();
        contaBancaria.Deposito();
        contaBancaria.Saque();
    }
}
