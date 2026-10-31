package l;

/* JADX INFO: renamed from: l.ۤۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10245 extends AbstractC22944 {
    @Override // l.AbstractC22944, l.AbstractC4600
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6402(AbstractC7859 abstractC7859) {
        return (abstractC7859 instanceof C18026) && ((C23670) ((C18026) abstractC7859).m21061()).m52216() != 0;
    }

    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫ */
    public final void mo16824(C18026 c18026) throws C2380 {
        do {
            this.f14665.m13513(c18026);
            try {
                c18026 = c18026.mo42075();
            } catch (C13146 e) {
                throw new C2380("Missing compounded message data", e);
            }
        } while (c18026 != null);
    }
}
