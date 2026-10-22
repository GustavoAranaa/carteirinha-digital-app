package com.gustavoArana.carteirinhadigital2devest.app.di

import com.gustavoArana.carteirinhadigital2devest.core.auth.SessionTokenStore
import com.gustavoArana.carteirinhadigital2devest.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.gustavoArana.carteirinhadigital2devest.feature.login.domain.repository.LoginRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
}
