package org.hxt.backend.domain.jparepository

import org.hxt.backend.data.datasource.mysql.entity.Answer
import org.hxt.backend.data.datasource.mysql.entity.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface AnswerJpaRepository: JpaRepository<Answer, Long> {
//    @Query(nativeQuery = true, value = "select * from Answer where question_id = question")
    @Query(value = "select a from Answer a where a.question.id = ?1")
    fun searchAnswerByQuestion(question: Long): List<Answer>
}