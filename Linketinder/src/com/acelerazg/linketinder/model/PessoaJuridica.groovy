package com.acelerazg.linketinder.model

class PessoaJuridica extends Pessoa{
    String pais

    PessoaJuridica() {
    }

    PessoaJuridica( String nome, String email, String identificador, String pais,
                   String estado, String cep, String descricao, ArrayList competencias) {
        super( nome, email, identificador, estado, cep, descricao, competencias)
        this.pais = pais
    }


    @Override
    public String toString() {
        return "Empresa{" +
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
