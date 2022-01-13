package com.carlosamaral.api.login.Controller

import com.carlosamaral.api.login.Model.UserModel
import com.carlosamaral.api.login.Repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.lang.Error

@RestController
@RequestMapping("/user")
@CrossOrigin
class UserController(private val _UserRepository: UserRepository) {

    @GetMapping
    fun allUsers() : List<UserModel> {
        return _UserRepository.findAll()
    }

    @PostMapping
    fun setUser(@RequestBody u : UserModel) : HttpStatus {
        try {
            _UserRepository.save(u)
            return HttpStatus.ACCEPTED;
        } catch (e : Error) {
            return HttpStatus.CONFLICT;
        }
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id : Long) : HttpStatus {
        try {
            _UserRepository.deleteById(id)
            return HttpStatus.ACCEPTED
        } catch (e : Error) {
            return HttpStatus.CONFLICT
        }
    }
}
