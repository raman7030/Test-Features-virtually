package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class Msg {
    public byte[][] msgs;
    public int pos = 0;
    public int unopened = -1;

    public Msg(PicnicEngine picnicEngine) {
        this.msgs = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, picnicEngine.numMPCParties, picnicEngine.andSizeBytes);
    }
}
