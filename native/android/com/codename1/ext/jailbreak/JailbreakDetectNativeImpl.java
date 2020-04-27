package com.codename1.ext.jailbreak;

import com.codename1.impl.android.AndroidNativeUtil;

public class JailbreakDetectNativeImpl {
    public boolean isJailbroken() {
        com.scottyab.rootbeer.RootBeer rootBeer = new com.scottyab.rootbeer.RootBeer(AndroidNativeUtil.getContext());
        return rootBeer.isRooted();
    }

    public boolean isSupported() {
        return true;
    }

}
