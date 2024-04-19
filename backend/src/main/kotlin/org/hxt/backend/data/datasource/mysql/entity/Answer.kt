package org.hxt.backend.data.datasource.mysql.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Answer(
        @Id var id: Long,
        @ManyToOne var question: Question,
        var answer: String,
        var isCorrect: Boolean
)