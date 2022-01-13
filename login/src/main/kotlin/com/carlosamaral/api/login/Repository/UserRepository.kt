package com.carlosamaral.api.login.Repository

import com.carlosamaral.api.login.Model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long>{ }
