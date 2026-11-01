package p067l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۠۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10024 {

    /* JADX INFO: renamed from: ֫ */
    public HashSet f27769 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final void m23403(AbstractC17043 abstractC17043) {
        if (abstractC17043 == null || !(abstractC17043 instanceof C14717)) {
            return;
        }
        this.f27769.add(abstractC17043.mo33651());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23404() {
        if (!C12902.m29572()) {
            return true;
        }
        Iterator it = this.f27769.iterator();
        while (it.hasNext()) {
            String strM33650 = ((C14717) it.next()).m33650();
            C21424 c21424 = C14717.f41957;
            if (!C21424.m48554(strM33650)) {
                C14717.f41954.mo4062(new AtomicReference(strM33650));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m23405() {
        if (!C12902.m29572()) {
            return Collections.EMPTY_LIST;
        }
        return (List) C7480.stream(this.f27769).filter(new C8628(1)).sorted().collect(C24205.toList());
    }
}
