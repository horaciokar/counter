package com.curso.android.app.practica.counter.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.curso.android.app.practica.counter.model.Counter
import kotlinx.coroutines.launch
import java.util.Date

class MainViewModel: ViewModel() {

    private var text1 = ""
    private var text2 = ""

    fun setText1(text: String) {
        text1 = text
    }

    fun setText2(text: String) {
        text2 = text
    }
    fun areTextsEqual(): Boolean {
        return text1 == text2
    }
}
