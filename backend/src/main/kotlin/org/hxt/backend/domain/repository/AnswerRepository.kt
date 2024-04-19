package org.hxt.backend.domain.repository

import org.hxt.backend.data.datasource.mysql.entity.Answer
import org.hxt.backend.data.datasource.mysql.entity.Question
import org.springframework.stereotype.Repository

@Repository
interface AnswerRepository {
    fun getAnswerByQuestionId(question: Question): List<Answer>
}