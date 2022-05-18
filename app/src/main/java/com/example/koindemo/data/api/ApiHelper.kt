package com.example.koindemo.data.api

import com.example.koindemo.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers():Response<List<User>>
}