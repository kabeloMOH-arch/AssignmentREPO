/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment7;

class login{
    String Username;
    String Password;
    String CellNumber;

 boolean checkUsername(String Username){
     if(Username.length()==5 && Username.contains("_")){
      return true;   
     }else{
         System.out.println("Username is not properly Formatted,please ensure that your username contains an underscore and is no more than 5 characters");
     }return false;
  }
 
 boolean checkPasswordComplexity(String Password){
     if(Password.length()==8 && Password.contains("#D//")){
     return true;
     }else{
         System.out.println("Password is not properly Formatted,please ensure that your username contains an underscore and is no more than 5 characters");
     }return false;
     
 
 }
 boolean checkCellPhoneNumber(String cellPhoneNumber){
     if(cellPhoneNumber.startsWith("+") && cellPhoneNumber.length()<=10 ){
      return true;    
     }else{ System.out.println("Cellphone number does not contain international code or is not formatted correctly");
     return false;
 }

 }

 
}     

/**
 *
 * @author Admin
 */

    

