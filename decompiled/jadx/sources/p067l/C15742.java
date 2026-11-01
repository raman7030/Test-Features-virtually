package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15742 {

    /* JADX INFO: renamed from: ֫ */
    public final long[][] f45582;

    public C15742(int i) {
        int i2 = (int) ((((long) i) + 63) >>> 6);
        int i3 = 1;
        int i4 = i2;
        while (i4 > 1) {
            i4 = (int) ((((long) i4) + 63) >>> 6);
            i3++;
        }
        this.f45582 = new long[i3][];
        for (int i5 = 0; i5 < i3; i5++) {
            this.f45582[i5] = new long[i2];
            i2 = (int) ((((long) i2) + 63) >>> 6);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35786() {
        for (long[] jArr : this.f45582) {
            Arrays.fill(jArr, 0L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35787(int i) {
        long[][] jArr = this.f45582;
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long[] jArr2 = jArr[i2];
            int i3 = i >>> 6;
            long j = jArr2[i3];
            jArr2[i3] = (1 << (i & 63)) | j;
            if (j != 0) {
                return;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35789(int i) {
        long[][] jArr = this.f45582;
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long[] jArr2 = jArr[i2];
            int i3 = i >>> 6;
            long j = (~(1 << (i & 63))) & jArr2[i3];
            jArr2[i3] = j;
            if (j != 0) {
                return;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m35788() {
        long[][] jArr = this.f45582;
        int length = jArr.length;
        long j = jArr[length - 1][0];
        if (j == 0) {
            return -1;
        }
        int iNumberOfLeadingZeros = 63 - Long.numberOfLeadingZeros(j);
        for (int i = length - 2; i >= 0; i--) {
            iNumberOfLeadingZeros = ((iNumberOfLeadingZeros << 6) + 63) - Long.numberOfLeadingZeros(jArr[i][iNumberOfLeadingZeros]);
        }
        return iNumberOfLeadingZeros;
    }
}
