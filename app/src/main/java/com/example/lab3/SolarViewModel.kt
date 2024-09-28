package com.example.lab3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SolarViewModel : ViewModel(){
    private val _inputData = MutableLiveData<InputDataModel>(InputDataModel())

    fun updatePc(value: String) {
        _inputData.value = _inputData.value!!.copy(Pc= value.toDoubleOrNull() ?: 0.0);
    }

    fun updateσ1(value: String) {
        _inputData.value = _inputData.value!!.copy(σ1 = value.toDoubleOrNull() ?: 0.0);
    }

    fun updateσ2(value: String) {
        _inputData.value = _inputData.value!!.copy(σ2 = value.toDoubleOrNull() ?: 0.0);
    }

    fun updateB(value: String) {
        _inputData.value = _inputData.value!!.copy(B = value.toDoubleOrNull() ?: 0.0);
    }


    private fun countW1 (data: InputDataModel){
         data.Pc * 24 * data.σ1
    }



}