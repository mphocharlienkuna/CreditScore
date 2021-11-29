package za.co.addcolour.creditscore

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("za.co.addcolour.creditscore", appContext.packageName)
    }

    @Test
    fun testActivityInView() {
        onView(withId(R.id.layoutMain)).check(matches(isDisplayed()))
    }

    @Test
    fun testLayoutContentMain() {
        onView(withId(R.id.layoutContentMain)).check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun testLayoutToolbar() {
        onView(withId(R.id.layoutToolbar)).check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun testLayoutContentError() {
        onView(withId(R.id.layoutContentError)).check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun testLayoutCreditScore() {
        onView(withId(R.id.layoutCreditScore)).check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun testLayoutContentProgressbar() {
        onView(withId(R.id.LayoutContentProgressbar)).check(matches(isDisplayed()))
    }
}