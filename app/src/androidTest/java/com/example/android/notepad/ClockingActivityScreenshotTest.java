package com.example.android.notepad;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.google.android.libraries.cloudtesting.screenshots.ScreenShotter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;

/**
 * Created by tparker on 5/9/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClockingActivityScreenshotTest {

    @Rule
    public ActivityTestRule<NotesList> activityRule = new ActivityTestRule<NotesList>(NotesList.class);

    @Test
    public void takeScreenshot() {
        onView(isRoot());
        ScreenShotter.takeScreenshot("main_screen_3", activityRule.getActivity());
    }
}
