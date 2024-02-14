package com.acelerazg.linketinder.model

class PessoaJuridica extends Pessoa{
    String pais

    PessoaJuridica() {
    }

    PessoaJuridica(String nome, String email, String identificador, String pais,
                   String estado, String cep, String descricao, ArrayList competencias) {
        super(nome, email, identificador, estado, cep, descricao, competencias)
        this.pais = pais
    }

    @Override
    void listarPessoas() {
        List<PessoaJuridica> empresas = new ArrayList()
        empresas.add(new PessoaJuridica("Coca-cola", "Coca-cola@gmail.com","65.258.462/0001-59",
                "Brasil", "Bahia", "49528-650","Empresa voltada para o ramo de refrigerantes", ["Java", "Vue", "Postgres"]))
        empresas.add(new PessoaJuridica("Phillips", "Phillips@gmail.com", "79.677.165/0001-52","Brasil",
                "Amazonas", "46529-650", "Empresa voltada para o ramo tecnológico", ["Groovy", "Javascript", "MySQL"]))
        empresas.add(new PessoaJuridica("LG", "lg@gmail.com", "10.484.674/0001-62", "Brasil",
                "Paraíba", "59983-135", "Empresa voltada para o ramo tecnológico", ["Java", "Spring", "Angular", "Vue", "Postgres"]))
        empresas.add(new PessoaJuridica("Tesla", "tesla@gmail.com" , "75.932.899/0001-80", "Brasil",
                "Pernambuco", "56878-165", "Empresa voltada para o ramo de produção de carros elétricos", ["Python", "Django", "React", "MongoDB"]))
        empresas.add(new PessoaJuridica("Banco do Brasil", "bb@gmail.com", "00.554.998/0001-76", "Brasil",
                "Rio de Janeiro", "53654-294", "Empresa voltada para o setor bancário", ["PHP", "Phalcon", "MySQL"]))

        println(empresas)
    }

    @Override
    public String toString() {
        return "candidato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cnpj='" + identificador + '\'' +
                ", pais=" + pais +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", descricao='" + descricao + '\'' +
                ", competencias=" + competencias +
                '}';
    }
}
