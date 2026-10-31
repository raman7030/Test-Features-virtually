package l;

/* JADX INFO: renamed from: l.֨ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1216 extends C12563 {
    @Override // l.C12563
    /* JADX INFO: renamed from: ֫ */
    public final String mo2212() {
        return "()* loopback of 785:5: ({...}? annotation )*";
    }

    public C1216(C13999 c13999) {
        this.f37873 = c13999;
        this.f37867 = 43;
        this.f37871 = C13999.f41871;
        this.f37869 = C13999.f41974;
        this.f37868 = C13999.f42289;
        this.f37870 = C13999.f42008;
        this.f37865 = C13999.f42025;
        this.f37866 = C13999.f42061;
        this.f37872 = C13999.f41905;
    }

    @Override // l.C12563
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo4057(int i, InterfaceC11858 interfaceC11858) throws C16775 {
        InterfaceC21010 interfaceC21010 = (InterfaceC21010) interfaceC11858;
        if (i == 0) {
            interfaceC21010.mo28964(1);
            int iIndex = interfaceC21010.index();
            interfaceC21010.mo28966();
            int i2 = interfaceC21010.mo28964(1) == 5 ? 71 : 1;
            interfaceC21010.mo28963(iIndex);
            return i2;
        }
        throw new C16775("()* loopback of 785:5: ({...}? annotation )*", 43, i, interfaceC21010);
    }
}
