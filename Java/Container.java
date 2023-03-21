/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

/**
 *
 * @author student
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int h;
    private int w;
    
    Container() {
        x1 = 12;
        y1 = 12;
        x2 = 25;
        y2 = 25;
        h = 50;
        w = 50;
    }
    
    public int getX1() {
        return x1;
    }
    
    public void setX1(int x1) {
        this.x1 = x1;
    }
    
    public int getY1() {
        return y1;
    }
    
    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    public int getX2() {
        return x2;
    }
    
    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    public int getY2() {
        return y2;
    }
    
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public int getWidth() {
        return w;
    }
    
    public void setWidth(int w) {
        this.w = w;
    }
    
    public int getHeight() {
        return h;
    }
    
    public void setHeight(int h) {
        this.h = h;
    }
    
    
    public static void main(String[] args) {
        
        Container rune = new Container();
        System.out.println("x1 = " + rune.getX1());
        System.out.println("y1 = " + rune.getY1());
        System.out.println("x2 = " + rune.getX2());
        System.out.println("y2 = " + rune.getY2());
        System.out.println("Width = " + rune.getWidth());
        System.out.println("Height = " + rune.getHeight());
    }

}
