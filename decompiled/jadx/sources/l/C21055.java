package l;

/* JADX INFO: renamed from: l.᩷ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C21055 implements InterfaceC22737 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 f67921;

    public C21055(C17757 c17757, int i) {
        this.f67921 = (C0117) ((C14934) c17757.m41589().get(i)).getFields().get(0);
    }

    @Override // l.InterfaceC22737
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo32611(AbstractC4121 abstractC4121) {
        return abstractC4121.hasField(this.f67921);
    }

    @Override // l.InterfaceC22737
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo32612(AbstractC19916 abstractC19916) {
        return abstractC19916.hasField(this.f67921);
    }

    @Override // l.InterfaceC22737
    /* JADX INFO: renamed from: ֫ */
    public final C0117 mo32608(AbstractC4121 abstractC4121) {
        C0117 c0117 = this.f67921;
        if (abstractC4121.hasField(c0117)) {
            return c0117;
        }
        return null;
    }

    @Override // l.InterfaceC22737
    /* JADX INFO: renamed from: ۧ */
    public final C0117 mo32610(AbstractC19916 abstractC19916) {
        C0117 c0117 = this.f67921;
        if (abstractC19916.hasField(c0117)) {
            return c0117;
        }
        return null;
    }

    @Override // l.InterfaceC22737
    /* JADX INFO: renamed from: ֫ */
    public final void mo32609(AbstractC19916 abstractC19916) {
        abstractC19916.clearField(this.f67921);
    }
}
