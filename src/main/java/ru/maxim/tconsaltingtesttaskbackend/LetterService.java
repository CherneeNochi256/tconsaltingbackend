package ru.maxim.tconsaltingtesttaskbackend;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LetterService {
    public  String getAmountOfEachLetter(String str) {
        HashMap<Character, Integer> charAndAmountOfRep = new HashMap<>();

        char[] chars = str.toCharArray();

        for (Character character : chars) {
            if (charAndAmountOfRep.containsKey(character)) {
                charAndAmountOfRep.put(character, charAndAmountOfRep.get(character) + 1);
            }else{
                charAndAmountOfRep.put(character,1);
            }
        }


        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(charAndAmountOfRep.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        StringBuilder finalString = new StringBuilder();
        for (Character character: sortedMap.keySet()){
            Integer charRepeats = sortedMap.get(character);
            String stringToAppend = String.format("“%s”: %d, ", character, charRepeats);
            finalString.append(stringToAppend);
        }
        String finalStringWithoutLastComa = finalString.substring(0, finalString.length() - 2);
        return finalStringWithoutLastComa;
    }
}
