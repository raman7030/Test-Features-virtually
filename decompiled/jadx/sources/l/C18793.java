package l;

/* JADX INFO: renamed from: l.ᩴܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18793 extends AbstractC21005 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1084 f59317;

    public C18793(AbstractC19499 abstractC19499) {
        super(0);
        this.f59317 = abstractC19499;
    }

    public C18793(InterfaceC1084 interfaceC1084, int i, int i2) {
        super(i, i2);
        this.f59317 = interfaceC1084;
    }

    @Override // l.AbstractC21005
    /* JADX INFO: renamed from: ۧ */
    public final int mo35370() {
        return this.f59317.size();
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final char mo13736(int i) {
        return this.f59317.getChar(i);
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16770 mo13737(int i, int i2) {
        return new C18793(this.f59317, i, i2);
    }
}
