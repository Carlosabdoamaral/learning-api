package com.carlosamaral.api.login.Controller

import com.carlosamaral.api.login.Model.UserModel
import com.carlosamaral.api.login.Repository.UserRepository
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.lang.Error
import java.util.*

@RestController
@CrossOrigin
@RequestMapping("/auth")
class AuthController(private val _UserRepository : UserRepository) {

    @GetMapping
    fun login(@RequestBody u : UserModel) : HttpStatus {
        if (true) {
            return HttpStatus.ACCEPTED
        } else {
            return HttpStatus.CONFLICT
        }
    }
}
