package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16392 {

    /* JADX INFO: renamed from: ֫ */
    public C25110 f48182;

    /* JADX INFO: renamed from: ֫ */
    public final void m37213(Set set) {
        C25110 c25110 = this.f48182;
        c25110.f80354.clear();
        c25110.f80355.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf == -1) {
                c25110.f80355.add(str);
            } else {
                c25110.m55098(str.substring(0, iLastIndexOf)).f80355.add(str.substring(iLastIndexOf + 1));
            }
        }
        c25110.m55099();
    }
}
