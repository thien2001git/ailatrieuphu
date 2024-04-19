package org.hxt.backend.domain.repository

import org.hxt.backend.data.datasource.mysql.entity.Question
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository {
    fun getAllQuestion(): List<Question>

    fun getQuestionById(id: Long): Question
}