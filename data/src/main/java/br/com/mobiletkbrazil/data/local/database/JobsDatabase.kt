package br.com.mobiletkbrazil.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.mobiletkbrazil.data.local.model.AndroidJobCache

@Database(version = 1, entities = [AndroidJobCache::class])
abstract class JobsDatabase : RoomDatabase() {
    abstract fun jobsDao(): JobsDao

    companion object {
        fun createDatabase(context: Context) : JobsDao {
            return Room
                .databaseBuilder(context, JobsDatabase::class.java, "jobs.db")
                .build()
                .jobsDao()
        }
    }
}