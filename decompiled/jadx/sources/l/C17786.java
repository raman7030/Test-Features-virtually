package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ᩳۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBMU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17786 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41664(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m41667(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(C19370.m44628(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41665(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & HPKE.aead_EXPORT_ONLY;
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41668(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41666(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM9080 = C2970.m9080(obj);
        int i2 = iM9080 & i;
        int iM41665 = m41665(i2, obj3);
        if (iM41665 != 0) {
            int i3 = ~i;
            int i4 = iM9080 & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM41665 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && C11003.equals(obj, objArr[i6]) && (objArr2 == null || C11003.equals(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        m41668(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = m41664(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iM41665 = i9;
            }
        }
        return -1;
    }
}
