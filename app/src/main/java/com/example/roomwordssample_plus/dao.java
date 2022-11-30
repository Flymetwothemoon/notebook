package com.example.roomwordssample_plus;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(word...words);
    @Query("Delete from word")
    public void deleteAll();
    @Query("Select * FROM word ORDER BY name asc")
    LiveData<List<word>> getAlphabetizedWords();

}
