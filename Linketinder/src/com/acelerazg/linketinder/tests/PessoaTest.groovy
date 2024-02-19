package com.acelerazg.linketinder.tests

import com.acelerazg.linketinder.model.PessoaFisica
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*
class PessoaTest {


    @Test
    void adicionaCandidatoNalistaTeste(){
        PessoaFisica candidato = new PessoaFisica(6,"Cláudio", "claudio@hotmail.com", 35,
                "126.325.264-21", "Japão", "16593-804",
                "Casado, tem 2 filhos e cursando ciências da computação",
                ["Groovy", "Angular", "MongoDB"])

        candidato.adicionarCandidato()

        assertEquals(candidato.id, 6)
    }
}
