package org.hxt.backend.data.repository

import org.hxt.backend.data.datasource.mysql.entity.Answer
import org.hxt.backend.data.datasource.mysql.entity.Question
import org.hxt.backend.domain.jparepository.AnswerJpaRepository
import org.hxt.backend.domain.repository.AnswerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class AnswerRepositoryImpl : AnswerRepository {
    @Autowired
    lateinit var answerJpaRepository: AnswerJpaRepository

    override fun getAnswerByQuestionId(question: Question): List<Answer> =
            kotlin.runCatching {
                answerJpaRepository.searchAnswerByQuestion(question.id)
            }.onFailure {
                it.printStackTrace()
            }.getOrThrow()
}