package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6116 extends AbstractC3651 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f15372;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC20276 f15373;

    public C6116(Iterator it, InterfaceC20276 interfaceC20276) {
        this.f15372 = it;
        this.f15373 = interfaceC20276;
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Object next;
        do {
            Iterator it = this.f15372;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m6947();
                return null;
            }
        } while (!this.f15373.apply(next));
        return next;
    }
}
