package l;

/* JADX INFO: renamed from: l.ܰۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13577 extends AbstractC3036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1625 f40508;

    public C13577(AbstractC18245 abstractC18245) {
        super(0);
        this.f40508 = abstractC18245;
    }

    public C13577(InterfaceC1625 interfaceC1625, int i, int i2) {
        super(i, i2);
        this.f40508 = interfaceC1625;
    }

    @Override // l.AbstractC3036
    /* JADX INFO: renamed from: ۧ */
    public final int mo9287() {
        return this.f40508.size();
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f40508.get(i);
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C13577(this.f40508, i, i2);
    }
}
