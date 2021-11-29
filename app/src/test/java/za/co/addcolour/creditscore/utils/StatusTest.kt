package za.co.addcolour.creditscore.utils

import org.junit.Assert.assertEquals
import org.junit.Test

internal class StatusTest {

    @Test
    fun statusTestSuccess() {
        val status = Status.SUCCESS
        assertEquals(Status.valueOf("SUCCESS"), status)
        //NOTE: Change 'Status.SUCCESS' to 'Status.ERROR' to fail the test
    }
}