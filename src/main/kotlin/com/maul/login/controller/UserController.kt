package com.maul.login.controller

import com.maul.login.model.UserModel
import com.maul.login.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController(@Autowired val userRepository: UserRepository) {
    @PostMapping("/register")
    fun register(
            @RequestParam("username") username: String,
            @RequestParam("password") password: String
    ): UserModel {
        val user = UserModel(username = username, password = password)
        return userRepository.save(user)
    }

    @GetMapping("/user/{id}")
    fun getUserWithId(
            @PathVariable("id") id: Int
    ): UserModel {
        return userRepository.findById(id).get()
    }
}