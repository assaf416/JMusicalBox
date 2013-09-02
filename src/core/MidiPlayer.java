/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author assafgoldstein
 */
public interface MidiPlayer {

    public int loadFile(String fileName);
    public int play();
    public int pause();
    public int stop();
    public int showInfo();
    public int saveToOgg(String fileName);
    public int changeKey(String key);
    public int changeSpeed(int speed);
    public int muteChannels(int[] channels);
    public int createLoop(int fromBar, int ToBar, String fileName);
    
    
}