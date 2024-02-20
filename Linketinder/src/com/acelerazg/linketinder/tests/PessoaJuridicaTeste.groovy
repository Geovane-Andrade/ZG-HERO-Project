package com.acelerazg.linketinder.tests

import com.acelerazg.linketinder.controller.PessoaJuridicaController
import com.acelerazg.linketinder.model.PessoaJuridica
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class PessoaJuridicaTeste {

    @Test
    void adicionaPessoaJuridicaTeste() {
        PessoaJuridica nvidia = new PessoaJuridica("Nvidia", "nvidia@hotmail.com",
                "85.588.461/0001-46","Brasil", "Goiás", "76600-000",
                "Empresa que atua no ramo de tecnologia", ["Typescript", "Groovy", "Grails", "Angular"])
        PessoaJuridica zgSolucoes = new PessoaJuridica("ZG Soluções", "zg@hotmail.com",
                "91.465.384/0001-37","Brasil", "Goiás", "76600-000",
                "Empresa que atua no ramo de tecnologia", ["Java", "Groovy", "Grails", "Angular", "Postgres"])
        PessoaJuridica intel = new PessoaJuridica("ZG Soluções", "zg@hotmail.com",
                "91.465.384/0001-37","Brasil", "Maranhão", "80600-000",
                "Empresa que atua no ramo de tecnologia", ["Java", "Groovy", "Spring", "React", "MariaDB"])

        PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController()
        pessoaJuridicaController.adicionarEmpresa(nvidia)
        pessoaJuridicaController.adicionarEmpresa(zgSolucoes)
        pessoaJuridicaController.adicionarEmpresa(intel)

        assertEquals(pessoaJuridicaController.getEmpresas().size(), 3)
    }
}