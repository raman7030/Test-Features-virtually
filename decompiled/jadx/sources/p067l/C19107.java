package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19107 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final String f56999;

    public final String toString() {
        return C6988.m16053("[^", this.f56999, "]");
    }

    public C19107(String str) {
        C18515.m42066(str);
        this.f56999 = C24550.m54147(str);
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        Iterator it = c211910.mo27062().m38895().iterator();
        while (it.hasNext()) {
            if (C24550.m54147(((C11140) it.next()).getKey()).startsWith(this.f56999)) {
                return true;
            }
        }
        return false;
    }
}
