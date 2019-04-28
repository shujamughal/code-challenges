/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intenthq.challenge;
/**
 *
 * @author shuja
 */

import java.util.List;

public class JNiceStrings {
    // From http://adventofcode.com/day/5
  //  --- Day 5: Doesn't He Have Intern-Elves For This? ---
  //
  //  Santa needs help figuring out which strings in his text file are naughty or nice.
  //
  //    A nice string is one with all of the following properties:
  //
  //    It contains at least three vowels (aeiou only), like aei, xazegov, or aeiouaeiouaeiou.
  //  It contains at least one letter that appears twice in a row, like xx, abcdde (dd), or aabbccdd (aa, bb, cc, or dd).
  //    It does not contain the strings ab, cd, pq, or xy, even if they are part of one of the other requirements.
  //    For example:
  //
  //    ugknbfddgicrmopn is nice because it has at least three vowels (u...i...o...), a double letter (...dd...), and none of the disallowed substrings.
  //  aaa is nice because it has at least three vowels and a double letter, even though the letters used by different rules overlap.
  //    jchzalrnumimnmhp is naughty because it has no double letter.
  //    haegwjzuvuyypxyu is naughty because it contains the string xy.
  //    dvszwmarrgswjxmb is naughty because it contains only one vowel.
  //    How many strings are nice?
        
  public static int nice(List<String> xs) {
      
      int niceCounts=0;
      RuleService serviceObject= new RuleServiceImp();
      for(String s: xs)
      {
         if(serviceObject.isInvalidStringNotExists(s))
         {
             boolean isVowel= serviceObject.isVowelExists(s);
             boolean isDoubleLetter = serviceObject.isConsectiveDoubleLetterExists(s);
             if(isVowel==true && isDoubleLetter==true)
             {
             niceCounts+=1;
             }
         }
         
      }
      
      return niceCounts;
    }
}
