package l;

/* JADX INFO: renamed from: l.᩶ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20309 implements InterfaceC16724 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4786 f65575;

    public C20309(C4786 c4786) {
        this.f65575 = c4786;
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        C16696 c16696 = this.f65575.f15183.f10670;
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 != 4 && iMo2302 != 6 && iMo2302 != 16 && iMo2302 != 17) {
            switch (iMo2302) {
                case 21:
                    return new C8502(c16696, interfaceC10410);
                case 22:
                    return new C15556(c16696, interfaceC10410);
                case 23:
                    break;
                case 24:
                    return new C7091(c16696, interfaceC10410);
                case 25:
                    return new C21203(c16696, interfaceC10410);
                case 26:
                    return new C9914(c16696, interfaceC10410);
                default:
                    throw new C15431(null, "Unsupported encoded value type: %d", Integer.valueOf(interfaceC10410.mo2302()));
            }
        }
        return interfaceC10410;
    }
}
