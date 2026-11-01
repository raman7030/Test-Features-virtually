package p067l;

/* JADX INFO: renamed from: l.ܰۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15456 extends AbstractC24174 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC4410 f44149 = C13128.m30022(C15456.class);

    /* JADX INFO: renamed from: ۧ */
    public final C11435 f44150;

    /* JADX INFO: renamed from: ܽ */
    public final C9284 f44151;

    public C15456(C9284 c9284, C11435 c11435) {
        this.f44151 = c9284;
        this.f44150 = c11435;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    @Override // p067l.AbstractC24174
    /* JADX INFO: renamed from: ֫ */
    public final void mo18751(C19500 c19500) throws C4630 {
        Long lValueOf = Long.valueOf(((C24864) c19500.m23026()).m54604());
        C11435 c11435 = this.f44150;
        C20152 c20152M26422 = c11435.m26422(lValueOf);
        try {
            C9284 c9284 = this.f44151;
            AbstractC3131 abstractC3131M45607 = c20152M26422.m45607();
            c9284.getClass();
            C18158 c18158M21498 = C9284.m21498(abstractC3131M45607, c19500);
            C20152 c20152M26425 = c11435.m26425(Long.valueOf(((C24864) c18158M21498.mo5341()).m54604()));
            boolean zM41368 = c18158M21498.m41368();
            EnumC24036 enumC24036M54620 = ((C24864) c18158M21498.mo5341()).m54620();
            long jM54605 = ((C24864) c18158M21498.mo5341()).m54605();
            if (enumC24036M54620 == EnumC24036.SMB2_READ) {
                if (jM54605 == EnumC9460.STATUS_SUCCESS.getValue() || jM54605 == EnumC9460.STATUS_END_OF_FILE.getValue()) {
                    zM41368 = true;
                } else {
                    zM41368 = false;
                }
            } else if (enumC24036M54620 == EnumC24036.SMB2_WRITE) {
                if (jM54605 == EnumC9460.STATUS_SUCCESS.getValue()) {
                    zM41368 = true;
                } else {
                    zM41368 = false;
                }
            }
            if (zM41368) {
                boolean z = c18158M21498 instanceof C20487;
            }
            c20152M26425.m45606().m42704(c18158M21498);
        } catch (C14862 e) {
            f44149.mo9174(c19500, "Failed to deserialize SMB2 Packet Data of {}");
            throw new C4630("Unable to deserialize SMB2 Packet Data.", e);
        }
    }
}
