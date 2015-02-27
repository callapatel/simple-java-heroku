package com.example.anagramsolver;

import com.example.dictionary.Dictionary;
import com.example.dictionary.EnglishDictionary;

import java.util.*;

/**
 * Created by callapatel on 2/26/15.
 */
public class AnagramSolver {
    private Dictionary dictionary;
    private Map<String, Set<String>> signatureMap;

    public AnagramSolver(Dictionary dictionary){
        this.dictionary = dictionary;
        signatureMap = new HashMap<String, Set<String>>();
        for (String text : dictionary.getAllWords()){
            String wordSignature = signature(text);
            if (!signatureMap.containsKey(wordSignature)) {
                signatureMap.put(wordSignature, new HashSet<String>()); //if we had cat, and act, we would alphabetize them and then add it to the set but if they set doesn't exsist we make one
            }
            signatureMap.get(wordSignature).add(text);
        }
    }

    public Set<String> getAnagram(String s) {
        String signature = signature(s);
        if (signatureMap.containsKey(signature)) {
            return signatureMap.get(signature);
        }
        return new HashSet<String>();
    }
    private static String signature(String s) {
        char [] characters = s.toLowerCase().toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    public static void main(String[] args) {

        }


}


