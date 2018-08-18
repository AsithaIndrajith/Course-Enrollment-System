/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.CalendarAdjustDateAndTime;

/**
 *
 * @author Asitha
 */
public class Season {
    
    public static boolean eligibleJulySeason(){
        if(CalendarAdjustDateAndTime.getDate().getMonth()==5 && CalendarAdjustDateAndTime.getDate().getDate()>=15){
            return true;
        }
        return false;
    }
    
    public static boolean eligibleFebruarySeason(){
        if(CalendarAdjustDateAndTime.getDate().getMonth()==0 && CalendarAdjustDateAndTime.getDate().getDate()>=15){
            return true;
        }
        return false;
    }
}
