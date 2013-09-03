/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import instruments.*;
import midiplayers.*;
import javax.sound.midi.*;

/**
 *
 * @author assafgoldstein
 */
public class Rack implements MidiDeviceConnection{

    private KeyboardPlayer keyboardOne = new KeyboardPlayer(); 
    private KeyboardPlayer keyboardTwo = new KeyboardPlayer(); 
    private KeyboardPlayer keyboardThree = new KeyboardPlayer(); 
    
    private GuitarRig guitarOne = new GuitarRig();
    private GuitarRig guitarTwo = new GuitarRig();
    
    private MidiPlayer midiPlayer = new NullMidiPlayer();
    
    
    
    public int connectKeyboardToInstrument(String keyboardName, Instrument instrument){
        return -1;
    }
    
    
   
    
    //
    // MidiDevice Implementation
    // 
    public void loadLastSession(){
        System.out.println("LOADING PREVIOUS SESSION");
    }

    public void onDeviceConnected(String name, String make, int usb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onDeviceDisconnected(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onMidiEvent(MidiEvent event) {
        throw new UnsupportedOperationException("Pass Midi Event to all instruments in the rack");
    }
    
    
}
