package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12617 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f38026 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30879(C13322 c13322) {
        if (this.f38026 == null) {
            this.f38026 = new ArrayList();
        }
        for (int i = 0; i < this.f38026.size(); i++) {
            if (((C13322) this.f38026.get(i)).f39872.f31499 > c13322.f39872.f31499) {
                this.f38026.add(i, c13322);
                return;
            }
        }
        this.f38026.add(c13322);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30878(C12617 c12617) {
        if (c12617.f38026 == null) {
            return;
        }
        if (this.f38026 == null) {
            this.f38026 = new ArrayList(c12617.f38026.size());
        }
        Iterator it = c12617.f38026.iterator();
        while (it.hasNext()) {
            m30879((C13322) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m30877() {
        return this.f38026;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30880() {
        ArrayList arrayList = this.f38026;
        return arrayList == null || arrayList.isEmpty();
    }

    public final String toString() {
        if (this.f38026 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f38026.iterator();
        while (it.hasNext()) {
            sb.append(((C13322) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
