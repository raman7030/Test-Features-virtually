package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A7SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4431 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f14165;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m13151() {
        ArrayList arrayList = this.f14165;
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13153(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m13152(((AbstractC0197) it.next()).m1351());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13152(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f14165 == null) {
            this.f14165 = new ArrayList();
        }
        if (this.f14165.isEmpty()) {
            this.f14165.addAll(list);
            return;
        }
        int size = this.f14165.size() - 1;
        C19954 c19954 = (C19954) this.f14165.get(size);
        C19954 c19955 = (C19954) list.get(0);
        if (c19954.m46027() + c19954.m46026() == c19955.m46026()) {
            this.f14165.set(size, C19954.m46022(c19954.m46028(), c19954.m46023(), c19954.m46026(), c19955.m46027() + c19954.m46027()));
            this.f14165.addAll(list.subList(1, list.size()));
            return;
        }
        this.f14165.addAll(list);
    }
}
