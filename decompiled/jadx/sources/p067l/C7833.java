package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7833 {

    /* JADX INFO: renamed from: ۧ */
    public int f20533;

    /* JADX INFO: renamed from: ܳ */
    public long f20534;

    /* JADX INFO: renamed from: ܽ */
    public boolean f20535;

    /* JADX INFO: renamed from: ܿ */
    public C13868 f20536;

    /* JADX INFO: renamed from: ᩻ */
    public int f20538;

    /* JADX INFO: renamed from: ֫ */
    public final long[] f20532 = new long[C15208.m34661(65536)];

    /* JADX INFO: renamed from: ᩳ */
    public long f20537 = C14849.FOREVER_NS;

    /* JADX INFO: renamed from: ֫ */
    public final void m18103(int i, boolean z) {
        m18099(i);
        while (i > 0) {
            int i2 = this.f20533;
            if (i2 == 0 && i >= 65536) {
                int i3 = (-65536) & i;
                this.f20536 = C15208.m34663(this.f20536, C15208.m34654(i3, z));
                i -= i3;
            } else {
                int iMin = Math.min(i, 65536 - i2);
                if (z) {
                    int i4 = this.f20533;
                    C15208.m34657(i4, i4 + iMin, this.f20532);
                }
                int i5 = this.f20533 + iMin;
                this.f20533 = i5;
                i -= iMin;
                if (i5 == 65536) {
                    m18100();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18102(int i, int i2, long[] jArr) {
        m18099(i2);
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            int iMin = Math.min(i3, 65536 - this.f20533);
            int i5 = this.f20533;
            int i6 = i4;
            int i7 = iMin;
            while (i7 > 0) {
                int i8 = i6 >>> 6;
                int i9 = i6 & 63;
                int i10 = i5 >>> 6;
                int i11 = i5 & 63;
                int iMin2 = Math.min(i7, 64 - i11);
                long j = jArr[i8] >>> i9;
                if (i9 != 0 && i9 + iMin2 > 64) {
                    j |= jArr[i8 + 1] << (64 - i9);
                }
                long j2 = iMin2 == 64 ? -1L : (1 << iMin2) - 1;
                long[] jArr2 = this.f20532;
                jArr2[i10] = ((j2 & j) << i11) | jArr2[i10];
                i6 += iMin2;
                i5 += iMin2;
                i7 -= iMin2;
            }
            i4 += iMin;
            int i12 = this.f20533 + iMin;
            this.f20533 = i12;
            i3 -= iMin;
            if (i12 == 65536) {
                m18100();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13868 m18101() {
        if (this.f20535) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        m18100();
        this.f20535 = true;
        return this.f20536;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m18105() {
        return (((long) this.f20532.length) * 8) + this.f20534;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18104(long j) {
        this.f20537 = Math.max(0L, j);
        if (m18105() > this.f20537) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18099(int i) {
        if (this.f20535) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Dirty length must not be negative");
        }
        int i2 = this.f20538;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f20538 = i2 + i;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m18100() {
        long[] jArr;
        int i = this.f20533;
        if (i == 0) {
            return;
        }
        int iM34661 = C15208.m34661(i);
        int i2 = this.f20533;
        int iM34662 = C15208.m34661(i2);
        int i3 = i2 & 63;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            jArr = this.f20532;
            if (i4 >= iM34662) {
                break;
            }
            long j = (i4 != iM34662 + (-1) || i3 == 0) ? -1L : (1 << i3) - 1;
            long j2 = jArr[i4] & j;
            z |= j2 != 0;
            z2 &= j2 == j;
            i4++;
        }
        if (z && !z2 && C15208.m34653(m18105(), ((long) iM34661) * 8) > this.f20537) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
        C13868 c13868M34662 = C15208.m34662(this.f20533, Arrays.copyOf(jArr, iM34661));
        if (c13868M34662.m31577()) {
            this.f20534 = (((long) c13868M34662.f39177.length) * 8) + this.f20534;
        }
        this.f20536 = C15208.m34663(this.f20536, c13868M34662);
        Arrays.fill(jArr, 0L);
        this.f20533 = 0;
    }
}
