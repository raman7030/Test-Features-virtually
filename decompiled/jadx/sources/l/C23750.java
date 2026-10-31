package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H87Q */
/* JADX INFO: loaded from: classes.dex */
public final class C23750 extends AbstractC8333 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f76892 = new C17400(new C23750(EnumC0571.f2251));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5511 f76893;

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        c23525.m51975((Number) obj);
    }

    public C23750(InterfaceC5511 interfaceC5511) {
        this.f76893 = interfaceC5511;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15387 m52398(InterfaceC5511 interfaceC5511) {
        if (interfaceC5511 != EnumC0571.f2251) {
            return new C17400(new C23750(interfaceC5511));
        }
        return f76892;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        EnumC14352 enumC14352M40398 = c17175.m40398();
        int i = C14577.f44633[enumC14352M40398.ordinal()];
        if (i == 1) {
            c17175.m40394();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f76893.mo2340(c17175);
        }
        throw new C14682("Expecting number, got: " + enumC14352M40398 + "; at path " + c17175.m40397());
    }
}
