package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14831 {

    /* JADX INFO: renamed from: ֫ */
    public volatile String[] f42305 = new String[4];

    /* JADX INFO: renamed from: ۧ */
    public boolean[] f42306;

    public C14831(int i) {
        m33869(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33869(int i) {
        boolean[] zArr = new boolean[4];
        for (int i2 = 0; i2 < 4; i2++) {
            zArr[i2] = (C8126.f21416[i2] & i) == 0;
        }
        this.f42306 = zArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m33873(int i) {
        return this.f42306[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m33872(int i) {
        return this.f42305[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m33871() {
        String[] strArr = this.f42305;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f42306[i2] && strArr[i2] == null) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.f42306[i4] && strArr[i4] == null) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33870(ArrayList arrayList, int[] iArr) {
        if (iArr.length != arrayList.size()) {
            throw new IllegalArgumentException("Digest count does not match item count");
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < 4) {
                String strM36665 = C16111.m36665(((InterfaceC16942) arrayList.get(i)).mo6306());
                if (strM36665.length() != C8126.f21415[i2]) {
                    throw new IllegalStateException("Unexpected digest length");
                }
                strArr[i] = strM36665;
            } else {
                throw new IllegalArgumentException("Unexpected checksum item index");
            }
        }
        String[] strArr2 = (String[]) this.f42305.clone();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            strArr2[iArr[i3]] = strArr[i3];
        }
        this.f42305 = strArr2;
    }
}
