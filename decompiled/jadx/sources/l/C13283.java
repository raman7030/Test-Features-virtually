package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes3.dex */
public final class C13283 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13283 f39769 = new C13283();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
