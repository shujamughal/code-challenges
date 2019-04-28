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
public interface RuleService {
    
    public boolean isVowelExists(String str);
    public boolean isConsectiveDoubleLetterExists(String str);
    public boolean isInvalidStringNotExists(String str);
}
