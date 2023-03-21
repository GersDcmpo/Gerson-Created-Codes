/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_imperial_activities_0215;

/**
 *
 * @author VInz
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    
    public String getName(){
        name = "Roulx Kaard";
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String setEmail(){
        email = "Puzzlegodkaard@Dmail.com";
        return email;
    }
    
    public char getGender(){
        gender = 'm';
        return gender;
    }
    
    public static void main (String args[]){
        Author at = new Author();
        at.getName();
        at.getEmail();
        at.setEmail();

        System.out.println("Name:   " + at.getName());
        System.out.println("Email:  " + at.getEmail());
        System.out.println("Gender: " + at.getGender());
        
    }
}
    
    
    

