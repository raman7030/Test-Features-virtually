package l;

/* JADX INFO: renamed from: l.ۘܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3996 extends AbstractC6196 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f12666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f12667;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f12668;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f12669;

    public C3996(InterfaceC6818 interfaceC6818, int i, int i2, int i3, int i4) {
        super(i2 - i, i4 - i3);
        this.f12667 = interfaceC6818;
        this.f12665 = i;
        this.f12669 = i3;
        this.f12666 = i2;
        this.f12668 = i4;
    }

    @Override // l.AbstractC6196
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC13251 mo12042() {
        return new C2585(this.f12667, this.f12665, this.f12666, this.f12669, this.f12668);
    }
}
