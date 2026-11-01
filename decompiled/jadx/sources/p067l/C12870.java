package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۧܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAMR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12870 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static long[] m29498(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29497(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
