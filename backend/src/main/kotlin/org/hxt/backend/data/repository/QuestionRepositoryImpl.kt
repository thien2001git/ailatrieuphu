package org.hxt.backend.data.repository

import org.hxt.backend.data.datasource.mysql.entity.Question
import org.hxt.backend.domain.jparepository.QuestionJpaRepository
import org.hxt.backend.domain.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class QuestionRepositoryImpl : QuestionRepository {
    @Autowired
    lateinit var questionJpaRepository: QuestionJpaRepository

    override fun getAllQuestion(): List<Question> = kotlin.runCatching {
        questionJpaRepository.findAll()
    }.onFailure {
        it.printStackTrace()
    }.getOrThrow()

    override fun getQuestionById(id: Long): Question = kotlin.runCatching {
        questionJpaRepository.findById(id)
    }.map {
        it.get()
    }.onFailure {
        it.printStackTrace()
    }.getOrThrow()
}