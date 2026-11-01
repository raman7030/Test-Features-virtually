package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7498 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f19638;

    /* JADX INFO: renamed from: ۧ */
    public char[] f19639;

    /* JADX INFO: renamed from: ܽ */
    public int[] f19640;

    /* JADX INFO: renamed from: ᩳ */
    public int f19641;

    public C7498(int i) {
        this.f19638 = new int[Math.max(8, i)];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17316(int i) {
        int[] iArr = this.f19640;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17314(int i) {
        int[] iArr = this.f19640;
        if (iArr == null) {
            return 0;
        }
        return iArr[i + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7498 m17315(int i, int i2) {
        int i3 = i2 - i;
        C7498 c7498 = new C7498(i3);
        c7498.f19641 = i3;
        System.arraycopy(this.f19638, i, c7498.f19638, 0, i3);
        int iM17316 = m17316(i);
        int iM17314 = i2 == 0 ? iM17316 : m17314(i2 - 1);
        if (iM17314 != iM17316) {
            c7498.f19640 = new int[c7498.f19638.length + 1];
            for (int i4 = 0; i4 <= c7498.f19641; i4++) {
                c7498.f19640[i4] = this.f19640[i + i4] - iM17316;
            }
            c7498.f19639 = Arrays.copyOfRange(this.f19639, iM17316, iM17314);
        }
        return c7498;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7498 m17313(C7498 c7498, C7498 c7499) {
        C7498 c74910 = new C7498(c7498.f19641 + c7499.f19641);
        c74910.f19641 = c7498.f19641 + c7499.f19641;
        System.arraycopy(c7498.f19638, 0, c74910.f19638, 0, c7498.f19641);
        System.arraycopy(c7499.f19638, 0, c74910.f19638, c7498.f19641, c7499.f19641);
        int iM17314 = c7498.m17314(c7498.f19641 - 1);
        long jM17314 = ((long) iM17314) + ((long) c7499.m17314(c7499.f19641 - 1));
        int i = (int) jM17314;
        if (jM17314 != i) {
            throw new ArithmeticException();
        }
        if (i != 0) {
            c74910.f19640 = new int[c74910.f19638.length + 1];
            c74910.f19639 = new char[i];
            for (int i2 = 0; i2 < c7498.f19641; i2++) {
                c74910.f19640[i2] = c7498.m17316(i2);
            }
            for (int i3 = 0; i3 < c7499.f19641; i3++) {
                c74910.f19640[c7498.f19641 + i3] = c7499.m17316(i3) + iM17314;
            }
            c74910.f19640[c74910.f19641] = i;
            if (iM17314 != 0) {
                System.arraycopy(c7498.f19639, 0, c74910.f19639, 0, iM17314);
            }
            if (i != iM17314) {
                System.arraycopy(c7499.f19639, 0, c74910.f19639, iM17314, i - iM17314);
            }
        }
        return c74910;
    }
}
