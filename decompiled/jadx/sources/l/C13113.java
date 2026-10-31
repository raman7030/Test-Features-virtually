package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13113 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile String[] f39253 = new String[4];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean[] f39254;

    public C13113(int i) {
        m31778(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31778(int i) {
        boolean[] zArr = new boolean[4];
        for (int i2 = 0; i2 < 4; i2++) {
            zArr[i2] = (C6058.f18560[i2] & i) == 0;
        }
        this.f39254 = zArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31782(int i) {
        return this.f39254[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m31781(int i) {
        return this.f39253[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m31780() {
        String[] strArr = this.f39253;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f39254[i2] && strArr[i2] == null) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.f39254[i4] && strArr[i4] == null) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31779(ArrayList arrayList, int[] iArr) {
        if (iArr.length != arrayList.size()) {
            throw new IllegalArgumentException("Digest count does not match item count");
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < 4) {
                String strM34531 = C14460.m34531(((InterfaceC15334) arrayList.get(i)).mo4062());
                if (strM34531.length() != C6058.f18559[i2]) {
                    throw new IllegalStateException("Unexpected digest length");
                }
                strArr[i] = strM34531;
            } else {
                throw new IllegalArgumentException("Unexpected checksum item index");
            }
        }
        String[] strArr2 = (String[]) this.f39253.clone();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            strArr2[iArr[i3]] = strArr[i3];
        }
        this.f39253 = strArr2;
    }
}
