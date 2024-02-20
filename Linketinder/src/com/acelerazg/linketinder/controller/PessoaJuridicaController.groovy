package com.acelerazg.linketinder.controller


import com.acelerazg.linketinder.model.PessoaJuridica

class PessoaJuridicaController {
    List<PessoaJuridica> empresas = new ArrayList()

    void preCadastrarEmpresas() {
        empresas.add(new PessoaJuridica(1,"Coca-cola", "Coca-cola@gmail.com","65.258.462/0001-59",
                "Brasil", "Bahia", "49528-650","Empresa voltada para o ramo de refrigerantes", ["Java", "Vue", "Postgres"]))
        empresas.add(new PessoaJuridica(2,"Phillips", "Phillips@gmail.com", "79.677.165/0001-52","Brasil",
                "Amazonas", "46529-650", "Empresa voltada para o ramo tecnológico", ["Groovy", "Javascript", "MySQL"]))
        empresas.add(new PessoaJuridica(3,"LG", "lg@gmail.com", "10.484.674/0001-62", "Brasil",
                "Paraíba", "59983-135", "Empresa voltada para o ramo tecnológico", ["Java", "Spring", "Angular", "Vue", "Postgres"]))
        empresas.add(new PessoaJuridica(4,"Tesla", "tesla@gmail.com" , "75.932.899/0001-80", "Brasil",
                "Pernambuco", "56878-165", "Empresa voltada para o ramo de produção de carros elétricos", ["Python", "Django", "React", "MongoDB"]))
        empresas.add(new PessoaJuridica(5,"Banco do Brasil", "bb@gmail.com", "00.554.998/0001-76", "Brasil",
                "Rio de Janeiro", "53654-294", "Empresa voltada para o setor bancário", ["PHP", "Phalcon", "MySQL"]))

    }


    void adicionarEmpresa(PessoaJuridica pessoaJuridica) {
        empresas.add(pessoaJuridica)
    }

    PessoaJuridica criarEmpresa() {
        System.out.println("Qual o id da empresa? [Somente números acima de 6]\n")
        Integer id = System.in.newReader().readLine() as Integer
        int i = 0
        while (id > 0 && id < 6 || empresas.contains(id)) {
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
        System.out.println("Qual a CNPJ?\n")
        String cnpj = System.in.newReader().readLine()

        System.out.println("----------------------------")
        System.out.println("Qual o país?")
        String pais = System.in.newReader().readLine()

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
            println("Qual a " + i+1 + " competência?")
            String competencia = System.in.newReader().readLine()
            competenciasParaAdicionar.add(competencia)
        }

        return new PessoaJuridica(id, nome, email, cnpj, pais,
                estado, cep, descricao, competenciasParaAdicionar)
    }


    void listarPessoas() {
        println(empresas)
    }
}
