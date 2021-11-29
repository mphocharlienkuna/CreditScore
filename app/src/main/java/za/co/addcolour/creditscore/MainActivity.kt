package za.co.addcolour.creditscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.koin.android.viewmodel.ext.android.viewModel
import za.co.addcolour.creditscore.data.model.CreditScoreData
import za.co.addcolour.creditscore.databinding.ActivityMainBinding
import za.co.addcolour.creditscore.utils.Status

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.lifecycleOwner = this

        setupUI()
        setupObserver()
    }

    private fun setupUI() {
        mBinding.contentToolbar.imageViewBack.setOnClickListener { onBackPressed() }
        mBinding.contentError.btnRetry.setOnClickListener { mainViewModel.fetchCreditScore() }
    }

    private fun setupObserver() {
        mainViewModel.creditScoreData.observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    mBinding.loading = false
                    it.data?.let { creditScoreData -> displayCreditScore(creditScoreData) }
                    mBinding.success = true
                }
                Status.LOADING -> {
                    mBinding.loading = true
                }
                Status.ERROR -> {
                    mBinding.loading = false
                    mBinding.error = it.message
                    mBinding.success = false
                }
            }
        })
    }

    private fun displayCreditScore(creditScoreData: CreditScoreData) {
        val score = creditScoreData.creditReportInfo.score
        val maxScoreValue = creditScoreData.creditReportInfo.maxScoreValue
        val percentage = (score.toDouble() / maxScoreValue) * 100

        mBinding.textViewScore.text = score.toString()
        mBinding.circularProgressIndicator.progress = percentage.toInt()
        mBinding.textViewScoreSubTitle.text = "out of $maxScoreValue"
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}