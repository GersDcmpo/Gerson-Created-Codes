/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_imperial_2_25_2019;

/**
 *
 * @author VInz
 */
public class Ball {
    private float x;
    private float y;
    private int rad;
    private float xd;
    private float yd;
    
    Ball(float x1, float y1, int rad1, float x2, float y2){
        x = x1;
        y = y1;
        rad = rad1;
        xd = x2;
        yd = y2;
    }
    
    public float getX(){
        return x;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public float getY(){
        return y;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public int getRadius(){
        return rad;
    }
    
    public void setRadius(int rad){
        this.rad = rad;
    }
    
    public float getXDelta(){
        return xd;
    }
    
    public void setXDelta(float xd){
        this.xd = xd;
    }
    
    public float getYDelta(){
        return yd;
    }
    
    public void setYDelta(float yd){
        this.yd = yd;
    }
    
    public static void main(String args[]){
        Ball bal = new Ball(23, 2, 12, 83, 32);
        System.out.println("Ball: " + bal.getX()  +" ," +" "+ bal.getY());
        System.out.println("Speed: " + bal.getXDelta()  +" ,"  + " " + bal.getYDelta());
    }
}
