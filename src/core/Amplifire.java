/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author assafgoldstein
 */
public interface Amplifire {
   public int turnOn(); 
   public int turnOff(); 
   public int setVolume(int value); 
   public int setGain(int value); 
   public int setBass(int value); 
   public int setTreble(int value); 
}
