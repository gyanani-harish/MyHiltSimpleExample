package gyanani.harish.hiltsmallnsimpleexample.data.repository

import kotlinx.coroutines.delay

class MainRepo {
    suspend fun getUsers(): List<String> {
        delay(500)
        return arrayListOf("Harish", "Vijay", "Parth", "Naveen")
    }
}
