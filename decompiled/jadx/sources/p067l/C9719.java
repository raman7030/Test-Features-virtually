package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9719 extends AbstractC22481 {
    public final String toString() {
        return ":only-of-type";
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        C21199 c21199Mo30143 = c211910.mo30143();
        if (c21199Mo30143 != null && !(c21199Mo30143 instanceof C3092)) {
            Iterator<E> it = c21199Mo30143.m47890().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C21199) it.next()).m47882().equals(c211910.m47882())) {
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
