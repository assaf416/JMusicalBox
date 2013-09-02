/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package effects;

import javax.sound.midi.MidiEvent;

/**
 *
 * @author assafgoldstein
 */
public class NullEffect implements core.Effect{

    // NULL EFFECT
    
    public int start() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int stop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int changeParamValue(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onMidiEvent(MidiEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
