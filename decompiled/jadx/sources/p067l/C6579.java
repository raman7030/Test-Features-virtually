package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A7SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6579 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f16990;

    /* JADX INFO: renamed from: ֫ */
    public final List m15032() {
        ArrayList arrayList = this.f16990;
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15034(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m15033(((AbstractC2555) it.next()).m3764());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15033(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f16990 == null) {
            this.f16990 = new ArrayList();
        }
        if (this.f16990.isEmpty()) {
            this.f16990.addAll(list);
            return;
        }
        int size = this.f16990.size() - 1;
        C21332 c21332 = (C21332) this.f16990.get(size);
        C21332 c21333 = (C21332) list.get(0);
        if (c21332.m48341() + c21332.m48340() == c21333.m48340()) {
            this.f16990.set(size, C21332.m48336(c21332.m48342(), c21332.m48337(), c21332.m48340(), c21333.m48341() + c21332.m48341()));
            this.f16990.addAll(list.subList(1, list.size()));
            return;
        }
        this.f16990.addAll(list);
    }
}
