package za.co.addcolour.creditscore.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class CreditScoreData(
    val accountIDVStatus: String?,
    var coachingSummary: CoachingSummary?,
    var creditReportInfo: CreditReportInfo,
    val dashboardStatus: String?,
    val personaType: String?
) : Parcelable