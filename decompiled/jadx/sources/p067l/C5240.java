package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8HW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5240 {

    /* JADX INFO: renamed from: ֫ */
    public long[] f12351;

    /* JADX INFO: renamed from: ۧ */
    public int f12352;

    /* JADX INFO: renamed from: ܽ */
    public int f12353;

    /* JADX INFO: renamed from: ܿ */
    public int f12354;

    /* JADX INFO: renamed from: ᩳ */
    public int f12355;

    public C5240() {
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f12352 = 0;
        this.f12355 = -1;
        this.f12353 = 0;
        this.f12351 = new long[iHighestOneBit];
        this.f12354 = iHighestOneBit - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11309(long j) {
        int i = this.f12353;
        long[] jArr = this.f12351;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.f12352;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.f12351, 0, jArr2, i3, i2);
            this.f12352 = 0;
            this.f12355 = this.f12353 - 1;
            this.f12351 = jArr2;
            this.f12354 = length - 1;
        }
        int i4 = (this.f12355 + 1) & this.f12354;
        this.f12355 = i4;
        this.f12351[i4] = j;
        this.f12353++;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m11312() {
        int i = this.f12353;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f12351;
        int i2 = this.f12352;
        long j = jArr[i2];
        this.f12352 = this.f12354 & (i2 + 1);
        this.f12353 = i - 1;
        return j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m11310() {
        if (this.f12353 == 0) {
            throw new NoSuchElementException();
        }
        return this.f12351[this.f12352];
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m11311() {
        return this.f12353 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11308() {
        this.f12352 = 0;
        this.f12355 = -1;
        this.f12353 = 0;
    }
}
