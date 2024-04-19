package org.hxt.backend.presentation.controller

import org.hxt.backend.domain.usecase.GetQuestionAndAnswerUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class QuestionController {
    @Autowired
    lateinit var getQuestionAndAnswerUseCase: GetQuestionAndAnswerUseCase

    @GetMapping("/quiz/{id}")
    fun getQuestionById(@PathVariable id: String) = kotlin.run {
        getQuestionAndAnswerUseCase.invoke(id.toLong())
    }
}