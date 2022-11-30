package com.example.roomwordssample_plus;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {word.class},version = 3,exportSchema = false)
public abstract class database extends RoomDatabase {
    public static database instance;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(4);
    static database getInstance(final Context context){
        if(instance ==null){
            synchronized (database.class){
                if(instance==null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),database.class,"data").build();
                }
            }
        }
        return instance;
    }
    public abstract dao mDao();
}
