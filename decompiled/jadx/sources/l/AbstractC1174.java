package l;

/* JADX INFO: renamed from: l.֨ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1174 implements InterfaceC10952, InterfaceC0804 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12463 f4221;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC10952 f4222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f4223 = null;

    public AbstractC1174(C12463 c12463, InterfaceC10952 interfaceC10952) {
        this.f4221 = c12463;
        this.f4222 = interfaceC10952;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        AbstractC19475 abstractC19475 = this.f4223;
        if (abstractC19475 != null) {
            return abstractC19475;
        }
        InterfaceC10952 interfaceC10952 = this.f4222;
        return C12463.m30619(this.f4221, interfaceC10952.mo3609(), interfaceC10952.getReference());
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f4222.mo3609();
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC0841 mo3975() {
        return this.f4222.mo3975();
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo3974() {
        return this.f4222.mo3974();
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public void mo3030(C19357 c19357) {
        this.f4223 = (AbstractC19475) c19357.m44609(getReference());
    }
}
