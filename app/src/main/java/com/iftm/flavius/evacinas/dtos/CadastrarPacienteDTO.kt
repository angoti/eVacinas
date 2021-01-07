package com.iftm.flavius.evacinas.dtos

import java.util.*


data class CadastrarPacienteDTO(
    val cpf: String,
    val nome: String,
    val apelido: String,
    val telefone: TelefoneDTO
)