package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8HW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3022 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[] f9549;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9550;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9551;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f9552;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9553;

    public C3022() {
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f9550 = 0;
        this.f9553 = -1;
        this.f9551 = 0;
        this.f9549 = new long[iHighestOneBit];
        this.f9552 = iHighestOneBit - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9267(long j) {
        int i = this.f9551;
        long[] jArr = this.f9549;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.f9550;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.f9549, 0, jArr2, i3, i2);
            this.f9550 = 0;
            this.f9553 = this.f9551 - 1;
            this.f9549 = jArr2;
            this.f9552 = length - 1;
        }
        int i4 = (this.f9553 + 1) & this.f9552;
        this.f9553 = i4;
        this.f9549[i4] = j;
        this.f9551++;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m9270() {
        int i = this.f9551;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9549;
        int i2 = this.f9550;
        long j = jArr[i2];
        this.f9550 = this.f9552 & (i2 + 1);
        this.f9551 = i - 1;
        return j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m9268() {
        if (this.f9551 == 0) {
            throw new NoSuchElementException();
        }
        return this.f9549[this.f9550];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m9269() {
        return this.f9551 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9266() {
        this.f9550 = 0;
        this.f9553 = -1;
        this.f9551 = 0;
    }
}
