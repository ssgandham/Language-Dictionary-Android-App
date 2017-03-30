package com.example.android.miwok;

/**
 * Created by balaji on 3/29/17.
 */

public class Word {
    private String miwok_translation;
    private String default_translation;


    public Word(String default_tran, String miwok_tran){
        default_translation = default_tran;
        miwok_translation = miwok_tran;
    }

    public String get_miwok(){
        return miwok_translation;
    }

    public String get_default(){
        return default_translation;
    }
}
