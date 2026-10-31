package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C4433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14168;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long[] f14169;

    public C4433() {
        this(32);
    }

    public C4433(int i) {
        this.f14169 = new long[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13156(long j) {
        int i = this.f14168;
        long[] jArr = this.f14169;
        if (i == jArr.length) {
            this.f14169 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f14169;
        int i2 = this.f14168;
        this.f14168 = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13157(long[] jArr) {
        int length = this.f14168 + jArr.length;
        long[] jArr2 = this.f14169;
        if (length > jArr2.length) {
            this.f14169 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f14169, this.f14168, jArr.length);
        this.f14168 = length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m13155(int i) {
        if (i >= 0 && i < this.f14168) {
            return this.f14169[i];
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Invalid index ", ", size is ");
        sbM32308.append(this.f14168);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13154() {
        return this.f14168;
    }
}
