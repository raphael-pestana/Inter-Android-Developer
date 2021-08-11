package com.pestana.mybusinesscard

import android.app.Application
import com.pestana.mybusinesscard.data.AppDatabase
import com.pestana.mybusinesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}