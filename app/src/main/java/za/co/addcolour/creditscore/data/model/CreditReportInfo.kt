package za.co.addcolour.creditscore.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CreditReportInfo(
    var changedScore: Int?,
    var changeInLongTermDebt: Int?,
    var changeInShortTermDebt: Int?,
    var clientRef: String?,
    var currentLongTermCreditLimit: Int?,
    var currentLongTermCreditUtilisation: Int?,
    var currentLongTermDebt: Int?,
    var currentLongTermNonPromotionalDebt: Int?,
    var currentShortTermCreditLimit: Int?,
    var currentShortTermCreditUtilisation: Int?,
    var currentShortTermDebt: Int?,
    var currentShortTermNonPromotionalDebt: Int?,
    var daysUntilNextReport: Int?,
    var equifaxScoreBand: Int?,
    var equifaxScoreBandDescription: String?,
    var hasEverBeenDelinquent: Boolean?,
    var hasEverDefaulted: Boolean?,
    var maxScoreValue: Int,
    var minScoreValue: Int?,
    var monthsSinceLastDefaulted: Int?,
    var monthsSinceLastDelinquent: Int?,
    var numNegativeScoreFactors: Int?,
    var numPositiveScoreFactors: Int?,
    var percentageCreditUsed: Int?,
    var percentageCreditUsedDirectionFlag: Int?,
    var score: Int,
    var scoreBand: Int?,
    var status: String?
) : Parcelable