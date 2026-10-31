package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class TBCPadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 0;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i - 1] & 1) == 0) {
            i2 = 255;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "TBC";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length - 1;
        int i = bArr[length] & 255;
        int i2 = 1;
        int i3 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i3 &= (((bArr[length] & 255) ^ i) - 1) >> 31;
            i2 -= i3;
        }
    }
}
