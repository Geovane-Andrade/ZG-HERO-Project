package com.acelerazg.linketinder.model

class PessoaJuridica extends Pessoa{
    String pais

    PessoaJuridica() {
    }

    PessoaJuridica(Integer id, String nome, String email, String identificador, String pais,
                   String estado, String cep, String descricao, ArrayList competencias) {
        super(id, nome, email, identificador, estado, cep, descricao, competencias)
        this.pais = pais
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
