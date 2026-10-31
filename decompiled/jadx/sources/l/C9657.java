package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AT */
/* JADX INFO: loaded from: classes4.dex */
public final class C9657 extends AbstractC8245 {
    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6243() {
        return false;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24595(C17417 c17417) {
        C17417 c17418 = this.f25382;
        c17418.f53269.add(c17417);
        c17417.f53275.add(c17418);
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ֫ */
    public final void mo6240() {
        C15094 c15094 = this.f25376;
        if (c15094 instanceof C2396) {
            C17417 c17417 = this.f25382;
            c17417.f53265 = true;
            ArrayList arrayList = c17417.f53275;
            C2396 c2396 = (C2396) c15094;
            int iM7766 = c2396.m7766();
            boolean zM7770 = c2396.m7770();
            int i = 0;
            if (iM7766 == 0) {
                c17417.f53268 = EnumC18123.LEFT;
                while (i < c2396.f38881) {
                    C15094 c15095 = c2396.f38882[i];
                    if (zM7770 || c15095.m35735() != 8) {
                        C17417 c17418 = c15095.f46156.f25382;
                        c17418.f53269.add(c17417);
                        arrayList.add(c17418);
                    }
                    i++;
                }
                m24595(this.f25376.f46156.f25382);
                m24595(this.f25376.f46156.f25379);
                return;
            }
            if (iM7766 == 1) {
                c17417.f53268 = EnumC18123.RIGHT;
                while (i < c2396.f38881) {
                    C15094 c15096 = c2396.f38882[i];
                    if (zM7770 || c15096.m35735() != 8) {
                        C17417 c17419 = c15096.f46156.f25379;
                        c17419.f53269.add(c17417);
                        arrayList.add(c17419);
                    }
                    i++;
                }
                m24595(this.f25376.f46156.f25382);
                m24595(this.f25376.f46156.f25379);
                return;
            }
            if (iM7766 == 2) {
                c17417.f53268 = EnumC18123.TOP;
                while (i < c2396.f38881) {
                    C15094 c15097 = c2396.f38882[i];
                    if (zM7770 || c15097.m35735() != 8) {
                        C17417 c174110 = c15097.f46140.f25382;
                        c174110.f53269.add(c17417);
                        arrayList.add(c174110);
                    }
                    i++;
                }
                m24595(this.f25376.f46140.f25382);
                m24595(this.f25376.f46140.f25379);
                return;
            }
            if (iM7766 != 3) {
                return;
            }
            c17417.f53268 = EnumC18123.BOTTOM;
            while (i < c2396.f38881) {
                C15094 c15098 = c2396.f38882[i];
                if (zM7770 || c15098.m35735() != 8) {
                    C17417 c174111 = c15098.f46140.f25379;
                    c174111.f53269.add(c17417);
                    arrayList.add(c174111);
                }
                i++;
            }
            m24595(this.f25376.f46140.f25382);
            m24595(this.f25376.f46140.f25379);
        }
    }

    @Override // l.AbstractC8245, l.InterfaceC11068
    /* JADX INFO: renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        C2396 c2396 = (C2396) this.f25376;
        int iM7766 = c2396.m7766();
        C17417 c17417 = this.f25382;
        Iterator it = c17417.f53275.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C17417) it.next()).f53271;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iM7766 == 0 || iM7766 == 2) {
            c17417.mo34849(c2396.m7765() + i2);
        } else {
            c17417.mo34849(c2396.m7765() + i);
        }
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ۧ */
    public final void mo6242() {
        C15094 c15094 = this.f25376;
        if (c15094 instanceof C2396) {
            int iM7766 = ((C2396) c15094).m7766();
            C17417 c17417 = this.f25382;
            if (iM7766 == 0 || iM7766 == 1) {
                this.f25376.m35706(c17417.f53271);
            } else {
                this.f25376.m35731(c17417.f53271);
            }
        }
    }
}
