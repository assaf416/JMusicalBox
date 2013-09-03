/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package instruments;

import javax.sound.midi.MidiEvent;

/**
 *
 * @author assafgoldstein
 */
public class LinuxSampler implements core.Instrument{

    public int start() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int stop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int loadSoundToSlotOne(String soundName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int loadSoundToSlotTwo(String soundName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int loadSoundToSlotThree(String soundName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int connectToMidiKeyboard(String inputName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int loadEffectToSlotOne(String effectName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int loadEffectToSlotTwo(String effectName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int toggleEffectOne() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int toggleEffectTwo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int changeVolume(int newValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int changeSound(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onSoundChange(String soundName, int miniChannel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onMidiEvent(MidiEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getProcessStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
