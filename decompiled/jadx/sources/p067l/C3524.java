package p067l;

/* JADX INFO: renamed from: l.֨ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3524 extends C14308 {
    @Override // p067l.C14308
    /* JADX INFO: renamed from: ֫ */
    public final String mo4579() {
        return "()* loopback of 785:5: ({...}? annotation )*";
    }

    public C3524(C15673 c15673) {
        this.f40899 = c15673;
        this.f40893 = 43;
        this.f40897 = C15673.f44954;
        this.f40895 = C15673.f45057;
        this.f40894 = C15673.f45372;
        this.f40896 = C15673.f45091;
        this.f40891 = C15673.f45108;
        this.f40892 = C15673.f45144;
        this.f40898 = C15673.f44988;
    }

    @Override // p067l.C14308
    /* JADX INFO: renamed from: ۧ */
    public final int mo6301(int i, InterfaceC13638 interfaceC13638) throws C18311 {
        InterfaceC22336 interfaceC22336 = (InterfaceC22336) interfaceC13638;
        if (i == 0) {
            interfaceC22336.mo31015(1);
            int iIndex = interfaceC22336.index();
            interfaceC22336.mo31017();
            int i2 = interfaceC22336.mo31015(1) == 5 ? 71 : 1;
            interfaceC22336.mo31014(iIndex);
            return i2;
        }
        throw new C18311("()* loopback of 785:5: ({...}? annotation )*", 43, i, interfaceC22336);
    }
}
