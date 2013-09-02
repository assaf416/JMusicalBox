/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import instruments.*;
import effects.*;
import javax.sound.midi.*;

/**
 *
 * @author assafgoldstein
 */
public class KeyboardPlayer {
    
  private Instrument instrument = new NullInstrument();
  private Effect effectOne = new NullEffect();
  private Effect effectTwo = new NullEffect();
  private int transpose = 0;
  
  
  
  public void setup(String fileName){
      
  }
  
  
  public void loadSetup(String fileName){
      
  }
  
  
  public void saveSetupAs(String fileName){
      
  }
  
  
  public void loadSound(String soundName){
      
  }
  
  public void changeToQuickSound(int n){
      
  }
  
  public void setVolume(int volume){
      
  }
  
  public void transpose(int key){
      
  }
    
  public void onMidiEvent(MidiEvent event){
  }
  
  
}
