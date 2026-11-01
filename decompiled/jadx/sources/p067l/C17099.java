package p067l;

/* JADX INFO: renamed from: l.ܶ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17099 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21283 f50522;

    /* JADX INFO: renamed from: ۧ */
    public final String f50523;

    /* JADX INFO: renamed from: ܽ */
    public final C14849 f50524;

    public C17099(AbstractC21283 abstractC21283, C14849 c14849, String str) {
        this.f50522 = abstractC21283;
        this.f50524 = c14849;
        this.f50523 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private void m38732() {
        AbstractC21283 abstractC21283 = this.f50522;
        abstractC21283.unregisterAdapterDataObserver(this);
        int iMo19546 = ((InterfaceC23806) abstractC21283).mo19546(this.f50523);
        if (iMo19546 != -1) {
            this.f50524.scrollToPosition(iMo19546);
        }
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        m38732();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeChanged(int i, int i2) {
        m38732();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        m38732();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeInserted(int i, int i2) {
        m38732();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeRemoved(int i, int i2) {
        m38732();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeMoved(int i, int i2, int i3) {
        m38732();
    }
}
