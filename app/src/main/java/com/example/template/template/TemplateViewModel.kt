package com.example.template.template

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class TemplateViewModel: ViewModel() {

    private val _eventsLiveData = MutableLiveData<Element>()
    val eventsLiveData: LiveData<Element> = _eventsLiveData

    private val _eventsSharedFlow = MutableSharedFlow<Element>()
    val eventsSharedFlow: MutableSharedFlow<Element> = _eventsSharedFlow

    fun sendEvent(element: Element) {
        _eventsLiveData.postValue(element)
    }

    fun emitEvent(element: Element) {
        viewModelScope.launch {
            _eventsSharedFlow.emit(element)
        }
    }
}