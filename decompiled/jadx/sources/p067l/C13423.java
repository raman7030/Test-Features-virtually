package p067l;

/* JADX INFO: renamed from: l.ۨۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13423 implements InterfaceC19482 {

    /* JADX INFO: renamed from: ֫ */
    public final int f37713;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC12811 f37714;

    /* JADX INFO: renamed from: ܽ */
    public final C18845 f37715;

    public C13423(AbstractC12811 abstractC12811, int i, C18845 c18845) {
        this.f37714 = abstractC12811;
        this.f37713 = i;
        this.f37715 = c18845;
    }

    @Override // p067l.InterfaceC19482
    public final int getKey() {
        return this.f37713;
    }

    @Override // p067l.InterfaceC19482
    /* JADX INFO: renamed from: ֫ */
    public final int mo13943() {
        return this.f37715.m42919() - this.f37714.m29363().m39874();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18845 m30569() {
        return this.f37715;
    }
}
