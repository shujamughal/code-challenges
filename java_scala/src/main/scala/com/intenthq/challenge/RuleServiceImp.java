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
public class RuleServiceImp implements RuleService{

    
    public boolean isVowelExists(String str) {
        boolean answer = false;
         
         int vowelCount = 0;
         String vowelString =String.valueOf(Constants.vowelArray);
         for (char ch: str.toCharArray()) {
          
             if(vowelString.contains(Character.valueOf(ch).toString()))
             {
             vowelCount += 1;
             }
             if (vowelCount==3)
             {
             answer=true;
             break;
             }
         }
         return answer;
    }

    public boolean isConsectiveDoubleLetterExists(String str) 
    {
            boolean answer = false;
    
    for(int i =0;i < (str.length()-1); i ++)
    {
     if (str.charAt(i) == str.charAt((i+1)))
         {
         answer=true;
         break;
         }
    }
    
    
    return answer;

    }

    
    public boolean isInvalidStringNotExists(String str) {
         boolean answer = true;
    
         
        for (String s:  Constants.invalidStrings) 
        {
         if(str.contains(s))
         {
         answer=false;
         break;
         }
        }
    
    
    return answer;

    }
    
}
