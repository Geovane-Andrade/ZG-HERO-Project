package com.acelerazg.linketinder

import com.acelerazg.linketinder.controller.PessoaFisicaController
import com.acelerazg.linketinder.controller.PessoaJuridicaController

//Geovane de Andrade
PessoaFisicaController pessoaFisicaController = new PessoaFisicaController()
PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController()
pessoaFisicaController.preCadastrarCandidatos()
pessoaJuridicaController.preCadastrarEmpresas()

println("---------------------------------")
println("Seja bem vindo! Gostaria de reproduzir o Linketinder? [S/N]");

String reproduz = System.in.newReader().readLine()

try {
    while (reproduz.equalsIgnoreCase("S")) {
        println("----------------------------------------------");
        println("Seja bem vindo! Digite o número de acordo com o que deseja: \n" +
                "[1] Listar Candidatos\n" +
                "[2] Listar Empresas\n" +
                "[3] Criar Candidato\n" +
                "[4] Criar Empresa\n" +
                "[5] Encerrar programa."
        )

        Integer resposta = System.in.newReader().readLine() as Integer

        println("----------------------------------------------");

        switch (resposta) {
            case 1: {
                pessoaFisicaController.listarPessoas()
                break
            }
            case 2: {
                pessoaJuridicaController.listarPessoas()
                break
            }
            case 3:{
                pessoaFisicaController.adicionarCandidato(pessoaFisicaController.criarCandidato())
                break
            }
            case 4:{
                pessoaJuridicaController.adicionarEmpresa(pessoaJuridicaController.criarEmpresa())
                break
            }
            case 5: {
                reproduz = "n"
                println("Encerrando...")
                break
            }
            default: {
                println("Digite um número válido.")
            }
        }
    }
    if (reproduz.equalsIgnoreCase("n")) println("Até a próxima!")
} catch (NumberFormatException ignored) {
    println("Valor inválido, letras e símbolos não são aceitos! ")
}
