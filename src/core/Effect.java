/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import javax.sound.midi.*;
/**
 *
 * @author assafgoldstein
 */
public interface Effect {
    
    public int start();
    public int stop();
    public int changeParamValue(String name, String value);
    public void onMidiEvent(MidiEvent event);
    
    
}
