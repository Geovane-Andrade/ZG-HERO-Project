package com.acelerazg.linketinder.model

class PessoaFisica extends Pessoa{
    Integer idade

    PessoaFisica() {
    }

    PessoaFisica(String nome, String email, Integer idade, String identificador,
                 String estado, String cep, String descricao, ArrayList competencias) {
        super(nome, email, identificador, estado, cep, descricao, competencias)
        this.idade = idade
    }

    @Override
    void listarPessoas() {
        List<PessoaFisica> candidatos = new ArrayList()
        candidatos.add(new PessoaFisica("João", "joao@gmail.com", 29, "109.405.981-50",
                "Minas Gerais", "50498-804", "Casado, tem 3 filhos e é formado em ciências da computação", ["Java", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica("Fernanda", "fernanda@gmail.com", 20, "195.321.754-15",
                "Amazonas", "49528-650", "Solteira, cursando o 4° período de análise e desenvolvimento de sistemas", ["Groovy", "Javascript", "MySQL"]))
        candidatos.add(new PessoaFisica("Cássio", "cassio@gmail.com", 19, "267.045.938-20",
                "Paraíba", "59983-135", "Casado, não tem filhos, está cursando o 5º período de engenharia de software", ["Java", "Spring", "Angular", "Vue", "Postgres"]))
        candidatos.add(new PessoaFisica("Milena", "milena@gmail.com", 29, "109.405.98-50",
                "Pernambuco", "56878-165", "Casada, tem 1 filhos e é formada em engenharia da computação", ["Python", "Django", "React", "MongoDB"]))
        candidatos.add(new PessoaFisica("André", "andre@gmail.com", 29, "109.405.98-50",
                "Rio de Janeiro", "53654-294", "Solteiro, cursando 7º período de ciência da computação", ["PHP", "Phalcon", "MySQL"]))

        println(candidatos)
    }


    @Override
    public String toString() {
        return "candidato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", cpf='" + identificador + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", descricao='" + descricao + '\'' +
                ", competencias=" + competencias +
                '}';
    }
}
