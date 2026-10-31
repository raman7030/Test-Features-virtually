package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۠۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8055 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f24856 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21436(AbstractC15440 abstractC15440) {
        if (abstractC15440 == null || !(abstractC15440 instanceof C12993)) {
            return;
        }
        this.f24856.add(abstractC15440.mo31566());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21437() {
        if (!C11083.m27510()) {
            return true;
        }
        Iterator it = this.f24856.iterator();
        while (it.hasNext()) {
            String strM31565 = ((C12993) it.next()).m31565();
            C20050 c20050 = C12993.f38911;
            if (!C20050.m46238(strM31565)) {
                C12993.f38908.mo1664(new AtomicReference(strM31565));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m21438() {
        if (!C11083.m27510()) {
            return Collections.EMPTY_LIST;
        }
        return (List) C5378.stream(this.f24856).filter(new C6586(1)).sorted().collect(C22976.toList());
    }
}
