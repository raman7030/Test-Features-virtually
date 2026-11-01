package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C6581 {

    /* JADX INFO: renamed from: ֫ */
    public int f16993;

    /* JADX INFO: renamed from: ۧ */
    public long[] f16994;

    public C6581() {
        this(32);
    }

    public C6581(int i) {
        this.f16994 = new long[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15037(long j) {
        int i = this.f16993;
        long[] jArr = this.f16994;
        if (i == jArr.length) {
            this.f16994 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f16994;
        int i2 = this.f16993;
        this.f16993 = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15038(long[] jArr) {
        int length = this.f16993 + jArr.length;
        long[] jArr2 = this.f16994;
        if (length > jArr2.length) {
            this.f16994 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f16994, this.f16993, jArr.length);
        this.f16993 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m15036(int i) {
        if (i >= 0 && i < this.f16993) {
            return this.f16994[i];
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Invalid index ", ", size is ");
        sbM34408.append(this.f16993);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15035() {
        return this.f16993;
    }
}
