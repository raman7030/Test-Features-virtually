package l;

/* JADX INFO: renamed from: l.ܳܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9ZH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14633 extends AbstractC8990 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f44742 = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f44743;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f44744;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23806 f44745;

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ֫ */
    public final int mo12171() {
        return 0;
    }

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ۧ */
    public final C9696 mo23231() {
        if (this.f27320 == 0) {
            return null;
        }
        int i = this.f27320;
        return new C9696(i < 4 ? f44742[i] : "0x".concat(C12085.m29467(i, 4)));
    }

    public C14633(C23806 c23806, C16044 c16044) {
        this.f44745 = c23806;
        this.f44743 = c16044.m37958();
        this.f44744 = c16044.m37955();
        this.f27318 = 11;
        this.f27321 = 3;
    }

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ܳ */
    public final void mo12172(C13222 c13222) {
        c13222.m32067(this.f44743);
        c13222.m32067(this.f44744);
        c13222.m32069(0);
        c13222.m32064(1);
        c13222.m32064(0);
        c13222.m32067(0);
        c13222.m32067(0);
        c13222.m32064(1);
        c13222.m32064(0);
        C23806 c23806 = this.f44745;
        c23806.m52486().mo2235(c13222);
        c13222.m32067(c23806.m52484());
        c13222.m32067(c23806.m52485());
        InterfaceC6873.f21237.mo2235(c13222);
        c13222.m32069(2);
    }

    @Override // l.AbstractC8990
    /* JADX INFO: renamed from: ᩳ */
    public final void mo12173(C13222 c13222) {
        c13222.m32062();
        c13222.m32062();
        c13222.m32058();
        c13222.m32059(c13222.m32062());
        c13222.m32063(4);
        c13222.m32065();
        c13222.m32063(4);
        this.f27320 = c13222.m32062();
        c13222.m32062();
        c13222.m32059(20);
    }
}
