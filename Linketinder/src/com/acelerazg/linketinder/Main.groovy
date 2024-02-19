package com.acelerazg.linketinder

import com.acelerazg.linketinder.controller.PessoaFisicaController
import com.acelerazg.linketinder.model.PessoaFisica
import com.acelerazg.linketinder.model.PessoaJuridica

//Geovane de Andrade
PessoaFisicaController pessoaFisicaController = new PessoaFisicaController()
PessoaJuridica pessoaJuridica = new PessoaJuridica()

println("---------------------------------")
println("Seja bem vindo! Gostaria de reproduzir o Linketinder? [S/N]");

String reproduz = System.in.newReader().readLine()

try {
    while (reproduz.equalsIgnoreCase("S")) {
        System.out.println("----------------------------------------------");
        System.out.println("Seja bem vindo! Digite o número de acordo com o que deseja: \n" +
                "[1] Listar Candidatos\n" +
                "[2] Listar Empresas\n" +
                "[3] Encerrar programa."
        )

        Integer resposta = System.in.newReader().readLine() as Integer


        println("----------------------------------------------");

        switch (resposta) {
            case 1: {
                pessoaFisicaController.preCadastrar()
                pessoaFisicaController.listarPessoas()
                break
            }
            case 2: {
                pessoaJuridica.listarPessoas()
                break
            }
            case 3: {
                reproduz = "n"
                System.out.println("Encerrando...")
                break
            }
            default: {
                System.out.println("Digite um número válido.")
            }
        }
    }
    if (reproduz.equalsIgnoreCase("n")) System.out.println("Até a próxima!")
} catch (NumberFormatException e) {
    println("Valor inválido, letras e símbolos não são aceitos! ")
}
