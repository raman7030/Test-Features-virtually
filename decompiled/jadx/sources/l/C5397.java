package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5397 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f16802;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char[] f16803;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f16804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16805;

    public C5397(int i) {
        this.f16802 = new int[Math.max(8, i)];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15405(int i) {
        int[] iArr = this.f16804;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15403(int i) {
        int[] iArr = this.f16804;
        if (iArr == null) {
            return 0;
        }
        return iArr[i + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5397 m15404(int i, int i2) {
        int i3 = i2 - i;
        C5397 c5397 = new C5397(i3);
        c5397.f16805 = i3;
        System.arraycopy(this.f16802, i, c5397.f16802, 0, i3);
        int iM15405 = m15405(i);
        int iM15403 = i2 == 0 ? iM15405 : m15403(i2 - 1);
        if (iM15403 != iM15405) {
            c5397.f16804 = new int[c5397.f16802.length + 1];
            for (int i4 = 0; i4 <= c5397.f16805; i4++) {
                c5397.f16804[i4] = this.f16804[i + i4] - iM15405;
            }
            c5397.f16803 = Arrays.copyOfRange(this.f16803, iM15405, iM15403);
        }
        return c5397;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5397 m15402(C5397 c5397, C5397 c5398) {
        C5397 c5399 = new C5397(c5397.f16805 + c5398.f16805);
        c5399.f16805 = c5397.f16805 + c5398.f16805;
        System.arraycopy(c5397.f16802, 0, c5399.f16802, 0, c5397.f16805);
        System.arraycopy(c5398.f16802, 0, c5399.f16802, c5397.f16805, c5398.f16805);
        int iM15403 = c5397.m15403(c5397.f16805 - 1);
        long jM15403 = ((long) iM15403) + ((long) c5398.m15403(c5398.f16805 - 1));
        int i = (int) jM15403;
        if (jM15403 != i) {
            throw new ArithmeticException();
        }
        if (i != 0) {
            c5399.f16804 = new int[c5399.f16802.length + 1];
            c5399.f16803 = new char[i];
            for (int i2 = 0; i2 < c5397.f16805; i2++) {
                c5399.f16804[i2] = c5397.m15405(i2);
            }
            for (int i3 = 0; i3 < c5398.f16805; i3++) {
                c5399.f16804[c5397.f16805 + i3] = c5398.m15405(i3) + iM15403;
            }
            c5399.f16804[c5399.f16805] = i;
            if (iM15403 != 0) {
                System.arraycopy(c5397.f16803, 0, c5399.f16803, 0, iM15403);
            }
            if (i != iM15403) {
                System.arraycopy(c5398.f16803, 0, c5399.f16803, iM15403, i - iM15403);
            }
        }
        return c5399;
    }
}
