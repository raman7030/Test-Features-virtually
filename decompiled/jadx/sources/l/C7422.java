package l;

/* JADX INFO: renamed from: l.۟ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9DL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7422 extends AbstractC22944 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f22810 = C11321.m27961(C7422.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22239 f22811;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC20123 f22812;

    public C7422(C22239 c22239, InterfaceC20123 interfaceC20123) {
        this.f22811 = c22239;
        this.f22812 = interfaceC20123;
    }

    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫ */
    public final void mo16824(C18026 c18026) {
        C15346 c15346M49948;
        long jM52201 = ((C23670) c18026.m21061()).m52201();
        InterfaceC2148 interfaceC2148 = f22810;
        if (jM52201 == -1) {
            interfaceC2148.mo7088("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.f14665.m13513(c18026);
            return;
        }
        if (c18026 instanceof C21389) {
            interfaceC2148.mo7088("Passthrough Signature Verification as packet is decrypted");
            this.f14665.m13513(c18026);
            return;
        }
        C23670 c23670 = (C23670) c18026.m21061();
        EnumC1798 enumC1798 = EnumC1798.SMB2_FLAGS_SIGNED;
        boolean zM52200 = c23670.m52200(enumC1798);
        C22239 c22239 = this.f22811;
        if (!zM52200) {
            if (((C23670) c18026.m21061()).m52200(enumC1798) || c18026.m42074() || c18026.m42076() || (c15346M49948 = c22239.m49948(Long.valueOf(((C23670) c18026.m21061()).m52203()))) == null || !c15346M49948.m36381()) {
                this.f14665.m13513(c18026);
                return;
            } else {
                interfaceC2148.mo7103(c18026, "Illegal request, session requires message signing, but packet {} is not signed.");
                this.f14665.m13513(new C0221(c18026.m21061()));
                return;
            }
        }
        long jM52203 = ((C23670) c18026.m21061()).m52203();
        if (jM52203 == 0 || ((C23670) c18026.m21061()).m52217() == EnumC22799.SMB2_SESSION_SETUP) {
            this.f14665.m13513(c18026);
            return;
        }
        C15346 c15346M49949 = c22239.m49948(Long.valueOf(jM52203));
        if (c15346M49949 == null) {
            interfaceC2148.mo7102("Could not find session << {} >> for packet {}.", Long.valueOf(jM52203), c18026);
            this.f14665.m13513(new C0221(c18026.m21061()));
        } else {
            c15346M49949.m36375((C23670) c18026.m21061(), false);
            this.f22812.getClass();
            interfaceC2148.mo7100(c18026, "Signature for packet {} verified.");
            this.f14665.m13513(c18026);
        }
    }
}
