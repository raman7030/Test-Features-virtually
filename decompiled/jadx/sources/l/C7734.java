package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7734 extends AbstractC21162 {
    public final String toString() {
        return ":only-of-type";
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        C19814 c19814Mo28099 = c19815.mo28099();
        if (c19814Mo28099 != null && !(c19814Mo28099 instanceof C0762)) {
            Iterator<E> it = c19814Mo28099.m45579().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C19814) it.next()).m45571().equals(c19815.m45571())) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
