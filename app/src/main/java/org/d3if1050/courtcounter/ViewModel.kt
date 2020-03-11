package org.d3if1050.courtcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    private val _textA = MutableLiveData<Int>()
    private val _textB = MutableLiveData<Int>()

    val teksA : LiveData<Int>
        get() = _textA
    init {
        _textA.value= 0
    }
    val teksB : LiveData<Int>
        get() = _textB

    init {
        _textB.value= 0
    }

    fun tambahTigaA(){
        _textA.value = _textA.value?.plus(3)
    }
    fun tambahTigaB(){
        _textB.value = _textB.value?.plus(3)
    }

    fun tambahDuaA(){
        _textA.value = _textA.value?.plus(2)
    }
    fun tambahDuaB(){
        _textB.value = _textB.value?.plus(2)
    }

    fun tambahSatuA(){
        _textA.value = _textA.value?.plus(1)
    }
    fun tambahSatuB(){
        _textB.value = _textB.value?.plus(1)
    }


    fun reset(){
        _textA.value =0
        _textB.value =0
    }
}