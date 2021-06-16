package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Ludmila")
        val cartao = Cartao("21567-0")
        return Conta (
            "12354-7",
            "3381",
            "R$2.500,00",
            "5.000,00",
            cliente,
            cartao
        );

    }

}