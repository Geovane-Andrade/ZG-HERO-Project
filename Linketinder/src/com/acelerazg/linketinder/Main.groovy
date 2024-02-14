package com.acelerazg.linketinder

import com.acelerazg.linketinder.model.impl.PessoaFisica
import com.acelerazg.linketinder.model.impl.PessoaJuridica

//Geovane de Andrade
PessoaFisica pessoaFisica = new PessoaFisica()
PessoaJuridica pessoaJuridica = new PessoaJuridica()

println("---------------------------------")
println("Seja bem vindo! Gostaria de reproduzir o Linketinder? [S/N]");

String reproduz = System.in.newReader().readLine()


while (reproduz.equalsIgnoreCase("S")) {
    System.out.println("----------------------------------------------");
    System.out.println("Seja bem vindo! Digite o número de acordo com o que deseja: \n" +
            "[1] Listar Candidatos\n" +
            "[2] Listar Empresas\n" +
            "[3] Encerrar programa."
    );

    Integer resposta = System.in.newReader().readLine() as Integer
    println("----------------------------------------------");

    switch (resposta) {
        case 1: {
            pessoaFisica.listarPessoas()
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

