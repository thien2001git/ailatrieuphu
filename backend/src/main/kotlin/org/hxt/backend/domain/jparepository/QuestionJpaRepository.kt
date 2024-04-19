package org.hxt.backend.domain.jparepository

import org.hxt.backend.data.datasource.mysql.entity.Question
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionJpaRepository: JpaRepository<Question, Long> {

}