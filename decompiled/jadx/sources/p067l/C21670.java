package p067l;

/* JADX INFO: renamed from: l.᩶ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C21670 implements InterfaceC18263 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6917 f68250;

    public C21670(C6917 c6917) {
        this.f68250 = c6917;
    }

    @Override // p067l.InterfaceC18263
    public final Object apply(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        C18236 c18236 = this.f68250.f18015.f13477;
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 != 4 && iMo4670 != 6 && iMo4670 != 16 && iMo4670 != 17) {
            switch (iMo4670) {
                case 21:
                    return new C10449(c18236, interfaceC12262);
                case 22:
                    return new C17153(c18236, interfaceC12262);
                case 23:
                    break;
                case 24:
                    return new C9108(c18236, interfaceC12262);
                case 25:
                    return new C22520(c18236, interfaceC12262);
                case 26:
                    return new C11791(c18236, interfaceC12262);
                default:
                    throw new C17034(null, "Unsupported encoded value type: %d", Integer.valueOf(interfaceC12262.mo4670()));
            }
        }
        return interfaceC12262;
    }
}
