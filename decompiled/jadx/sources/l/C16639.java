package l;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܽ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16639 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f51095 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f51096 = new int[24];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51097;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39171(C8931 c8931) {
        if ((c8931 instanceof C9317) || (c8931 instanceof C4419) || (c8931 instanceof C10728) || (c8931 instanceof C12139)) {
            this.f51095.put(c8931, new C10996(0));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39172(C8931 c8931, InterfaceC0463 interfaceC0463) {
        boolean z = c8931 instanceof C22017;
        if (z || (c8931 instanceof C9317) || (c8931 instanceof C4419)) {
            C10996 c10996 = (C10996) this.f51095.get(z ? c8931.f63075 : c8931);
            if (c10996 == null) {
                return;
            }
            if (interfaceC0463.getType() == 45) {
                c10996.f33061 = (byte) (c10996.f33061 | 1);
            }
            if (interfaceC0463.getType() != 127 || (c8931 instanceof C4419)) {
                return;
            }
            c10996.f33061 = (byte) (c10996.f33061 | 2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39169(int i, int i2, byte b) {
        if (i < 0 || i2 <= i) {
            return;
        }
        int i3 = this.f51097 + 3;
        int[] iArr = this.f51096;
        if (i3 > iArr.length) {
            this.f51096 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f51096;
        int i4 = this.f51097;
        int i5 = i4 + 1;
        this.f51097 = i5;
        iArr2[i4] = i;
        int i6 = i4 + 2;
        this.f51097 = i6;
        iArr2[i5] = i2;
        this.f51097 = i4 + 3;
        iArr2[i6] = b;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18051 m39170(int i) {
        C18051 c18051 = new C18051(i);
        int i2 = this.f51097;
        while (true) {
            i2 -= 3;
            if (i2 < 0) {
                return c18051;
            }
            C18757.m43430();
            int iMax = Math.max(0, this.f51096[i2]);
            int iMin = Math.min(c18051.f56258.length, this.f51096[i2 + 1]);
            if (iMin > iMax) {
                Arrays.fill(c18051.f56258, iMax, iMin, (byte) this.f51096[i2 + 2]);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39173(C8931 c8931) {
        InterfaceC0463 interfaceC0463;
        C8931 c8932 = c8931.f63075;
        IdentityHashMap identityHashMap = this.f51095;
        C10996 c10996 = (C10996) identityHashMap.get(c8932);
        if (c10996 != null && (interfaceC0463 = c8931.f27156) != null && c8931.f27155 != null) {
            int iMo2054 = interfaceC0463.mo2054();
            int iMo2053 = c8931.f27155.mo2053() + 1;
            if (c8931 instanceof C5789) {
                c10996.f33063 = iMo2054;
                c10996.f33059 = iMo2053;
            }
            if (c8931 instanceof C13590) {
                c10996.f33062 = iMo2054;
                c10996.f33060 = iMo2053;
            }
            if (c8931 instanceof C3008) {
                c10996.f33058 = iMo2054;
                c10996.f33057 = iMo2053;
            }
        }
        C10996 c10997 = (C10996) identityHashMap.remove(c8931);
        if (c10997 == null) {
            return;
        }
        if ((c8931 instanceof C9317) || (c8931 instanceof C4419)) {
            InterfaceC0463 interfaceC0464 = c8931.f27156;
            if (interfaceC0464 == null || c8931.f27155 == null) {
                return;
            }
            m39169(interfaceC0464.mo2054(), c8931.f27155.mo2053() + 1, c10997.f33061);
            return;
        }
        boolean z = c8931 instanceof C10728;
        if (z || c10997.f33063 >= 0) {
            m39169(c10997.f33063, c10997.f33059, c10997.f33061);
            m39169(c10997.f33062, c10997.f33060, c10997.f33061);
            if (z) {
                m39169(c10997.f33058, c10997.f33057, (byte) 0);
            }
        }
    }
}
