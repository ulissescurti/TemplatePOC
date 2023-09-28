package com.example.template.template

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class TemplateViewModel: ViewModel() {

    //todo implementar com flow tambem

    private val _eventsLiveData = MutableLiveData<Element>()
    val eventsLiveData: LiveData<Element> = _eventsLiveData

    fun sendEvent(element: Element) {
        _eventsLiveData.postValue(element)
    }
}