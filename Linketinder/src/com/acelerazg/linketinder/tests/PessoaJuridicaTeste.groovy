package com.acelerazg.linketinder.tests

import com.acelerazg.linketinder.controller.PessoaJuridicaController
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class PessoaJuridicaTeste {

    @Test
    void adicionaPessoaJuridicaTeste() {
        PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController()


        assertTrue(pessoaJuridicaController.adicionarPessoaJuridica())
    }
}