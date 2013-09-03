/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.sound.midi.MidiEvent;

/**
 *
 * @author assafgoldstein
 */
public interface MidiDeviceConnection {
    public void onDeviceConnected(String name, String make, int usb );
    public void onDeviceDisconnected(String name);
    public void onMidiEvent(MidiEvent event);
}


