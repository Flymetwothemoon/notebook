package com.example.roomwordssample_plus;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

public class wordRepository {
    public dao mDao;
    public LiveData<List<word>> mAllWords;
 wordRepository(Context context){
     database database = com.example.roomwordssample_plus.database.getInstance(context.getApplicationContext());
     mDao = database.mDao();
     mAllWords = database.mDao().getAlphabetizedWords();
 }
 void deleteAll(){
     database.databaseWriteExecutor.execute(()-> mDao.deleteAll());
 }
 void insert(word word){
     database.databaseWriteExecutor.execute(()-> mDao.insert(word));
 }
 LiveData<List<word>>getAllWords(){
     return mAllWords;
    }

}
