package com.acelerazg.linketinder.model


class Pessoa {
    Integer id
    String nome
    String email
    String identificador
    String estado
    String cep
    String descricao
    def competencias = new ArrayList(5)

    Pessoa() {
    }

    Pessoa(Integer id, String nome, String email, String identificador, String estado,
           String cep, String descricao, ArrayList competencias) {
        this.id = id
        this.nome = nome
        this.email = email
        this.identificador = identificador
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }



}
