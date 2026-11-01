package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C14589 {

    /* JADX INFO: renamed from: ֫ */
    public final Iterator f41666;

    /* JADX INFO: renamed from: ۧ */
    public Map.Entry f41667;

    public C14589(AbstractC13919 abstractC13919) {
        Iterator itM46614 = abstractC13919.f39272.m46614();
        this.f41666 = itM46614;
        if (itM46614.hasNext()) {
            this.f41667 = (Map.Entry) itM46614.next();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33381(int i, AbstractC16402 abstractC16402) {
        while (true) {
            Map.Entry entry = this.f41667;
            if (entry == null || ((C2479) entry.getKey()).getNumber() >= i) {
                return;
            }
            C20625.m46592((C2479) this.f41667.getKey(), this.f41667.getValue(), abstractC16402);
            Iterator it = this.f41666;
            if (it.hasNext()) {
                this.f41667 = (Map.Entry) it.next();
            } else {
                this.f41667 = null;
            }
        }
    }
}
