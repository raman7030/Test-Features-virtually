package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9EA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16816 extends C18158 {
    @Override // p067l.C18158
    /* JADX INFO: renamed from: ۧ */
    public final void mo9145(C2460 c2460) throws C14862 {
        c2460.m28121(2);
        int iM28125 = c2460.m28125();
        int iM28124 = c2460.m28124();
        if (iM28125 > 0 && iM28124 > 0) {
            ArrayList arrayList = new ArrayList();
            c2460.m28122(((C24864) this.f5707).mo16456() + iM28125);
            while (true) {
                int iM28108 = c2460.m28108();
                C19461 c19461 = new C19461();
                c19461.m44276(c2460);
                arrayList.add(c19461);
                if (c19461.m44275() == 0) {
                    break;
                } else {
                    c2460.m28122(c19461.m44275() + iM28108);
                }
            }
        }
        c2460.m28122(((C24864) this.f5707).mo16456() + iM28125 + iM28124);
    }
}
