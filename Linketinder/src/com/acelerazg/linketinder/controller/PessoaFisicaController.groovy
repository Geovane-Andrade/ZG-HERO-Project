package com.acelerazg.linketinder.controller

import com.acelerazg.linketinder.model.PessoaFisica

class PessoaFisicaController {
    List<PessoaFisica> candidatos = new ArrayList()

    void preCadastrar() {
        candidatos.add(new PessoaFisica(1, "João", "joao@gmail.com", 29, "109.405.981-50",
                "Minas Gerais", "50498-804", "Casado, tem 3 filhos e é formado em ciências da computação",
                ["Java", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica(2, "Fernanda", "fernanda@gmail.com", 20, "195.321.754-15",
                "Amazonas", "49528-650", "Solteira, cursando o 4° período de análise e desenvolvimento de sistemas",
                ["Groovy", "Javascript", "MySQL"]))
        candidatos.add(new PessoaFisica(3, "Cássio", "cassio@gmail.com", 19, "267.045.938-20",
                "Paraíba", "59983-135", "Casado, não tem filhos, está cursando o 5º período de engenharia de software",
                ["Java", "Spring", "Angular", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica(4, "Milena", "milena@gmail.com", 29, "109.405.98-50",
                "Pernambuco", "56878-165", "Casada, tem 1 filhos e é formada em engenharia da computação",
                ["Python", "Django", "React", "MongoDB"]))
        candidatos.add(new PessoaFisica(5, "André", "andre@gmail.com", 29, "109.405.98-50",
                "Rio de Janeiro", "53654-294", "Solteiro, cursando 7º período de ciência da computação",
                ["PHP", "Phalcon", "MySQL"]))
    }

    void adicionarCandidato(PessoaFisica pessoaFisica) {
        candidatos.add(pessoaFisica)
    }

    void criarCandidato() {
        System.out.println("Qual o id da pessoa candidata? [Somente números acima de 6]\n")
        Integer id = System.in.newReader().readLine() as Integer
        int i = 0
        while (id > 0 && id < 6 || candidatos.contains(id)) {
            println("Valor já cadastrado! Digite um valor válido.")
            id = System.in.newReader().readLine() as Integer
        }

        System.out.println("----------------------------")
        System.out.println("Qual o nome?\n")
        String nome = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Qual o email?\n")
        String email = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Qual a idade?\n")
        Integer idade = System.in.newReader().readLine() as Integer

        System.out.println("----------------------------")
        System.out.println("Qual o cpf?")
        String identificador = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Qual estado reside? ")
        String estado = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Qual o cep? ")
        String cep = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Faça uma descrição breve.")
        String descricao = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Quantas competências deseja cadastrar? ")
        Integer quantidadeCompetencias = System.in.newReader().readLine() as Integer
        ArrayList<String> competenciasParaAdicionar = new ArrayList(5)

        for (i = 0; i < quantidadeCompetencias; i++) {
            println("Qual a " + i + " competência?")
            String competencia = System.in.newReader().readLine()
            competenciasParaAdicionar.add(competencia)
        }

        candidatos.add(new PessoaFisica(id, nome, email, idade, identificador,
                estado, cep, descricao, competenciasParaAdicionar))
    }


    void listarPessoas() {
        println(candidatos)
    }
}
