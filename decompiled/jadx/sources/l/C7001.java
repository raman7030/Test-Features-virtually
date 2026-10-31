package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 71XR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7001 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("zip");
        C15717 c15717 = new C15717(c2450.m7921());
        List listM7909 = c2450.m7909();
        if (listM7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            if (interfaceC17889.isDirectory()) {
                c15717.m37058((C12645) interfaceC17889);
                return;
            } else {
                c15717.m37057((C12645) interfaceC17889);
                return;
            }
        }
        c15717.m37056(listM7909);
    }
}
