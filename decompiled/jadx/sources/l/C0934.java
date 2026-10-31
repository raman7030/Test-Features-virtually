package l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B6A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0934 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("archive");
        C7408 c7408 = new C7408(c2450.m7921());
        List listM7909 = c2450.m7909();
        if (listM7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            if (interfaceC17889.isDirectory()) {
                c7408.m19935((C10231) interfaceC17889);
                return;
            } else {
                c7408.m19934((C10231) interfaceC17889);
                return;
            }
        }
        c7408.m19933(listM7909);
    }
}
