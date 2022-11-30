package com.example.roomwordssample_plus;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class wordviewModel extends AndroidViewModel {
    wordRepository mWordRepository;
    private final LiveData<List<word>> mAllWords;
    public wordviewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new wordRepository(application);
        mAllWords = mWordRepository.mAllWords;
    }
    public void insert(word word){
        mWordRepository.insert(word);
    }
    public void deleteAll(){
        mWordRepository.deleteAll();
    }
    LiveData<List<word>>getAllWords(){
        return mAllWords;
    }
}
