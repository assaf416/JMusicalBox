/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author assafgoldstein
 */
public interface Device {
    public void onDeviceRestart(String name);
    public void onDeviceConnected(String name);
    public void onDeviceDisconnected(String name);
}
