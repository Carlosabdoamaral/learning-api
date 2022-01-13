package com.carlosamaral.api.login.Model

import javax.persistence.*

@Entity
class UserModel (
    @Id @GeneratedValue var id : Long,
    var username: String,
    var email: String? = null,
    var token : String? = null,
    var password : String
)
{
    override fun toString(): String {
        return "UserModel(id=$id, username='$username', email=$email, token=$token, password='$password')"
    }
}
