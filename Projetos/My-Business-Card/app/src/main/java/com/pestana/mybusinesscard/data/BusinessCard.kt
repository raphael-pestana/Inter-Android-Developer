package com.pestana.mybusinesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard (
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    val name: String,
    val number: String,
    val email: String,
    val company: String,
    val cardBackgroung: String
)