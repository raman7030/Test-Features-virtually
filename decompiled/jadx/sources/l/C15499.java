package l;

/* JADX INFO: renamed from: l.ܶ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15499 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 f47391;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f47392;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13132 f47393;

    public C15499(AbstractC19902 abstractC19902, C13132 c13132, String str) {
        this.f47391 = abstractC19902;
        this.f47393 = c13132;
        this.f47392 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36573() {
        AbstractC19902 abstractC19902 = this.f47391;
        abstractC19902.unregisterAdapterDataObserver(this);
        int iMo17606 = ((InterfaceC22556) abstractC19902).mo17606(this.f47392);
        if (iMo17606 != -1) {
            this.f47393.scrollToPosition(iMo17606);
        }
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        m36573();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2) {
        m36573();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        m36573();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeInserted(int i, int i2) {
        m36573();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeRemoved(int i, int i2) {
        m36573();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeMoved(int i, int i2, int i3) {
        m36573();
    }
}
