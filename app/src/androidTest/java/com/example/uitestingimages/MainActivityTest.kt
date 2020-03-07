package com.example.uitestingimages

import android.view.View
import android.widget.ImageView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.Description
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.*

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{


    @get :Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_checkDrawableIsLoaded_intoImageView() {
        onView(withId(R.id.MainActivityImageView))
            .check(matches(hasDrawable()))
    }

    private fun hasDrawable(): BoundedMatcher<View,ImageView>{
        return object: BoundedMatcher<View, ImageView>(ImageView::class.java){
            override fun describeTo(description: Description?) {
                description?.appendText("has Drawable")
            }

            override fun matchesSafely(item: ImageView?): Boolean {
                return item?.drawable !=null
            }
        }
    }


}