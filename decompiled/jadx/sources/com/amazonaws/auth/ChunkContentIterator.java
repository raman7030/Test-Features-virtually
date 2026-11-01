package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class ChunkContentIterator {

    /* JADX INFO: renamed from: ֫ */
    public int f1307;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f1308;

    public ChunkContentIterator(byte[] bArr) {
        this.f1308 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1383() {
        return this.f1307 < this.f1308.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m1382(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (!m1383()) {
            return -1;
        }
        byte[] bArr2 = this.f1308;
        int iMin = Math.min(bArr2.length - this.f1307, i2);
        System.arraycopy(bArr2, this.f1307, bArr, i, iMin);
        this.f1307 += iMin;
        return iMin;
    }
}
