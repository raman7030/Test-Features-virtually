package p067l;

/* JADX INFO: renamed from: l.᩷ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22322 implements InterfaceC5557 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16955 f70476;

    public /* synthetic */ C22322(C16955 c16955) {
        this.f70476 = c16955;
    }

    @Override // p067l.InterfaceC5557
    /* JADX INFO: renamed from: ֫ */
    public final void mo12289(InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
        C16955 c16955 = this.f70476;
        String str = c16955.f50162;
        if (interfaceC22528.mo50214() != c16955.f50168) {
            return;
        }
        if (c16955.f50164 == null) {
            InterfaceC6434 interfaceC6434Mo31469 = interfaceC22528.mo31469();
            InterfaceC3080 type = interfaceC22528.getType();
            int i = c16955.f50168;
            interfaceC6434Mo31469.getClass();
            int iMo14722 = interfaceC6434Mo31469.mo14722();
            c16955.f50164 = new C14944(type.getTypeName(), i, iMo14722, type.mo5199(), interfaceC22528.mo50213(), interfaceC22528.mo31468());
        }
        String strM10472 = C4927.m10472(interfaceC9116);
        c16955.f50157.add(strM10472);
        if ("*".equals(str) || str.equals(strM10472)) {
            c16955.f50155.add(new C7569(interfaceC9116, interfaceC22528));
        }
    }
}
