package com.example.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.example.santanderdevweek.data.Conta
import com.example.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel(){

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaClienet() : LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}