package com.acelerazg.linketinder.tests

import com.acelerazg.linketinder.controller.PessoaFisicaController
import com.acelerazg.linketinder.model.PessoaFisica
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*
class PessoaFisicaTest {


    @Test
    void adicionaCandidatoTeste(){
        PessoaFisica claudio = new PessoaFisica("Cláudio", "claudio@hotmail.com", 35,
                "126.325.264-21", "Acre", "16593-804",
                "Casado, tem 2 filhos e cursando ciências da computação",
                ["Groovy", "Angular", "MongoDB"])
        PessoaFisica fernanda = new PessoaFisica("fernanda", "fernanda@hotmail.com", 35,
                "265.498.356-01", "Rio grande do norte", "75421-423",
                "Divorciada, tem 2 filhos e cursando engenharia de software",
                ["Java", "Spring", "MySQL"])
        PessoaFisica fabiana = new PessoaFisica("Fabiana", "fabiana@hotmail.com", 35,
                "351.274.779-43", "Ceará", "66952-005",
                "Casada, tem 1 filhos e graduada em ciências da computação",
                ["Java", "Angular", "MongoDB"])

        PessoaFisicaController pessoaFisicaController = new PessoaFisicaController()
        pessoaFisicaController.adicionarCandidato(claudio)
        pessoaFisicaController.adicionarCandidato(fernanda)
        pessoaFisicaController.adicionarCandidato(fabiana)

        assertEquals(pessoaFisicaController.getCandidatos().size(), 3)
    }
}
