package l;

/* JADX INFO: renamed from: l.ۢܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes3.dex */
public class C9642 implements InterfaceC18380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16696 f29217;

    public C9642(C16696 c16696) {
        this.f29217 = c16696;
    }

    @Override // l.InterfaceC18380
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceC10410 mo4329(InterfaceC10410 interfaceC10410) {
        switch (interfaceC10410.mo2302()) {
            case 24:
                return new C20931(this, (InterfaceC14684) interfaceC10410);
            case 25:
                return new C23752(this, (InterfaceC11821) interfaceC10410);
            case 26:
                return new C6819(this, (InterfaceC1985) interfaceC10410);
            case 27:
                return new C14579(this, (InterfaceC6176) interfaceC10410);
            case 28:
                return new C17402(this, (InterfaceC20288) interfaceC10410);
            case 29:
                return new C18108(this, (InterfaceC22404) interfaceC10410);
            default:
                return interfaceC10410;
        }
    }
}
