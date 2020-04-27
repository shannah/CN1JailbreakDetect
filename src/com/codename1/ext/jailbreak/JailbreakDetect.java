/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.ext.jailbreak;

import com.codename1.system.NativeLookup;

/**
 * A single purpose class: To check if the device is jailbroken/rooted.  
 * 
 * <p><strong>DISCLAIMER</strong>: There is no way to be 100% sure that the device is rooted.  This library
 * simply uses some heuristics to test for common signs of rooting.  It uses <a href="https://github.com/scottyab/rootbeer">Rootbeer</a>
 * on Android, and <a href="https://github.com/thii/DTTJailbreakDetection">DDTJailbreakDetection</a> on iOS.</p>
 * 
 * 
 * @author shannah
 */
public class JailbreakDetect {
    private JailbreakDetectNative internal;
    
    /**
     * Checks if the device is jailbroken.  If jailbreak detection is not supported on this
     * platform (currently iOS and Android only), then this returns true.  Use {@link #isJailbreakDetectionSupported() }
     * to check whether platform supports jailbreak detection.
     * @return 
     */
    public static boolean isJailbroken() {
        return new JailbreakDetect()._isJailbroken();
    }
    
    /**
     * Checks if jailbreak detection is supported on this platform.
     * @return 
     */
    public static boolean isJailbreakDetectionSupported() {
        return new JailbreakDetect()._isAvailable();
    }
    
    private JailbreakDetect() {
        try {
            internal = NativeLookup.create(JailbreakDetectNative.class);
        } catch (Throwable t){}
    }
    
    private boolean _isAvailable() {
        return internal != null && internal.isSupported();
    }
    
    private boolean _isJailbroken() {
        return internal != null && internal.isJailbroken();
    }
}
