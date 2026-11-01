package com.portaudio;

import p067l.C12619;
import p067l.C19324;
import p067l.C3901;

/* JADX INFO: loaded from: classes.dex */
public class PortAudio {
    public static native int getDefaultHostApi();

    public static native int getDefaultInputDevice();

    public static native int getDefaultOutputDevice();

    public static native int getDeviceCount();

    public static native void getDeviceInfo(int i, C3901 c3901);

    public static native int getHostApiCount();

    public static native void getHostApiInfo(int i, C12619 c12619);

    public static native int getVersion();

    public static native String getVersionText();

    public static native int hostApiDeviceIndexToDeviceIndex(int i, int i2);

    public static native int hostApiTypeIdToHostApiIndex(int i);

    public static native void initialize();

    public static native int isFormatSupported(C19324 c19324, C19324 c19325, int i);

    public static native void openStream(BlockingStream blockingStream, C19324 c19324, C19324 c19325, int i, int i2, int i3);

    public static native void terminate();

    static {
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            if (System.getProperty("os.arch").contains("64")) {
                System.loadLibrary("jportaudio_x64");
            } else {
                System.loadLibrary("jportaudio_x86");
            }
        } else {
            System.loadLibrary("jportaudio");
        }
        System.out.println("---- JPortAudio version " + getVersion() + ", " + getVersionText());
    }
}
