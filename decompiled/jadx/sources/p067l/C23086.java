package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes.dex */
public final class C23086 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f72528;

    /* JADX INFO: renamed from: ۙ */
    public byte[] f72529;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC7230[] f72530;

    /* JADX INFO: renamed from: ۫ */
    public C6322 f72531;

    /* JADX INFO: renamed from: ۬ */
    public C13266[] f72532;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23086 c23086 = (C23086) obj;
        C6322 c6322 = this.f72531;
        if (c6322 == null) {
            return c23086.f72531 == null ? 0 : -1;
        }
        C6322 c6323 = c23086.f72531;
        if (c6323 == null) {
            return 1;
        }
        return c6322.compareTo(c6323);
    }

    public C23086(C5651 c5651) {
        super(c5651);
        this.f72531 = null;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        AbstractC7230 abstractC7230M3722;
        this.f72528 = c12556.m28943();
        this.f72532 = new C13266[c12556.m28943()];
        C2535 c2535 = this.f18865.f13748;
        int i = 0;
        while (true) {
            C13266[] c13266Arr = this.f72532;
            if (i < c13266Arr.length) {
                int iM28943 = c12556.m28943() - 1;
                if (iM28943 == -1) {
                    c2535.getClass();
                    abstractC7230M3722 = null;
                } else {
                    abstractC7230M3722 = c2535.m3722(iM28943);
                }
                c13266Arr[i] = (C13266) abstractC7230M3722;
                i++;
            } else {
                int iM28938 = c12556.m28938();
                ArrayList arrayList = new ArrayList(50);
                C21075.m47560(c12556, new C7663(this, arrayList));
                AbstractC7230[] abstractC7230Arr = new AbstractC7230[arrayList.size()];
                this.f72530 = abstractC7230Arr;
                arrayList.toArray(abstractC7230Arr);
                int iM28939 = c12556.m28938() - iM28938;
                c12556.m28945(iM28938);
                this.f72529 = c12556.m28942(iM28939);
                return;
            }
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        int iM29759 = C12981.m29759(this.f72532.length) + C12981.m29759(this.f72528) + i;
        C13266[] c13266Arr = this.f72532;
        int length = c13266Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            C13266 c13266 = c13266Arr[i2];
            iM29759 += C12981.m29759(c13266 == null ? 0 : c13266.f18866 + 1);
        }
        C12556 c12556 = new C12556(this.f72529);
        C10345 c10345 = new C10345(this);
        C21075.m47560(c12556, c10345);
        return iM29759 + c10345.f7584;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7530(this.f72528);
        c3838.m7530(this.f72532.length);
        C13266[] c13266Arr = this.f72532;
        int length = c13266Arr.length;
        for (int i = 0; i < length; i++) {
            C13266 c13266 = c13266Arr[i];
            c3838.m7530(c13266 == null ? 0 : c13266.f18866 + 1);
        }
        C21075.m47560(new C12556(this.f72529), new C17049(this, c3838));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return C1514.m34687(new StringBuilder("debug_info_item @0x"), this.f18864);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51487(C6322 c6322) {
        this.f72531 = c6322;
    }
}
