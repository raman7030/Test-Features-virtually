package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 365A */
/* JADX INFO: loaded from: classes3.dex */
public final class C12448 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f34796;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f34796 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28663(char c) {
        if (c < 128) {
            return f34796[c];
        }
        return -1;
    }
}
