package com.portaudio;

import p067l.C17982;

/* JADX INFO: loaded from: classes.dex */
public class BlockingStream {
    private native void getInfo(C17982 c17982);

    private native boolean readFloats(float[] fArr, int i);

    private native boolean readShorts(short[] sArr, int i);

    private native boolean writeFloats(float[] fArr, int i);

    private native boolean writeShorts(short[] sArr, int i);

    public native void abort();

    public native void close();

    public native int getReadAvailable();

    public native double getTime();

    public native int getWriteAvailable();

    public native boolean isActive();

    public native boolean isStopped();

    public native void start();

    public native void stop();

    public final String toString() {
        return "BlockingStream: streamPtr = " + Long.toHexString(0L) + ", inFormat = -1, outFormat = -1";
    }
}
