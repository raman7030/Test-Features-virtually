package l;

/* JADX INFO: renamed from: l.ۨۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11474 extends C9642 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9316 f34282;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11474(C9316 c9316, C16696 c16696) {
        super(c16696);
        this.f34282 = c9316;
    }

    @Override // l.C9642, l.InterfaceC18380
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10410 mo4329(InterfaceC10410 interfaceC10410) {
        if (interfaceC10410.mo2302() == 29) {
            InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
            C9316 c9316 = this.f34282;
            if (c9316.f28267.m11182(interfaceC22404.getType())) {
                return new C1554(c9316, this.f29217, interfaceC22404);
            }
        }
        return super.mo4329(interfaceC10410);
    }
}
