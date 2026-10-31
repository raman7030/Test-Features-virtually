package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܰܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13925 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f41596;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41597;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33362(int i, List list) {
        AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i);
        if (!C4570.m13429(abstractC7479)) {
            return false;
        }
        this.f41596 = abstractC7479;
        this.f41597 = ((InterfaceC1779) abstractC7479).mo1790();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33360() {
        return this.f41597;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33361(C15152 c15152) {
        c15152.f46301.m3815(this.f41596);
    }
}
