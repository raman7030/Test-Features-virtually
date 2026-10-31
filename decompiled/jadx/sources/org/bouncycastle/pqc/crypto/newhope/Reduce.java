package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes2.dex */
public class Reduce {
    public static final int QInv = 12287;
    public static final int RLog = 18;
    public static final int RMask = 262143;

    public static short barrett(short s) {
        int i = s & HPKE.aead_EXPORT_ONLY;
        return (short) (i - (((i * 5) >>> 16) * 12289));
    }

    public static short montgomery(int i) {
        return (short) (((((i * 12287) & RMask) * 12289) + i) >>> 18);
    }
}
