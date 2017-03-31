package com.example.android.miwok;

/**
 * Created by balaji on 3/29/17.
 */

public class Word {
    private String miwok_translation;
    private String default_translation;
    private int img_source;


    public Word(String default_tran, String miwok_tran){
        default_translation = default_tran;
        miwok_translation = miwok_tran;
    }

    public Word(String default_tran, String miwok_tran, int img_src){
        default_translation = default_tran;
        miwok_translation=miwok_tran;
        img_source = img_src;
    }

    public String get_miwok(){

        return miwok_translation;
    }

    public String get_default(){
        return default_translation;
    }

    public int get_img_source(){
        return img_source;
    }
}
