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
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] numb = new String[10];
        ArrayList<Word> numb_list = new ArrayList<Word>();
        numb_list.add(new Word("әpә","father",R.drawable.family_father));
        numb_list.add(new Word("әṭa","mother",R.drawable.family_mother));
        numb_list.add(new Word("angsi","son",R.drawable.family_son));
        numb_list.add(new Word("tune","daughter",R.drawable.family_daughter));
        numb_list.add(new Word("taachi","older brother",R.drawable.family_older_brother));
        numb_list.add(new Word("chalitti","younger brother",R.drawable.family_younger_brother));
        numb_list.add(new Word("teṭe","older sister",R.drawable.family_older_sister));
        numb_list.add(new Word("kolliti","younger sister",R.drawable.family_younger_sister));
        numb_list.add(new Word("ama","grandmother",R.drawable.family_grandmother));
        numb_list.add(new Word("paapa","grandfather",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, numb_list,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
