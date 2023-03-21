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
public class TestContainer {
    public static void main(String[] args) {
         Container a1 = new Container();
         System.out.println("Collide: "+ a1.getBall());
         System.out.println("Container[(" + a1.getX() + "," + a1.getY() + "," + a1.getWidth() + "," + a1.getHeight() + ")]");
         
     }
}
