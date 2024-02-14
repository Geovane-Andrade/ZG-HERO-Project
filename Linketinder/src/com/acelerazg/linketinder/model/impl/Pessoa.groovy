package com.acelerazg.linketinder.model.impl

import com.acelerazg.linketinder.model.PessoaInterface

class Pessoa implements PessoaInterface{

    String nome
    String email
    String identificador
    String estado
    String cep
    String descricao
    def competencias = new ArrayList(5)

    Pessoa() {
    }

    Pessoa(String nome, String email, String identificador, String estado,
           String cep, String descricao, ArrayList competencias) {
        this.nome = nome
        this.email = email
        this.identificador = identificador
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }

    @Override
    void listarPessoas() {

    }


}
