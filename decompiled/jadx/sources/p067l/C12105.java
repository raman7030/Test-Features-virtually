package p067l;

/* JADX INFO: renamed from: l.ۤۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12105 extends AbstractC24174 {
    @Override // p067l.AbstractC24174, p067l.AbstractC6740
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8559(AbstractC9837 abstractC9837) {
        return (abstractC9837 instanceof C19500) && ((C24864) ((C19500) abstractC9837).m23026()).m54619() != 0;
    }

    @Override // p067l.AbstractC24174
    /* JADX INFO: renamed from: ֫ */
    public final void mo18751(C19500 c19500) throws C4630 {
        do {
            this.f17493.m15402(c19500);
            try {
                c19500 = c19500.mo44326();
            } catch (C14862 e) {
                throw new C4630("Missing compounded message data", e);
            }
        } while (c19500 != null);
    }
}
