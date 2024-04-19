package org.hxt.backend.domain.usecase

import org.hxt.backend.data.datasource.mysql.entity.Answer
import org.hxt.backend.domain.repository.AnswerRepository
import org.hxt.backend.domain.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class GetQuestionAndAnswerUseCase {
    @Autowired
    lateinit var questionRepository: QuestionRepository

    @Autowired
    lateinit var answerRepository: AnswerRepository

    operator fun invoke(id: Long): List<Answer> = kotlin.runCatching {
        questionRepository.getQuestionById(id)
    }.map {
        answerRepository.getAnswerByQuestionId(it)
    }.onFailure {
        it.printStackTrace()
    }.getOrThrow()
}