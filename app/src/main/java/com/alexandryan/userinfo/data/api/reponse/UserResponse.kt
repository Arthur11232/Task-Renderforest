package com.alexandryan.userinfo.data.api.reponse

import com.alexandryan.userinfo.data.api.model.User
import com.alexandryan.userinfo.data.db.entity.Info

data class UserResponse (
  val results : ArrayList<User>,
  val info    : Info?
)