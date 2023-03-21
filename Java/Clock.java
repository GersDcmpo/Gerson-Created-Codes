/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enabling;

/**
 *
 * @author Sherry
 */
public class Clock {
  //members data members / method members
    private int hours;
    private int minutes;
    private int seconds;
    
  //getter methods
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
       return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void setTime(int hr, int min, int sec){
        if (hr >=0 && hr <24)
            hours = hr; //this method accepts the value if it is valid
        else
            hours =0;  //if the value is invalid, hours will be set to 0
        
        
        if (min >=0 && min < 60)
            minutes = min;//this method accepts the value if it is valid
        else 
            minutes = 0;//if the value is invalid, hours will be set to 0
        
         if (sec >=0 && sec < 60)
            seconds = sec;//this method accepts the value if it is valid
        else 
            seconds = 0;//if the value is invalid, hours will be set to 0
    }
    
    public void printTime(){
        if (hours < 10)
            System.out.print("0");
        System.out.print(hours + ":");
        
        if (minutes < 10)
            System.out.print("0");
        System.out.print(minutes + ":");
        
        if (seconds < 10)
            System.out.print("0");
        System.out.print(seconds + ":");
            
    }

    public void incrementHours()
    {
        this.hours++;
        if (this.hours >= 24)
        {
            this.hours = 0;
        }
    }

    public String getTime(){
        String time ="";
        if (hours < 10)
            time = time + "0";
        time = time + hours + ":";
        
        if (minutes < 10)
            time = time + "0";
        time = time + minutes + ":";
        
        if (seconds < 10)
            time = time + "0";
        time = time + seconds;
      
        return time;            
    }
}




