package org.hxt.backend.data.datasource.mysql.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Question(
        @Id var id: Long,
        var question: String
)