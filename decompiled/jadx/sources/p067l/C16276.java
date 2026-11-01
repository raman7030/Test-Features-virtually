package p067l;

/* JADX INFO: renamed from: l.ܳܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9ZH */
/* JADX INFO: loaded from: classes5.dex */
public final class C16276 extends AbstractC10913 {

    /* JADX INFO: renamed from: ۨ */
    public static final String[] f47849 = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};

    /* JADX INFO: renamed from: ۛ */
    public int f47850;

    /* JADX INFO: renamed from: ۤ */
    public int f47851;

    /* JADX INFO: renamed from: ۫ */
    public C24994 f47852;

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ֫ */
    public final int mo14092() {
        return 0;
    }

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ۧ */
    public final C11584 mo25175() {
        if (this.f30254 == 0) {
            return null;
        }
        int i = this.f30254;
        return new C11584(i < 4 ? f47849[i] : "0x".concat(C13854.m31529(i, 4)));
    }

    public C16276(C24994 c24994, C17617 c17617) {
        this.f47852 = c24994;
        this.f47850 = c17617.m40145();
        this.f47851 = c17617.m40142();
        this.f30252 = 11;
        this.f30255 = 3;
    }

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ܳ */
    public final void mo14093(C14935 c14935) {
        c14935.m34165(this.f47850);
        c14935.m34165(this.f47851);
        c14935.m34167(0);
        c14935.m34162(1);
        c14935.m34162(0);
        c14935.m34165(0);
        c14935.m34165(0);
        c14935.m34162(1);
        c14935.m34162(0);
        C24994 c24994 = this.f47852;
        c24994.m54895().mo4602(c14935);
        c14935.m34165(c24994.m54893());
        c14935.m34165(c24994.m54894());
        InterfaceC8901.f24115.mo4602(c14935);
        c14935.m34167(2);
    }

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ᩳ */
    public final void mo14094(C14935 c14935) {
        c14935.m34160();
        c14935.m34160();
        c14935.m34156();
        c14935.m34157(c14935.m34160());
        c14935.m34161(4);
        c14935.m34163();
        c14935.m34161(4);
        this.f30254 = c14935.m34160();
        c14935.m34160();
        c14935.m34157(20);
    }
}
