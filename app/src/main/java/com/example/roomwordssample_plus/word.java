package com.example.roomwordssample_plus;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class word {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo
    public String name;
//    public word(@NonNull String word1){
//        name = word1;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
