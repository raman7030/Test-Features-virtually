package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943 extends AbstractC1349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f12564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18842 f12565;

    public C3943(Iterator it, InterfaceC18842 interfaceC18842) {
        this.f12564 = it;
        this.f12565 = interfaceC18842;
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Object next;
        do {
            Iterator it = this.f12564;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m4715();
                return null;
            }
        } while (!this.f12565.apply(next));
        return next;
    }
}
