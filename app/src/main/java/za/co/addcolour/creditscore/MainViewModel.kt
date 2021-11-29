package za.co.addcolour.creditscore

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import za.co.addcolour.creditscore.data.model.CreditScoreData
import za.co.addcolour.creditscore.data.repository.MainRepository
import za.co.addcolour.creditscore.utils.NetworkHelper
import za.co.addcolour.creditscore.utils.Resource

class MainViewModel(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _creditScoreData = MutableLiveData<Resource<CreditScoreData>>()
    val creditScoreData: LiveData<Resource<CreditScoreData>>
        get() = _creditScoreData

    init {
        fetchCreditScore()
    }

    fun fetchCreditScore() {
        viewModelScope.launch {
            _creditScoreData.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getCreditScore().let {
                    if (it.isSuccessful) {
                        _creditScoreData.postValue(Resource.success(it.body()))
                    } else _creditScoreData.postValue(
                        Resource.error(
                            it.errorBody().toString(),
                            null
                        )
                    )
                }
            } else _creditScoreData.postValue(Resource.error("No internet connection", null))
        }
    }
}