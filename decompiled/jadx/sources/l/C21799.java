package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes.dex */
public final class C21799 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f69820;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f69821;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC5116[] f69822;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4160 f69823;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11467[] f69824;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21799 c21799 = (C21799) obj;
        C4160 c4160 = this.f69823;
        if (c4160 == null) {
            return c21799.f69823 == null ? 0 : -1;
        }
        C4160 c4161 = c21799.f69823;
        if (c4161 == null) {
            return 1;
        }
        return c4160.compareTo(c4161);
    }

    public C21799(C3454 c3454) {
        super(c3454);
        this.f69823 = null;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        AbstractC5116 abstractC5116M1314;
        this.f69820 = c10720.m26903();
        this.f69824 = new C11467[c10720.m26903()];
        C0176 c0176 = this.f16031.f10947;
        int i = 0;
        while (true) {
            C11467[] c11467Arr = this.f69824;
            if (i < c11467Arr.length) {
                int iM26903 = c10720.m26903() - 1;
                if (iM26903 == -1) {
                    c0176.getClass();
                    abstractC5116M1314 = null;
                } else {
                    abstractC5116M1314 = c0176.m1314(iM26903);
                }
                c11467Arr[i] = (C11467) abstractC5116M1314;
                i++;
            } else {
                int iM26898 = c10720.m26898();
                ArrayList arrayList = new ArrayList(50);
                C19683.m45263(c10720, new C5571(this, arrayList));
                AbstractC5116[] abstractC5116Arr = new AbstractC5116[arrayList.size()];
                this.f69822 = abstractC5116Arr;
                arrayList.toArray(abstractC5116Arr);
                int iM26899 = c10720.m26898() - iM26898;
                c10720.m26905(iM26898);
                this.f69821 = c10720.m26902(iM26899);
                return;
            }
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        int iM27697 = C11166.m27697(this.f69824.length) + C11166.m27697(this.f69820) + i;
        C11467[] c11467Arr = this.f69824;
        int length = c11467Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            C11467 c11467 = c11467Arr[i2];
            iM27697 += C11166.m27697(c11467 == null ? 0 : c11467.f16032 + 1);
        }
        C10720 c10720 = new C10720(this.f69821);
        C8393 c8393 = new C8393(this);
        C19683.m45263(c10720, c8393);
        return iM27697 + c8393.f4814;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5301(this.f69820);
        c1547.m5301(this.f69824.length);
        C11467[] c11467Arr = this.f69824;
        int length = c11467Arr.length;
        for (int i = 0; i < length; i++) {
            C11467 c11467 = c11467Arr[i];
            c1547.m5301(c11467 == null ? 0 : c11467.f16032 + 1);
        }
        C19683.m45263(new C10720(this.f69821), new C15447(this, c1547));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return C13540.m32584(new StringBuilder("debug_info_item @0x"), this.f16030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49137(C4160 c4160) {
        this.f69823 = c4160;
    }
}
