package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5750 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f17689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17690;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12100 f17691;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f17693;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f17687 = new long[C13510.m32559(65536)];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f17692 = C13132.FOREVER_NS;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16184(int i, boolean z) {
        m16180(i);
        while (i > 0) {
            int i2 = this.f17688;
            if (i2 == 0 && i >= 65536) {
                int i3 = (-65536) & i;
                this.f17691 = C13510.m32561(this.f17691, C13510.m32552(i3, z));
                i -= i3;
            } else {
                int iMin = Math.min(i, 65536 - i2);
                if (z) {
                    int i4 = this.f17688;
                    C13510.m32555(i4, i4 + iMin, this.f17687);
                }
                int i5 = this.f17688 + iMin;
                this.f17688 = i5;
                i -= iMin;
                if (i5 == 65536) {
                    m16181();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16183(int i, int i2, long[] jArr) {
        m16180(i2);
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            int iMin = Math.min(i3, 65536 - this.f17688);
            int i5 = this.f17688;
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
                long[] jArr2 = this.f17687;
                jArr2[i10] = ((j2 & j) << i11) | jArr2[i10];
                i6 += iMin2;
                i5 += iMin2;
                i7 -= iMin2;
            }
            i4 += iMin;
            int i12 = this.f17688 + iMin;
            this.f17688 = i12;
            i3 -= iMin;
            if (i12 == 65536) {
                m16181();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 m16182() {
        if (this.f17690) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        m16181();
        this.f17690 = true;
        return this.f17691;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m16186() {
        return (((long) this.f17687.length) * 8) + this.f17689;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16185(long j) {
        this.f17692 = Math.max(0L, j);
        if (m16186() > this.f17692) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16180(int i) {
        if (this.f17690) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Dirty length must not be negative");
        }
        int i2 = this.f17693;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f17693 = i2 + i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m16181() {
        long[] jArr;
        int i = this.f17688;
        if (i == 0) {
            return;
        }
        int iM32559 = C13510.m32559(i);
        int i2 = this.f17688;
        int iM325510 = C13510.m32559(i2);
        int i3 = i2 & 63;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            jArr = this.f17687;
            if (i4 >= iM325510) {
                break;
            }
            long j = (i4 != iM325510 + (-1) || i3 == 0) ? -1L : (1 << i3) - 1;
            long j2 = jArr[i4] & j;
            z |= j2 != 0;
            z2 &= j2 == j;
            i4++;
        }
        if (z && !z2 && C13510.m32551(m16186(), ((long) iM32559) * 8) > this.f17692) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
        C12100 c12100M32560 = C13510.m32560(this.f17688, Arrays.copyOf(jArr, iM32559));
        if (c12100M32560.m29514()) {
            this.f17689 = (((long) c12100M32560.f36166.length) * 8) + this.f17689;
        }
        this.f17691 = C13510.m32561(this.f17691, c12100M32560);
        Arrays.fill(jArr, 0L);
        this.f17688 = 0;
    }
}
