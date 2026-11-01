package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C14360 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f41052 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m32956(C15030 c15030) {
        if (this.f41052 == null) {
            this.f41052 = new ArrayList();
        }
        for (int i = 0; i < this.f41052.size(); i++) {
            if (((C15030) this.f41052.get(i)).f42938.f34461 > c15030.f42938.f34461) {
                this.f41052.add(i, c15030);
                return;
            }
        }
        this.f41052.add(c15030);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32955(C14360 c14360) {
        if (c14360.f41052 == null) {
            return;
        }
        if (this.f41052 == null) {
            this.f41052 = new ArrayList(c14360.f41052.size());
        }
        Iterator it = c14360.f41052.iterator();
        while (it.hasNext()) {
            m32956((C15030) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m32954() {
        return this.f41052;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32957() {
        ArrayList arrayList = this.f41052;
        return arrayList == null || arrayList.isEmpty();
    }

    public final String toString() {
        if (this.f41052 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f41052.iterator();
        while (it.hasNext()) {
            sb.append(((C15030) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
