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
public class Rig {

    private KeyboardPlayer keyboardOne = new KeyboardPlayer(); 
    private KeyboardPlayer keyboardTwo = new KeyboardPlayer(); 
    private KeyboardPlayer keyboardThree = new KeyboardPlayer(); 
    
    private GuitarRig guitarOne = new GuitarRig();
    private GuitarRig guitarTwo = new GuitarRig();
    
    private MidiPlayer midiPlayer = new NullMidiPlayer();
    
    
    public int connectKeyboardToInstrument(String keyboardName, Instrument instrument){
        return -1;
    }
    
    
    public void onMidiEvent(MidiEvent event ){
        keyboardOne.onMidiEvent(event);
        keyboardTwo.onMidiEvent(event);
        keyboardThree.onMidiEvent(event);
    }
    
}
