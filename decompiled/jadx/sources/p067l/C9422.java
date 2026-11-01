package p067l;

/* JADX INFO: renamed from: l.۟ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9DL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9422 extends AbstractC24174 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC4410 f25723 = C13128.m30022(C9422.class);

    /* JADX INFO: renamed from: ۧ */
    public C23504 f25724;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC21493 f25725;

    public C9422(C23504 c23504, InterfaceC21493 interfaceC21493) {
        this.f25724 = c23504;
        this.f25725 = interfaceC21493;
    }

    @Override // p067l.AbstractC24174
    /* JADX INFO: renamed from: ֫ */
    public final void mo18751(C19500 c19500) {
        C16953 c16953M52276;
        long jM54604 = ((C24864) c19500.m23026()).m54604();
        InterfaceC4410 interfaceC4410 = f25723;
        if (jM54604 == -1) {
            interfaceC4410.mo9183("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.f17493.m15402(c19500);
            return;
        }
        if (c19500 instanceof C22696) {
            interfaceC4410.mo9183("Passthrough Signature Verification as packet is decrypted");
            this.f17493.m15402(c19500);
            return;
        }
        C24864 c24864 = (C24864) c19500.m23026();
        EnumC4077 enumC4077 = EnumC4077.SMB2_FLAGS_SIGNED;
        boolean zM54603 = c24864.m54603(enumC4077);
        C23504 c23504 = this.f25724;
        if (!zM54603) {
            if (((C24864) c19500.m23026()).m54603(enumC4077) || c19500.m44325() || c19500.m44327() || (c16953M52276 = c23504.m52276(Long.valueOf(((C24864) c19500.m23026()).m54606()))) == null || !c16953M52276.m38539()) {
                this.f17493.m15402(c19500);
                return;
            } else {
                interfaceC4410.mo9198(c19500, "Illegal request, session requires message signing, but packet {} is not signed.");
                this.f17493.m15402(new C2578(c19500.m23026()));
                return;
            }
        }
        long jM54606 = ((C24864) c19500.m23026()).m54606();
        if (jM54606 == 0 || ((C24864) c19500.m23026()).m54620() == EnumC24036.SMB2_SESSION_SETUP) {
            this.f17493.m15402(c19500);
            return;
        }
        C16953 c16953M52277 = c23504.m52276(Long.valueOf(jM54606));
        if (c16953M52277 == null) {
            interfaceC4410.mo9197("Could not find session << {} >> for packet {}.", Long.valueOf(jM54606), c19500);
            this.f17493.m15402(new C2578(c19500.m23026()));
        } else {
            c16953M52277.m38533((C24864) c19500.m23026(), false);
            this.f25725.getClass();
            interfaceC4410.mo9195(c19500, "Signature for packet {} verified.");
            this.f17493.m15402(c19500);
        }
    }
}
