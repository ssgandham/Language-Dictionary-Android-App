/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] numb = new String[10];
        ArrayList<Word> numb_list = new ArrayList<Word>();
        numb_list.add(new Word("lutti", "one", R.drawable.number_one));
        numb_list.add(new Word("ottiko", "two", R.drawable.number_two));
        numb_list.add(new Word("toolokosu","three", R.drawable.number_three));
        numb_list.add(new Word("oyyisa","four", R.drawable.number_four));
        numb_list.add(new Word("massokka","five", R.drawable.number_five));
        numb_list.add(new Word("temmokka","six", R.drawable.number_six));
        numb_list.add(new Word("kenekaku","seven", R.drawable.number_seven));
        numb_list.add(new Word("kawinta","eight", R.drawable.number_eight));
        numb_list.add(new Word("wo'e","nine", R.drawable.number_nine));
        numb_list.add(new Word("na'aacha","ten", R.drawable.number_ten));




        WordAdapter itemsAdapter = new WordAdapter(this, numb_list);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
