package l;

/* JADX INFO: renamed from: l.ۚܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5408 extends AbstractC1174 implements InterfaceC12799 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12463 f16884;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f16885;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5408(C12463 c12463, InterfaceC12799 interfaceC12799) {
        super(c12463, interfaceC12799);
        this.f16884 = c12463;
        this.f16885 = null;
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC8293 mo9710() {
        AbstractC19475 abstractC19475 = this.f16885;
        if (abstractC19475 != null) {
            return abstractC19475;
        }
        InterfaceC12799 interfaceC12799 = (InterfaceC12799) this.f4222;
        return C12463.m30619(this.f16884, interfaceC12799.mo9711(), interfaceC12799.mo9710());
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۠ */
    public final int mo9711() {
        return ((InterfaceC12799) this.f4222).mo9711();
    }

    @Override // l.AbstractC1174, l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        super.mo3030(c19357);
        this.f16885 = (AbstractC19475) c19357.m44609(mo9710());
    }
}
