package com.example.heroku.patel.com.dictionary;

import java.util.Set;

/**
 * Created by callapatel on 2/26/15.
 */
public interface Dictionary {
    public boolean isWord(String s);
    public Set<String> getAllWords();
}
