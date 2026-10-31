package org.bouncycastle.crypto.params;

import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    public static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, bo.j, bo.j, bo.j, bo.j, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, bo.k, bo.k, bo.k, bo.k, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, bo.j, bo.k, bo.j, bo.k, cb.f77931l, -15, cb.f77931l, -15, 1, bo.k, 1, bo.k, 1, -15, 1, -15, bo.j, -2, bo.j, -2, cb.f77931l, -2, cb.f77931l, -2, 1, bo.j, 1, bo.j, 1, cb.f77931l, 1, cb.f77931l, bo.k, -2, bo.k, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, bo.k, bo.j, bo.k, bo.j, -15, cb.f77931l, -15, cb.f77931l, bo.k, 1, bo.k, 1, -15, 1, -15, 1, -2, bo.j, -2, bo.j, -2, cb.f77931l, -2, cb.f77931l, bo.j, 1, bo.j, 1, cb.f77931l, 1, cb.f77931l, 1, -2, bo.k, -2, bo.k, -2, -15, -2, -15};
    public static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static boolean isWeakKey(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        for (int i2 = 0; i2 < 16; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                if (bArr[i3 + i] != DES_weak_keys[(i2 * 8) + i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & UTF8.S_ERR));
        }
    }
}
