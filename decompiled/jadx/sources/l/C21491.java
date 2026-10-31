package l;

/* JADX INFO: renamed from: l.᩸ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9M2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21491 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC8085 f69130;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC17236 f69131;

    public C21491(InterfaceC8085 interfaceC8085, InterfaceC17236 interfaceC17236) {
        C11233.m27805(interfaceC8085, "defaultLifecycleObserver");
        this.f69130 = interfaceC8085;
        this.f69131 = interfaceC17236;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        int i = C15139.f46260[enumC22901.ordinal()];
        InterfaceC8085 interfaceC8085 = this.f69130;
        switch (i) {
            case 1:
                interfaceC8085.mo6024(interfaceC23586);
                break;
            case 2:
                interfaceC8085.mo6026(interfaceC23586);
                break;
            case 3:
                interfaceC8085.mo6025(interfaceC23586);
                break;
            case 4:
                interfaceC8085.mo6027(interfaceC23586);
                break;
            case 5:
                interfaceC8085.mo6029(interfaceC23586);
                break;
            case 6:
                interfaceC8085.mo6028(interfaceC23586);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC17236 interfaceC17236 = this.f69131;
        if (interfaceC17236 != null) {
            interfaceC17236.mo2195(interfaceC23586, enumC22901);
        }
    }
}
