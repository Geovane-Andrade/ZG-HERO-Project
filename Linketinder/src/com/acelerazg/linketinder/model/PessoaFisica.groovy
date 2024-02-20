package com.acelerazg.linketinder.model

class PessoaFisica extends Pessoa {
    Integer idade

    PessoaFisica() {
    }

    PessoaFisica( String nome, String email, Integer idade, String identificador,
                 String estado, String cep, String descricao, ArrayList competencias) {
        super( nome, email, identificador, estado, cep, descricao, competencias)
        this.idade = idade
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
