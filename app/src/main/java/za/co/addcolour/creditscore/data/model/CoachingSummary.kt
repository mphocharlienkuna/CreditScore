package za.co.addcolour.creditscore.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoachingSummary(
    var activeTodo: Boolean?,
    var activeChat: Boolean?,
    var numberOfCompletedTodoItems: Int?,
    var numberOfTodoItems: Int?,
    var selected: Boolean?
) : Parcelable