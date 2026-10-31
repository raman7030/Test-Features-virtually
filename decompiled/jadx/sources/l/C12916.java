package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 19Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12916 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("payload");
        C14401 c14401 = new C14401(c2450.m7917());
        c14401.m34420();
        List listM7909 = c2450.m7909();
        if (listM7909.size() == 1) {
            C19143 c19143 = (C19143) listM7909.get(0);
            c14401.m34404(c19143.getName(), (ViewOnLongClickListenerC9963) null);
            c14401.m34415(c19143.getSize()).m19153(8);
            c14401.m34396(c19143.m44212());
            c14401.m34417();
            c14401.m34408();
            C6058.m16907(c14401.m34409(), c2450.m7921(), c19143);
            return;
        }
        c14401.m34405(listM7909);
        Iterator it = listM7909.iterator();
        long size = 0;
        long jM44212 = 0;
        while (it.hasNext()) {
            C19143 c19144 = (C19143) ((InterfaceC17889) it.next());
            size += c19144.getSize();
            jM44212 += c19144.m44212();
        }
        c14401.m34415(size).m19153(8);
        c14401.m34396(jM44212);
        c14401.m34408();
    }
}
