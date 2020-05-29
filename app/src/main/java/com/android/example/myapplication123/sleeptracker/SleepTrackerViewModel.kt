package com.android.example.myapplication123.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.android.example.myapplication123.database.SleepDatabaseDao

/**
 * ViewModel for SleepTrackerFragment.
 */
class SleepTrackerViewModel(
    val database: SleepDatabaseDao,
    application: Application) : AndroidViewModel(application) {
}