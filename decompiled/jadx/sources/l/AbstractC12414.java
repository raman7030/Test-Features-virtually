package l;

/* JADX INFO: renamed from: l.۫۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12414 extends AbstractC6064 {
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo30583();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract boolean mo30585();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object mo30584() {
        AbstractC20821 abstractC20821M16923 = m16923();
        return abstractC20821M16923 == null ? C10298.f31024 : abstractC20821M16923.mo42037();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo30581(AbstractC23642 abstractC23642) {
        int iM47308;
        C20697 c20697M47315;
        if (mo30583()) {
            C17168 c17168M16922 = m16922();
            do {
                c20697M47315 = c17168M16922.m47315();
                if (c20697M47315 instanceof AbstractC20821) {
                    return false;
                }
            } while (!c20697M47315.m47310(abstractC23642, c17168M16922));
        } else {
            C17168 c17168M16923 = m16922();
            C13119 c13119 = new C13119(abstractC23642, this);
            do {
                C20697 c20697M47316 = c17168M16923.m47315();
                if (c20697M47316 instanceof AbstractC20821) {
                    return false;
                }
                iM47308 = c20697M47316.m47308(abstractC23642, c17168M16923, c13119);
                if (iM47308 != 1) {
                }
            } while (iM47308 != 2);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7475 m30582() {
        return new C20176(this);
    }
}
