package p067l;

/* JADX INFO: renamed from: l.ᩴܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20229 extends AbstractC22332 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3399 f62540;

    public C20229(AbstractC20900 abstractC20900) {
        super(0);
        this.f62540 = abstractC20900;
    }

    public C20229(InterfaceC3399 interfaceC3399, int i, int i2) {
        super(i, i2);
        this.f62540 = interfaceC3399;
    }

    @Override // p067l.AbstractC22332
    /* JADX INFO: renamed from: ۧ */
    public final int mo37522() {
        return this.f62540.size();
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final char mo15611(int i) {
        return this.f62540.getChar(i);
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18307 mo15612(int i, int i2) {
        return new C20229(this.f62540, i, i2);
    }
}
