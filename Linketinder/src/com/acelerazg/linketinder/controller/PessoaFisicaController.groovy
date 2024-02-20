package com.acelerazg.linketinder.controller

import com.acelerazg.linketinder.model.PessoaFisica
import com.acelerazg.linketinder.model.PessoaJuridica

class PessoaFisicaController {
    List<PessoaFisica> candidatos = new ArrayList()

    void preCadastrarCandidatos() {
        candidatos.add(new PessoaFisica("João", "joao@gmail.com", 29, "109.405.981-50",
                "Minas Gerais", "50498-804", "Casado, tem 3 filhos e é formado em ciências da computação",
                ["Java", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica("Fernanda", "fernanda@gmail.com", 20, "195.321.754-15",
                "Amazonas", "49528-650", "Solteira, cursando o 4° período de análise e desenvolvimento de sistemas",
                ["Groovy", "Javascript", "MySQL"]))
        candidatos.add(new PessoaFisica("Cássio", "cassio@gmail.com", 19, "267.045.938-20",
                "Paraíba", "59983-135", "Casado, não tem filhos, está cursando o 5º período de engenharia de software",
                ["Java", "Spring", "Angular", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica("Milena", "milena@gmail.com", 29, "109.405.98-50",
                "Pernambuco", "56878-165", "Casada, tem 1 filhos e é formada em engenharia da computação",
                ["Python", "Django", "React", "MongoDB"]))
        candidatos.add(new PessoaFisica("André", "andre@gmail.com", 29, "109.405.98-50",
                "Rio de Janeiro", "53654-294", "Solteiro, cursando 7º período de ciência da computação",
                ["PHP", "Phalcon", "MySQL"]))
    }

    void adicionarCandidato(PessoaFisica pessoaFisica) {
        candidatos.add(pessoaFisica)
    }

    PessoaFisica criarCandidato() {
        try {
            println("Qual o nome?\n")
            String nome = System.in.newReader().readLine()

            println("----------------------------")
            println("Qual o email?\n")
            String email = System.in.newReader().readLine()

            println("----------------------------")
            println("Qual a idade?\n")
            Integer idade = System.in.newReader().readLine() as Integer

            println("----------------------------")
            println("Qual o cpf?")
            String cpf = System.in.newReader().readLine()

            for (PessoaFisica candidato : (candidatos as List<PessoaFisica>)) {
                while (candidato.identificador.equals(cpf)) {
                    println("Esse cpf já existe! Registre outros valores!")
                    cpf = System.in.newReader().readLine()
                }
            }
            println("----------------------------")
            println("Qual estado reside? ")
            String estado = System.in.newReader().readLine()

            println("----------------------------")
            println("Qual o cep? ")
            String cep = System.in.newReader().readLine()

            println("----------------------------")
            println("Faça uma descrição breve.")
            String descricao = System.in.newReader().readLine()

            println("----------------------------")
            println("Quantas competências deseja cadastrar? ")
            Integer quantidadeCompetencias = System.in.newReader().readLine() as Integer
            ArrayList<String> competenciasParaAdicionar = new ArrayList(5)

            for (int i = 1; i <= quantidadeCompetencias; i++) {
                println("Qual a " + i + "º competência?")
                String competencia = System.in.newReader().readLine()
                competenciasParaAdicionar.add(competencia)
            }

            return new PessoaFisica( nome, email, idade, cpf,
                    estado, cep, descricao, competenciasParaAdicionar)

        } catch (NumberFormatException ignored) {
            println("Valor inválido, letras e símbolos não são aceitos! ")
        }
    }


    void listarPessoas() {
        println(candidatos)
    }
}
