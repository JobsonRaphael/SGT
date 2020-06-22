/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author PICHAU
 */
public class Util {
    
    
 public boolean isNull(String a){
    
     if(a.equals("") || a == null){
         return true;
     }else{
     return false;
        }   
 }
 
 public boolean isNull(int a){
    
     if(a == 0){
         return true;
     }else{
         return false;
     }   
 } 
    
 
}
