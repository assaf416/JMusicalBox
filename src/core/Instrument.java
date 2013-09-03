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
public interface Instrument {
    
    public int start();
    public int stop();
    
    public int listSounds(int filter); // filter: { all| favorite | user | quick }
    public int loadQuickSound(String name, int slot);
    
    public int connectToMidiKeyboard(String inputName);
    
    public int loadEffectToSlotOne(String effectName);
    public int loadEffectToSlotTwo(String effectName);
    public int toggleEffectOne();
    public int toggleEffectTwo();
    
    public int changeVolume(int newValue);
    public int changeSound(int slot);
    public String[] getProcessStatus();
    
    public void onMidiEvent(MidiEvent event);
    public void onSoundChange(String soundName, int miniChannel);
}
