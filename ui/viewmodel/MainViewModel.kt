package gyanani.harish.hiltsmallnsimpleexample.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import gyanani.harish.hiltsmallnsimpleexample.data.repository.MainRepo
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepo,
) : ViewModel() {
    private val _users = MutableLiveData<List<String>>()
    val users: LiveData<List<String>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.postValue(arrayListOf("LOADING"))
            mainRepository.getUsers().let {
                _users.postValue(listOf(it.asSequence()
                    .filter{ str->
                        str.isNotEmpty()
                    }
                    .joinToString(separator = ", ")))
            }
        }
    }
}
