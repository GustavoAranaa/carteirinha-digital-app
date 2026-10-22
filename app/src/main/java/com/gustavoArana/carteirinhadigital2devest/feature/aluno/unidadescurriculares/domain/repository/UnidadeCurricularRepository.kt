package com.gustavoArana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.domain.repository

import com.gustavoArana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listar():Result<List<UnidadeCurricular>>
}